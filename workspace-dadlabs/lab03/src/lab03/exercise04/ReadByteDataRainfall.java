package lab03.exercise04;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteDataRainfall 
{
	
	public static void main(String[] args) 
	{

		// 1. Declare output file 
		String sourceFile = "byteDataRainfall.txt";
		String secondSource ="byteDataRainfallS2.txt";
		System.out.println("Reading data from " + sourceFile +" and " + secondSource + "\n");

		try 
		{

			// 2. Create stream to read data			
				System.out.println("6 Days Of Data Rainfall From Selected Station\n");
				
				DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
				DataInputStream diss = new DataInputStream(new FileInputStream(secondSource));
				
				
				int no = 0;
				double rainfall = 0;
				double total = 0;
				String s = "";
				
				//Display station ID
				no = dis.readInt();
				System.out.println("Station ID : " + no + "\n");
				System.out.println("Day\t" + "Districts\t" + "Station");
				System.out.println("_____________________________________________________");
				
				
				while(dis.available() > 0)
				{
					for (int day = 1; day < 7; day++) 
					{
						s = dis.readUTF();
						rainfall = dis.readDouble();
						System.out.println("Day " + day + "\t" + s + "\t" +rainfall );
						
						total+=rainfall;
						
					}
					
					double average = 0;
					int noOfDay = 6;
					average = total/noOfDay;
					
					String av = String.format("%.1f", average);
					System.out.println("\nAvarage of selected station is " + av + "%" );
					
	
				}
				
				no = diss.readInt();
				System.out.println("\nStation ID : " + no + "\n");
				System.out.println("Day\t" + "Districts\t" + "Station");
				System.out.println("_____________________________________________________");
				while(diss.available() > 0) {
					
					for(int i = 1; i < 7; i++) {
					s = diss.readUTF();
					rainfall = diss.readDouble();
					System.out.println("Day " + i + "\t" + s + "\t" + rainfall );
					
					total +=rainfall;
					
					}
					double average2 = 0;
					int noOfDay = 6;
					average2 = total/noOfDay;
					
					String av = String.format("%.1f", average2);
					System.out.println("\nAvarage of selected station is " + av + "%" );
				}
				
				
				dis.close();
				diss.close();
			
		}catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");

	
	}
}
