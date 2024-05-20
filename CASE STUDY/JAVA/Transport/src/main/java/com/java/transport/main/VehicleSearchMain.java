package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.VehicleDaoImpl;
import com.java.transport.dao.VehiclesDao;
import com.java.transport.exception.VechileNotFoundException;
import com.java.transport.model.Vehicle;

public class VehicleSearchMain {
	public static void main(String[] args) throws VechileNotFoundException {
		int vehicleid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle id ");
		vehicleid = sc.nextInt();
		VehiclesDao dao = new VehicleDaoImpl();
		try {
			Vehicle vehicle = dao.searchByVehicleId(vehicleid);
			if(vehicle != null)
			{
				System.out.println("Vehicle found !!");
				System.out.println(vehicle);
			}
			else
			{
				throw new VechileNotFoundException("Vehicle with ID " + vehicleid +" not found.");
			}
		} catch (ClassNotFoundException | SQLException |VechileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
