import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import sensor.TemperatureSensor;
import sensorManager.TemperatureSensorManager;

public class TemperatureServer 
{
	public static void main (String[] args)
	{
		try 
		{
			//Create object name sensor Jasin from interface
			TemperatureSensor sensorJasin = new TemperatureSensorManager();
			
			// Get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			// Register interface object as remote
			rmiRegistry.rebind("SensorJasin", sensorJasin);
			
			System.out.println("Sensor Jasin is registered successfully.");
		
		}catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}

}
