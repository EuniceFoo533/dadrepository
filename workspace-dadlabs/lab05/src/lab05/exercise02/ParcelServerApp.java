package lab05.exercise02;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import parcel.Parcel;
import parcel.ParcelManager;

public class ParcelServerApp {
	
	public static void main (String[] args) 
	{
		ParcelManager parcelManager = new ParcelManager();
		
		System.out.println("Starting ParcelServerApp...");
		
		try 
		{
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			while (true) 
			{
				Socket clientSocket = serverSocket.accept();
				
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				Parcel parcel = (Parcel)ois.readObject();
				System.out.println("Processing object from client " );
				parcel = parcelManager.createParcel(parcel);
				
				ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
				oos.writeObject(parcel);
				
				ois.close();
				oos.close();
			}
		}catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}

}
