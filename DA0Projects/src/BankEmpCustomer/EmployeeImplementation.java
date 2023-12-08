package BankEmpCustomer;

import java.util.Scanner;

public class EmployeeImplementation implements EmployeeInterface {
	Scanner sc=new Scanner(System.in);
	public void insert(Employee e) {
		System.out.println("Enter the name of the customer");
		String name=sc.next();
	}
	public void update(Employee e) {
	}


	public void delete(Employee e) {
		// TODO Auto-generated method stub
		
	}
	public void view(Employee e) {
		// TODO Auto-generated method stub
		
	}

	public void choice(Employee e) {
		System.out.println("Enter your choice");
		System.out.println("1: Insert");
		System.out.println("2: Update");
		System.out.println("3: Delete");
		System.out.println("4: View");
		System.out.println("5: Exit");
		int ch=sc.nextInt();
		while(ch<=5) {
			switch(ch) {
			case 1:insert(e);
				break;
			case 2:update(e);
				break;
			case 3:delete(e);
				break;
			case 4:view(e);
				break;
			case 5:System.out.println("thank you");
				break;
				
			}
		}
		
	}

}
