package ftmk.rmi.sensor.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ftmk.rmi.sensor.TemperatureSensor;
import java.util.List;
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor{

		
		private static final long serialVersionUID = 1L;

		public TemperatureSensorManager() throws RemoteException {
			super();
		}

		@Override
		public int getTemperature() throws RemoteException {
			
			return 32;
		}
		
		@Override
		public HashMap<String, Integer> getSpecificDay() throws RemoteException
		{
			HashMap<String, Integer> specificDay = new HashMap<>();
			specificDay.put("Monday", 32);
			specificDay.put("Tuesday", 31);
			specificDay.put("Wednesday", 33);
			specificDay.put("Thursday", 35);
			specificDay.put("Friday", 36);
			specificDay.put("Saturday", 33);
			specificDay.put("Sunday", 33);
			
			return specificDay;
		}

		@Override
		public double getAverage() throws RemoteException {
			
			HashMap<String, Integer> specificDay = new HashMap<>(getSpecificDay());
			
			ArrayList<Integer> total = new ArrayList<Integer>();
			total.addAll(specificDay.values());
			
			double totalTemp = 0;
			double avg = 0;
			
			for(int i = 0; i < total.size(); i++)
			{
				totalTemp += total.get(i);
			}
			
			avg = totalTemp/ total.size();
			
			return avg;
	
		}
		

		


}
