package StudentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudInfo {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement st=null;
		Student s=null;
		StudentaFactory sf=new StudentaFactory();
		StudentInteface si=sf.createInstance();
		System.out.println("Enter number of objects to be created");
		int noOfObjects=sc.nextInt();
		for(int i=0;i<noOfObjects;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			s=new Student(id,name);
			si.add(s);
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=akshaybm");
				st=con.createStatement();
				String iQuery="insert into j2ee.students values('"+s.getName()+"',"+s.getId()+")";
				st.executeUpdate(iQuery);
				}
				catch(ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
		
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		}
//		Student[] s11=si.lis_all();  //storing all student items in s11
//		
//		for(Student s4:s11) {
//			System.out.println(s4.getId()+" "+s4.getName());
//		}
//		Student s5=si.search(2); // storing the search value in s5
//		
//		if(s5==null) {
//			System.out.println("Not found");
//		}
//		else {
//			System.out.println("Found "+s5.getId()+" "+s5.getName());
//		}
		
		
	}
}
