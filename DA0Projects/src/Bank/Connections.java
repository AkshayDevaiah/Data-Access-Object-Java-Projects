package Bank;

import java.sql.*;
import java.sql.SQLException;

public class Connections {
	public static Connection connect() {
		Connection con=null;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=akshaybm");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}