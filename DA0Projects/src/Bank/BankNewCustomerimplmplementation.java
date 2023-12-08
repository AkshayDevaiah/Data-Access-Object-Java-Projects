package Bank;

import java.sql.*;
import java.util.Scanner;

public class BankNewCustomerimplmplementation implements BankInterface{
	Connection con=null;
	PreparedStatement pstmt=null;
	Scanner sc=new Scanner(System.in);
	
	public Bank createAccount(Bank ref) {
		System.out.println("Enter the new account number to be created");
		long num=sc.nextLong();
		ref.setAccNum(num);
		System.out.println("Enter the name");
		String name=sc.next();
		Bank b1=new Bank(name);
		System.out.println("Enter the pin you want to set");
		int pin=sc.nextInt();
		b1.setPin(pin);
		
		//JDBC
		try {
		String sql="insert into bank.customer values(?,?,?,?)";
		con=Connections.connect();
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setLong(2, num);
		pstmt.setInt(3, pin);
		pstmt.setInt(4, b1.getBal());
		pstmt.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return b1;
	}
	
	@Override
	public void deposit(Bank ref) {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		bo.deposit(ref);
	}

	@Override
	public void withdraw(Bank ref) {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		bo.withdraw(ref);
		
	}

	@Override
	public void checkBalance(Bank ref) {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		bo.checkBalance(ref);
		
	}

	@Override
	public boolean updatePin(Bank ref) {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		return bo.updatePin(ref);
	}

	@Override
	public boolean validate(Bank ref) {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		return bo.validate(ref);
	}

	@Override
	public int choice() {
		BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
		return bo.choice();
		
	}

	

}
