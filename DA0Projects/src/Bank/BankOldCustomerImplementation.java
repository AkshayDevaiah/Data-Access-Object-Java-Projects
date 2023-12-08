package Bank;

import java.sql.*;

import java.util.Scanner;

public class BankOldCustomerImplementation implements BankInterface{
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public Bank createAccount(Bank ref) {
		return ref;
	}
	
	public int choice() {
		System.out.println("Enter your choice \n1: Deposit \n2: Withdraw \n3: Check Balance \n4: Update PIN \n5: Exit");
		int ch=sc.nextInt();
		return ch;
	}
	
	public void deposit(Bank ref){
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		//JDBC
		int bals=0;
		try {
			String sql="select bal from bank.customer where num=?";
			con=Connections.connect();
			pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, ref.getAccNum());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				 bals=rs.getInt("bal");	 
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		//JAVA
		try {
			if(amount>10000) {
				throw new MaxDepositException();
			}
			else if(amount<1) {
				throw new MinDepositException();
			}
			else {
				amount+=ref.getBal();
				ref.setBal(amount);
				
				//JDBC
				String sql="update bank.customer set bal=bal+? where num=?";
				con=Connections.connect();
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,amount);
				pstmt.setLong(2, ref.getAccNum());
				pstmt.executeUpdate();
			}
		}
		catch(MaxDepositException e) {
			System.out.println(e.getMessage());
		}
		catch(MinDepositException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void withdraw(Bank ref) {
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		int bals=0;
		try {
			String sql="select bal from bank.customer where num=?";
			con=Connections.connect();
			pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, ref.getAccNum());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				 bals=rs.getInt("bal");	 
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			if(amount<100) {
				throw new MinWithdrawException();
			}
			else if(amount>bals) {
				throw new InvalidAmountException();
			}
			else {
				int a=ref.getBal()-amount;
				ref.setBal(a);
				
				//JDBC
				String sql="update bank.customer set bal=bal-? where num=?";
				con=Connections.connect();
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,amount);
				pstmt.setLong(2, ref.getAccNum());
				pstmt.executeUpdate();
			}
		}
		catch(MinWithdrawException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void checkBalance(Bank ref) {
//		System.out.println("Name: "+ref.getAccName());
//		System.out.println("Number: "+ref.getAccNum());
//		System.out.println("Balance "+ ref.getBal());
		
		//JDBC
		try {
		String sql="select * from bank.customer where num=?";
		con=Connections.connect();
		pstmt=con.prepareStatement(sql);
		pstmt.setLong(1, ref.getAccNum());
		rs=pstmt.executeQuery();
		System.out.println(" -----Bank Details of the customer-----");
		while(rs.next()) {
			String name=rs.getString(1);
			long num=rs.getLong(2);
			int pin=rs.getInt(3);
			long bal=rs.getLong(4);
			System.out.println("Name: "+name+"\nNumber: "+num+"\nPin: "+pin+"\nBalance: "+bal);
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean updatePin(Bank ref) {
		System.out.println("Enter Account Number");
		long n=sc.nextLong();
		try {
			if(n==ref.getAccNum()) {
				System.out.println("Enter old pin");
				int p=sc.nextInt();
				if(p==ref.getPin()) {
					System.out.println("Enter new pin");
					int np=sc.nextInt();
					ref.setPin(np);
					
					//JDBC
					String sql="update bank.customer set pin=? where num=?";
					con=Connections.connect();
					pstmt=con.prepareStatement(sql);
					pstmt.setInt(1,np);
					pstmt.setLong(2, ref.getAccNum());
					pstmt.executeUpdate();
					
					return validate(ref);
				}
				else {
					throw new InvalidOldPinException();
				}
			}
			else {
				throw new InvalidAccountException();
			}
		}
		catch(InvalidOldPinException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean validate(Bank ref) {
		boolean a=false;
		int pins=0;
		int count=3;
		while(count>0) {
			System.out.println("Enter the account Number");
			long num=sc.nextLong();
			System.out.println("Enter the pin");
			int pin=sc.nextInt();
			
			//JDBC
			try {
			String sql="select pin from bank.customer where num=?";
			con=Connections.connect();
			pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				 pins=rs.getInt("pin"); 
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			if(pin==pins) {
				ref.setAccNum(num);
				a=true;
				break;
			}
			else {
				try {
					count--;
					throw new InvalidPinException();
				}
				catch(InvalidPinException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
		return a;
	}
	
	}

	