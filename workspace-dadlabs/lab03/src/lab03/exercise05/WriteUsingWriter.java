package lab03.exercise05;
import java.io.Writer;
import java.io.FileWriter;

public class WriteUsingWriter {
	
	public static void main(String[] args) {
		
		String note = "test.txt";
		String district = "Alor Gajah";
		String station1 = "Durian Tunggal";
		String station2 = "Ladang Lendu";
		double rainfall[] = { 3.0, -9999.0, -9999.0, 94.0, 1.0, 0.0};
		double rainfallS2[] = {3.0, 6.0, -9999.0, -9999.0, 145.0, 0.0 };
		double totalS1 = 0;
		double totalS2 = 0;
		
		try {
			Writer w = new FileWriter(note);
			w.write("\nStation id:\t" + 2222002 + "\n");
			w.write("Districts:\t" + district + "\n");
			w.write("Station Name:\t" + station1 + "\n");
			
			for(int i = 0; i < rainfall.length; i++) {
				
				w.write("Day " + (i+1) + "\t" + rainfall[i] + "\n");
				totalS1 += rainfall[i];
			
			}
			double average = 0;
			average = totalS1 / 6;
			String av = String.format("%.1f", average);
			w.write("\nAverage for selected startion is " + av + "%" );
			
			w.write("\nStation id:\t" + 2321006 + "\n");
			w.write("Districts:\t" + district + "\n");
			w.write("Station Name:\t" + station2 + "\n");
			
			for(int i = 0; i < rainfallS2.length; i++) {
				
				w.write("Day " + (i+1) + "\t" + rainfallS2[i] +"\n");
				totalS2 += rainfallS2[i];
			}
			double average2;
			average2 = totalS2 / 6;
			String av2 = String.format("%.1f", average2);
			w.write("\nAverage for selected startion is " + av2 + "%" );
			
			
			
			w.flush();
			w.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("The data has been succesfully created ! Checkout " + note);
	}

}
