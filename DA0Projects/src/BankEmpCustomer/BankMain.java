package BankEmpCustomer;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=null;
		Customer c=null;
		EmployeeInterface ei=null;
		CustomerInterface ci=null;
		System.out.println("Enter your choice");
		System.out.println("1: Employee login");
		System.out.println("2: Customer login");
		System.out.println("3: Exit");
		int ch=sc.nextInt();
	if(ch<=3){
		switch(ch) {
		case 1:ei=BankFactory.empLogic();
			   ei.choice(e);
			   break;
		case 2:ci=BankFactory.customerLogic();
			   ci.choice(c);
			   break;
		case 3:System.out.println("Thank You");
			   break;
		
		}
	}
	}	
}
