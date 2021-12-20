package lab08;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class ThreadPoolDemo 
{
	
		public static void main(String[] args) 
		{
		
			SimpleArray sharedSimpleArray = new SimpleArray(6);
			
			Runnable arrayWriter1 = new ArrayWriter(1,sharedSimpleArray);
			Runnable arrayWriter2 = new ArrayWriter(11,sharedSimpleArray);
		 	
			//Create thread pool
			ExecutorService printExecutorsService = Executors.newFixedThreadPool(3);
			 
			//Thread pool to be execute
			printExecutorsService.execute(arrayWriter2);
			printExecutorsService.execute(arrayWriter1);
			
			printExecutorsService.shutdown();
			
			try 
			{
				
				// Wait for 1 minute for both writers to finish executing
				boolean endFlag = printExecutorsService.awaitTermination(1, TimeUnit.MINUTES);
				
				if (endFlag) 
				{
					// Print content of shared array
					System.out.println("\nContent of SimpleArray");
					System.out.println(sharedSimpleArray.toString());
				}
				else 
				{
					System.out.println("Timed out while waiting for tasks to finish");
				}
			
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
		
	
		
	
	
}
