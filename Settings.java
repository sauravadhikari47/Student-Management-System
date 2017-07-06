import java.awt.*;
import java.sql.*;
public class Settings {
		public static Connection getDBCOnnection() {
		Connection con;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			return con;
			
		}catch(Exception e){
			return null;
		}
		
	}

}
