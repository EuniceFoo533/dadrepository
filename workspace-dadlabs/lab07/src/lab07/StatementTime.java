package lab07;

public class StatementTime extends Thread
{
	public void printTime()
	{
		for(int counter = 0; counter < 5; counter++)
		{
			System.out.println(java.time.LocalTime.now());
		}
	}
	
	public void run()
	{
		printTime();
	}

}
