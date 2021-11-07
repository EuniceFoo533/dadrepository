package lab05.exercise03;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import parcel.Parcel;
import parcel.ParcelManager;
import payment.Payment;
import payment.PaymentManager;
import staff.Staff;

public class ServerApp {
	
	public static void main (String[] args) 
	{
		ParcelManager parcelManager = new ParcelManager();
		PaymentManager paymentManager = new PaymentManager();
		
		System.out.println("Starting ParcelServerApp...");
		
		try 
		{
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			while (true) 
			{
				Socket clientSocket = serverSocket.accept();
				
				//Read object
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				// Read object from class Parcel and Payment
				Parcel parcel = (Parcel)ois.readObject();
				Payment payment = (Payment)ois.readObject();
			
				
				System.out.println("Processing object from client " );
				parcel = parcelManager.createParcel(parcel);
				payment = paymentManager.createPayment(payment);
			
				
				ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
				oos.writeObject(parcel);
				oos.writeObject(payment);
			
				
				ois.close();
				oos.close();
			}
		}catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}

}
