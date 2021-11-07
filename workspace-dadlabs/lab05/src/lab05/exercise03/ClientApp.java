package lab05.exercise03;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

import parcel.Parcel;
import payment.Payment;
import staff.Staff;

public class ClientApp {
	
	public static void main(String args[]) 
	{
		System.out.println("Lauching ParcelClientApp program");
		
		Parcel parcel = new Parcel();
		parcel.setWeight(0.05);
		
		Payment payment = new Payment();
		payment.setPaymentID(1001);
		
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		payment.setTransactionDate(ts);
		
		// staff = new Staff();
		String name = "Jane";
		payment.setRecordedBy(name);
		
		
		
		try 
		{
			Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
			
			ObjectOutputStream oos = new ObjectOutputStream (socket.getOutputStream());
			oos.writeObject(parcel);
			oos.writeObject(payment);
		
			
			System.out.println("Sending " + parcel.getWeight() + " kg" );
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Parcel processedParcel = (Parcel)ois.readObject();
			Payment processedPayment = (Payment)ois.readObject();
		
			
			System.out.println("Weight : " + processedParcel.getWeight() + "kg");
			System.out.print("Price : RM " );
			System.out.printf("%.2f", processedParcel.getPrice());
			System.out.println("\n\nPayment ID : " + processedPayment.getPaymentID());
			System.out.println("Payment Date & Time : " + processedPayment.getTransactionDate());
			System.out.println("Staff Name : " + processedPayment.getRecordedBy());
			ois.close();
			oos.close();
			socket.close();
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}

}
