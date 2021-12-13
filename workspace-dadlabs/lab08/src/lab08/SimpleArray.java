package lab08;
import java.security.SecureRandom;

public class SimpleArray 
{
	//final means cannot be override
	private final int sharedData[];
	private int currentIndex;
	private SecureRandom generator;
	
	public SimpleArray(int size) 
	{
		sharedData = new int[size];
	}
	
	public void add(int value) 
	{
		value = sharedData[currentIndex];
		try 
		{
			Thread.sleep(500);
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		generator.nextInt();
		
	
		
	}
	
	public String toString() 
	{
		return String.valueOf(sharedData);
	}
	

}
