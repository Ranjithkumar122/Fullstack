package Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getcon {
	static Connection con=null;
	static String username="root";
	static String url="jdbc:mysql://localhost:3306/tap";
	static String password="1234";
	public static Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
			con=DriverManager.getConnection(url,username,password);
			return con;
	}
}
