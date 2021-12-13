package lab08;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import lab08.Runnable;


public class ThreadPoolDemo {
	
	public static void main(String[] args) 
	{
	
	SimpleArray simpleArray = new SimpleArray(6);
	ArrayWriter arrayWriter1 = new ArrayWriter(1,simpleArray);
	ArrayWriter arrayWriter2 = new ArrayWriter(11,simpleArray);
	
	
		
		
		ExecutorService printExecutorsService = Executors.newFixedThreadPool(2);
		
		Runnable numberPrinter1 = new ArrayWriter(1, simpleArray);
		Runnable numberPrinter2 = new ArrayWriter(11, simpleArray);
	
		
	
	}
	
		public void shutDown(ExecutorService executorService) 
		{
			executorService.shutdown();
			
			try {
				boolean endFlag = executorService.awaitTermination(1,TimeUnit.MINUTES);
				
				if(endFlag) 
				{
					System.out.println("\nContent ofSimple Array");
					System.out.println(sharedSimpleArray);
				}
				
				else 
				{
					System.out.println("Timed out while waitng for task to finish");
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	
	
}
