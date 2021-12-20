package lab08;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class SimpleArray extends Thread
{
	//final means cannot be override
	private final int sharedData[];
	private int currentIndex;
	private SecureRandom generator;
	
	//Create array based on specific size
	public SimpleArray(int size) 
	{
		sharedData = new int[size];
	}
	
	
	//Assign value into current index
	synchronized public void add(int value) 
	{
		
		// Value of current index updated
		sharedData[currentIndex] = value;
		
		try 
		{
			Thread.sleep(500);
			
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		SecureRandom rand = new SecureRandom();
		int randomNumber = rand.nextInt();
		
		
		//Display name of thread
		Thread currentThread = Thread.currentThread();
		
		//Display value of next index
		int nextIndex = currentIndex + 1;
		
		System.out.println(currentThread.getName() + 
				" wrote " + value + " to element " + currentIndex +
				"\nNext index to write is " + nextIndex);
		currentIndex++;
	}
	
	public String toString() 
	{
		
		return String.valueOf(sharedData);
	}

}
