package Lights;

import java.util.Scanner;

public class ledMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter light type");
		String l=sc.next();
		LightInterface lh= LightFactory.getLight(l);
		if(lh!=null) {
			lh.swithOn();
			lh.switchOff();
	}
		sc.close();
	}
	}
