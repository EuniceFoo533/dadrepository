package sensor;

import java.util.HashMap;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensor extends Remote{
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;
	
	public HashMap<String, Integer> getSpecificDay() throws RemoteException;
	

	public double getAverage() throws RemoteException;
}