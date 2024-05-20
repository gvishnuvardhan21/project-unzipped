package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.VehicleDaoImpl;
import com.java.transport.dao.VehiclesDao;
import com.java.transport.exception.VechileNotFoundException;
import com.java.transport.model.Vehicle;

public class VehicleUpdateMain {
	public static void main(String[] args)  {
		Scanner sr = new Scanner(System.in);
		VehiclesDao dao = new VehicleDaoImpl();
		
		System.out.println("enter vehicle id in which data need to be updated ..");
		int vehicleid = sr.nextInt();
		sr.nextLine();
		Vehicle vehicle;
		try {
			vehicle = dao.searchByVehicleId(vehicleid);
			if(vehicle != null)
			{
				System.out.println("Enter the model name: ");
				String model = sr.nextLine();
				System.out.println("Enter the capacity :");
				double capacity = sr.nextDouble();
				sr.nextLine();
				System.out.println("enter the type :");
				String type =  sr.nextLine();
				System.out.println("Enter the status :");
				String status = sr.nextLine();
				
				vehicle.setModel(model);
				vehicle.setCapacity(capacity);
				vehicle.setType(type);
				vehicle.setStatus(status);
				dao.UpdateVehicle(vehicle);
				System.out.println("data is updated ..");
			
				} 
			else
			throw new VechileNotFoundException("Vehicle detail cannot be updated !");
		}
			
			
			catch (ClassNotFoundException | SQLException |VechileNotFoundException e) {
			// TODO Auto-generated catch block
				System.out.println(e.getMessage());
		}
		  
		
		
}
}

