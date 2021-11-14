

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

import sensor.TemperatureSensor;


public class TemperatureClient 
{
	public static void main (String[] args) 
	{
		try {
			
			// Get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			// Look-up for the remote object
			TemperatureSensor remoteSensorJasin = (TemperatureSensor) rmiRegistry.lookup("SensorJasin");
			
			// Invoke method from the remote object
			int currentTemperature = remoteSensorJasin.getTemperature();
			HashMap<String, Integer> specificDayWithTemperature = remoteSensorJasin.getSpecificDay();
			double avg = remoteSensorJasin.getAverage();
			
			System.out.println("Current temperature in Jasin Weather Station is " + currentTemperature + " Celcius");
			System.out.println("\nThe daily temperature of Ayer Keroh Weather Station :\n" + specificDayWithTemperature);
			System.out.println("\nThe average temperature of Ayer Keroh Weather Station is :" + avg);
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
