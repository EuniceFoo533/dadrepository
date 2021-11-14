import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;

public class TemperatureClientRMI {
	
	public static void main (String[] args) 
	{
		try {
			
			// Get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			// Look-up for the remote object
			TemperatureSensor remoteSensorAyerKeroh = (TemperatureSensor) rmiRegistry.lookup("SensorAyerKeroh");
			
			// Invoke method from the remote object
			int currentTemperature = remoteSensorAyerKeroh.getTemperature();
			HashMap<String, Integer> specificDayWithTemperature = remoteSensorAyerKeroh.getSpecificDay();
			double avg = remoteSensorAyerKeroh.getAverage();
			
			System.out.println("Current temperature in AyerKeroh is " + currentTemperature + " Celcius");
			System.out.println("The temperature of this week is :" + specificDayWithTemperature);
			System.out.println("The average temperature of this week is :" + avg);
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
