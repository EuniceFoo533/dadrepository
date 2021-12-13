package exercise03;
import exercise02.ArrayElement;
import exercise02.RandomArray;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Runnable arr1 = new ArrayElement();
		Runnable arr2 = new RandomArray();
		
		Thread num1 = new Thread(arr1);
		Thread num2 = new Thread(arr2);
		Thread num3 = new Thread();
		
		num1.start();
		try 
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		num2.start();
		
		
		
	}
}
