package Main;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	public static Connection getConnection() {

		Connection con = null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/currency","root",""); 
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}