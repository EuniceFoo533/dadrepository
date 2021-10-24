package lab03.exercise05;
import java.io.Reader;
import java.io.FileReader;

public class ReadUsingReader {
	
	public static void main (String []args) 
	{ 
	
		String file = "test.txt";
		char[]array = new char[500];
		
		try {
			Reader r = new FileReader(file);
			System.out.println("Reading from file " + file + "\n");
			
			r.read(array);
			System.out.println(array);
			
			
			r.close();
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
}
