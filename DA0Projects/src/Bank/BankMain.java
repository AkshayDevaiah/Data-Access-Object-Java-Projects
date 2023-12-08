package Bank;

import java.sql.*;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Bank");
		System.out.println("--------");
		
		System.out.println("Enter your choice\n1: New User\n2: Existing user");
		int choice=sc.nextInt();
		BankInterface bi=null;
		if(choice==1 || choice==2) {
		switch(choice) {
		case 1: Bank ref=new Bank();
				BankNewCustomerimplmplementation bn=new BankNewCustomerimplmplementation();
				Bank b=bn.createAccount(ref);
				bi=BankFactory.createInstance(choice);
			    break;
		case 2: Bank refs=new Bank();
			    BankOldCustomerImplementation bo=new BankOldCustomerImplementation();
			    Bank b1=bo.createAccount(refs);	
				bi=BankFactory.createInstance(choice);
			    break;
	   default:System.out.println("Wrong choice");
		}
		}	
		Bank ref=new Bank();
		boolean z=bi.validate(ref);
		if(z) {
			int ch=0;
			while(ch<=4 && z==true) {
				ch=bi.choice();
				switch(ch) {
				case 1:bi.deposit(ref);
				break;
				case 2:bi.withdraw(ref);
				break;
				case 3:bi.checkBalance(ref);
				break;
				case 4:z=bi.updatePin(ref);
				break;
				}
			}
			
		}
		if(!z) {
			System.out.println("contact the bank");
		}
		System.out.println("----Thank you ---Visit Again----");
		sc.close();

	}

}
