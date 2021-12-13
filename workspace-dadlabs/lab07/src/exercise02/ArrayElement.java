package exercise02;

import java.util.Random;
import java.util.*;

//Runnable is an interface
public class ArrayElement implements Runnable
{
	String[] word= {"It", "is", "recommended", "to", "use", "Calendar", "class"};
	
		public void printArray()
		{
			String strArr = Arrays.toString(word);
			try 
			{
				for(int counter = 0; counter < 10; counter++) 
				{
					System.out.println(strArr + "->"+ counter);
					
				}
				
			}catch(Exception e) {
				System.out.println("Exception: "+ e);
			}
			
			
		}

 
		
		// Is the override method from interface Runnable
		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
			printArray();
		 
			
		}
		
	
	
	

}
