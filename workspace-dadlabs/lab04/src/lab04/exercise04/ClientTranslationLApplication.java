package lab04.exercise04;

import java.net.*;
import java.io.*;

public class ClientTranslationLApplication {
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket(InetAddress.getLocalHost(),4228);
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String text = bufferedReader.readLine();
			System.out.println(text);
			
			bufferedReader.close();
			socket.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
