package Hotel;

public class Hotel {
	private int[][] order=new int[5][2];
	String[] name= {"Idly","Dosa","Gobi","Puri","Rice"};
	Hotel(){
		order[0][0]=35;
		order[1][0]=50;   
		order[2][0]=55;
		order[3][0]=40;
		order[4][0]=60;
	}
	int getPrice(int i) {
		return order[i][0];
	}
	void setQuantity(int i,int q) {
		order[i][1]=q;
	}
	int getQuantity(int i) {
		return order[i][1];
	}
}
