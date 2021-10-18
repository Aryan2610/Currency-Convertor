package Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyConvertDAO {

	public static double checkRate(int ID) {

		double rate = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select rate from rates where ID="+ID);
			ResultSet rs = ps.executeQuery();
			rs.next();
			rate = rs.getDouble("rate");
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return rate;
	}
}
