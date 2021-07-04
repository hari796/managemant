package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://192.168.33.15:3306/activity","root","admin123");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
