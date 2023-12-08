package Hotel;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hotel h1=new Hotel();
		HotelInterface hi=HotelFactory.createInstance();
		System.out.println("-----Welcome to Ranji Hotel----");
		System.out.println("Enter your choice");
		hi.menu(h1);
		int ch=sc.nextInt();
		while(ch<6) {
			hi.takeOrder(h1, ch-1);
			hi.menu(h1);
			ch=sc.nextInt();
		}
		hi.bill(h1);
	}
}
