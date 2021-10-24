package lab03.exercise04;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class WriteByteDataRainfall {
	
	public static void main (String[] args) {
		
		String targetStorage = "byteDataRainfall.txt";
		String target = "byteDataRainfallS2.txt";
		
		int id = 2222002;
		int idS2 = 2321006;
		String district = "Alor Gajah";
		double rainfall[] = { 3.0, -9999.0, -9999.0, 94.0, 1.0, 0.0};
		double rainfallS2[] = {3.0, 6.0, -9999.0, -9999.0, 145.0, 0.0 };
			
		try {
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(targetStorage));
				DataOutputStream doss = new DataOutputStream(new FileOutputStream(target));
				
				dos.writeInt(id);
				doss.writeInt(idS2);
				
				
					
				for(int i = 0; i < rainfall.length; i++) {
					dos.writeUTF(district + "\tDurian Tunggal");	
					dos.writeDouble(rainfall[i]);
					
				}
				
				for(int i = 0; i < rainfallS2.length; i++) {
					doss.writeUTF(district + "\tLadang Lendu");	
					doss.writeDouble(rainfallS2[i]);
					
				}
				
				
				dos.flush();
				dos.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Data has been created succesfully! Checkout the " + targetStorage + " and " + target + ".");
	}
		
		

}
