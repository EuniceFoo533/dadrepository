package lab07;

public class MultiTimeApp 
{
	public static void main(String[] args)
	{
		// Thread object equal to class StatementTime
		
		Thread printerThread1 = new StatementTime();
		Thread printerThread2 = new StatementTime();
		
		// Execute two objects of Thread
		printerThread2.start();
		printerThread1.start();
	}

}
