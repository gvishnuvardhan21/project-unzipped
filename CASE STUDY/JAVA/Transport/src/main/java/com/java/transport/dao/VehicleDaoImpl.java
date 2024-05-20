package com.java.transport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.transport.model.Vehicle;
import com.java.transport.util.DBConnUtil;
import com.java.transport.util.DBPropertyUtil;

public class VehicleDaoImpl implements VehiclesDao{
 
	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Vehicle> ShowVehicleDao() throws  SQLException, ClassNotFoundException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from vehicles";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		while(rs.next()) {
			vehicle = new Vehicle();
			vehicle.setVehicleId(rs.getInt("VehicleId"));
			vehicle.setModel(rs.getString("Model"));
			vehicle.setCapacity(rs.getDouble("Capacity"));
			vehicle.setType(rs.getString("Type"));
			vehicle.setStatus(rs.getString("Status"));
			vehicleList.add(vehicle);
		}
		return vehicleList;
	}

	@Override
	public Vehicle searchByVehicleId(int VechileId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from vehicles where vehicleid = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, VechileId);
		ResultSet rs = pst.executeQuery();
		Vehicle  vehicle = null;
		if(rs.next())
		{
			vehicle = new Vehicle();
			vehicle.setVehicleId(rs.getInt("VehicleId"));
			vehicle.setModel(rs.getString("Model"));
			vehicle.setCapacity(rs.getDouble("Capacity"));
			vehicle.setType(rs.getString("Type"));
			vehicle.setStatus(rs.getString("Status"));
		}
		return vehicle;
	}

	@Override
	public boolean InsertVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		 String connStr = DBPropertyUtil.connectionString("db");
	        connection = DBConnUtil.getConnection(connStr);
	        String cmd = "insert into vehicles (model,capacity,type,status) values(?,?,?,?)";
	        pst = connection.prepareStatement(cmd);
	        pst.setString(1, vehicle.getModel());
	        pst.setDouble(2, vehicle.getCapacity());
	        pst.setString(3, vehicle.getType());
	        pst.setString(4, vehicle.getStatus());
	        int rowsAffected = pst.executeUpdate();
	        return rowsAffected > 0;
	}

	@Override
	public boolean UpdateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		 String connStr = DBPropertyUtil.connectionString("db");
	     connection = DBConnUtil.getConnection(connStr);
	     String cmd = "update vehicles set model=?, capacity=?,type=?,status=? where vehicleid = ?";
	     pst = connection.prepareStatement(cmd);
	     pst.setString(1, vehicle.getModel());
	     pst.setDouble(2, vehicle.getCapacity());
	     pst.setString(3, vehicle.getType());
	     pst.setString(4, vehicle.getStatus());
	     pst.setInt(5, vehicle.getVehicleId());
	     int rowsAffected = pst.executeUpdate();
	     return rowsAffected >0;
	     
	}

	@Override
	public boolean DeleteVehicle(int VehicleId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
	     connection = DBConnUtil.getConnection(connStr);
	     String cmd = "delete from vehicles where vehicleid = ?";
	     pst = connection.prepareStatement(cmd);
	     pst.setInt(1, VehicleId);	
	     int rowsAffected = pst.executeUpdate();
	     return rowsAffected>0;
	}
}
