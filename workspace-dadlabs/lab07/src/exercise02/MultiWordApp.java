package exercise02;

public class MultiWordApp
{
	public static void main(String[] args)
	{
		
		Runnable arr1 = new ArrayElement();	
		Runnable arr2 = new RandomArray();	
		
		Thread text = new Thread(arr1);
		Thread word1 = new Thread(arr2);
		
		text.start();
		System.out.println("\n");
		word1.start();
	
		
	}

}
