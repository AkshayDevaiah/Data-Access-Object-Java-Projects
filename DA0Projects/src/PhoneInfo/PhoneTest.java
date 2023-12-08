package PhoneInfo;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone brand");
		String p=sc.next();
		phoneInterface ph= phoneFactory.getPhone(p);
		if(ph!=null) {
			ph.getName();
			ph.getPrice();
		}
		sc.close();
	}
}
