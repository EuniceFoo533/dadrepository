package lab08;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ArrayWriter extends Thread implements Runnable
{
	private int startValue;
	private SimpleArray sharedSimpleArray;
	
	
	
	
	public ArrayWriter(int value, SimpleArray simpleArray) 
	{
		this.startValue = value;
		this.sharedSimpleArray = simpleArray;
	}

	@Override
	// method name must same with the Interface
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 3; i++) 
		{
			sharedSimpleArray.add(startValue);
			startValue++;
			sharedSimpleArray.toString();
		}
		
		
	}

}
