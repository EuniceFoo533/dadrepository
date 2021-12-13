package exercise02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//Runnable is an interface
public class RandomArray implements Runnable
{
		String[] word= {"It", "is", "recommended", "to", "use", "Calendar", "class"};
		
		public void randomArray()
		{
			 	List<String> list = Arrays.asList(word);
				Collections.shuffle(list);
				System.out.println(Arrays.toString(word));
 
		}
		
		// Is the override method from interface Runnable
		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
			randomArray();
			
		}
		
	
	
	

}
