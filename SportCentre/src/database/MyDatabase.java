package database;

import java.sql.*;
  
public class MyDatabase 
{
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport_centre", "root", "");
			System.out.println("Connected");
			return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return null;
	}
}