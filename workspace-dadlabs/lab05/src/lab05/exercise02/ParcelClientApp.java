package lab05.exercise02;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import parcel.Parcel;

public class ParcelClientApp {
	
	public static void main(String args[]) 
	{
		System.out.println("Lauching ParcelClientApp program");
		
		Parcel parcel = new Parcel();
		parcel.setWeight(0.05);
		
		
		try 
		{
			Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
			
			ObjectOutputStream oos = new ObjectOutputStream (socket.getOutputStream());
			oos.writeObject(parcel);
			
			System.out.println("Sending " + parcel.getWeight() + " kg" );
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Parcel processedParcel = (Parcel)ois.readObject();
			
			System.out.println("Weight : " + processedParcel.getWeight() + "kg");
			System.out.print("Price : RM " );
			System.out.printf("%.2f", processedParcel.getPrice());
			
			ois.close();
			oos.close();
			socket.close();
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}

}
