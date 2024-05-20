package com.java.transport.main;

import java.sql.SQLException;
import com.java.transport.exception.*;
import java.util.Scanner;

import com.java.transport.dao.VehicleDaoImpl;
import com.java.transport.dao.VehiclesDao;

public class VehicleDeleteMain {
	public static void main(String[] args) throws VechileNotFoundException {
		VehiclesDao dao = new VehicleDaoImpl();
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter the vehicle id that record need to be deleted :");
		
		int vehicleid = sr.nextInt();
		
		try {
			if(dao.DeleteVehicle(vehicleid))
			{
				System.out.println("data deleted !!");
			}
			else
			{
				throw new VechileNotFoundException("Vehicle with ID " + vehicleid +" not found.");
			}
		} catch (ClassNotFoundException | SQLException | VechileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());

		}
		
}
}
