package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.transport.model.Vehicle;

public interface VehiclesDao {
	
	List<Vehicle> ShowVehicleDao() throws ClassNotFoundException, SQLException;
	Vehicle searchByVehicleId(int VechileId) throws ClassNotFoundException, SQLException;
	boolean InsertVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	boolean UpdateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	boolean DeleteVehicle(int VehicleId) throws ClassNotFoundException, SQLException;
}
