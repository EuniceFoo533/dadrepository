package server;

import java.sql.*;
import parcel.ParcelManager;

public class DataGenerator 
{
	int parcel_ID = 0;
	int sender_ID = 0;
	int receiver_ID = 0;
	
	ParcelManager pm = new ParcelManager();
	Connection conn = pm.getConnection();
	
	public int getParcelID()
	{
		try
		{
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT MAX(parcel_id) FROM parcel");
			
			res.next();
			int id = res.getInt("MAX(parcel_id)");
			parcel_ID = id;
			
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}
		
		return parcel_ID;
	}
	
	
	
	/*public int getSenderID()
	{
		try
		{
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT MAX(sender_id) FROM sender AS sender_id");
			
			res.next();
			int id = res.getInt("MAX(sender_id)");
			sender_ID = id;
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}
		
		return sender_ID;
	}
	
	public int getReceiverID()
	{
		try
		{
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT MAX(r_id) FROM receiver");
			
			res.next();
			int id = res.getInt("MAX(r_id)");
			receiver_ID = id;
			
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}
		
		return receiver_ID;
	}*/
}
