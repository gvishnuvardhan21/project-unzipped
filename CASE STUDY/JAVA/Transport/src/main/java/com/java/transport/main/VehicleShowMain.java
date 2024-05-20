package com.java.transport.main;

import java.sql.SQLException;
import java.util.List;

import com.java.transport.dao.VehicleDaoImpl;
import com.java.transport.dao.VehiclesDao;
import com.java.transport.model.Vehicle;

public class VehicleShowMain {
	public static void main(String[] args) {
		VehiclesDao dao = new VehicleDaoImpl();
		try {
			List<Vehicle> vehicleList = dao.ShowVehicleDao();
			for (Vehicle vehicle : vehicleList) {
				System.out.println(vehicle);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
