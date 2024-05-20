package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.VehicleDaoImpl;
import com.java.transport.dao.VehiclesDao;
import com.java.transport.model.Vehicle;

public class VehicleInsertMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		VehiclesDao dao = new VehicleDaoImpl();
		
		System.out.println("Enter Vehicle details to be added !!");
		System.out.println("enter Model name: ");
		String model = sc.nextLine();
		System.out.println("enter Capacity :");
		double Capacity = sc.nextDouble();
		sc.nextLine();
		System.out.println("enter type(Truck, Van, Bus) :");
		String type =sc.nextLine();
		System.out.println("enter Status(Available, On Trip, Maintenance) :");
		String status = sc.nextLine();
		
		Vehicle vehicle = new Vehicle(0,model,Capacity,type,status);
		
		if(dao.InsertVehicle(vehicle))
		{
			System.out.println("inserted !!");
		}
		else
			System.out.println("can't insert");
		
	}
}
