package Hotel;

import java.util.Scanner;

public class HotelImplementation implements HotelInterface{


	public void menu(Hotel h) {
		for(int i=0;i<5;i++) {
			System.out.println(i+1 +". "+h.name[i]+" "+h.getPrice(i));
		}
		System.out.println("Press 6 for bill");
		
	}
	
	public void bill(Hotel h) {
		System.out.println("Items     Price     Quantity     Total");
		System.out.println("--------------------------------------");
		int s=0;
		for(int i=0;i<5;i++) {
			if(h.getQuantity(i)>0) {
				s++;
				System.out.println(s+"."+h.name[i]+"    "+h.getPrice(i)+"           "+h.getQuantity(i)+"            "+h.getPrice(i)*h.getQuantity(i));
			}
		}
		System.out.println("--------------------------------------");
		int total=0;
		float cost=0;
		for(int i=0;i<s;i++) {
			total+=h.getPrice(i)*h.getQuantity(i);
			System.out.println("Total "+total);
			System.out.println("GST:18%");	
			System.out.println();
			cost=total+total*0.18f;
			System.out.println("Final Bill "+cost);
			System.out.println("--------------------------------------");
		}
	
		
	}

	public void takeOrder(Hotel h, int c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of plates");
		try {
			int q=sc.nextInt();
			if(q<1) {
				throw new NoOfPlatesException();
			}
			else {
				int z=h.getQuantity(c);
				z=z+q;
				h.setQuantity(c, z);
			}
		}
		catch(NoOfPlatesException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	
}
