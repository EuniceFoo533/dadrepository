package lab04.exercise03;
import java.net.*;
import java.io.*;

public class ServerTranslationApplication {

	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		
		try {
			int portNo = 4228;
			serverSocket = new ServerSocket(portNo);
			
			String text1 = "Good Afternoon";
			System.out.println("Waiting for request");
			
			while(true) {
				
				Socket clientSocket = serverSocket.accept();
				
				DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
				
				outputStream.writeUTF(text1);
				
				clientSocket.close();
			}
				
		}catch (IOException ioe) {
			
			if(serverSocket !=null) 
				serverSocket.close();
			
			ioe.printStackTrace();
		}
			
	}

}
