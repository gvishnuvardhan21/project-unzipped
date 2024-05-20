package com.java.transport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.java.transport.model.Trip;
import com.java.transport.util.DBConnUtil;
import com.java.transport.util.DBPropertyUtil;

public class TripDaoImpl implements TripDao {

	 Connection connection;
	 PreparedStatement pst;
		
		@Override	
	public boolean scheduleTrip(int vehicleId, int routeId, String departureDate, String arrivalDate) throws ClassNotFoundException, SQLException {
	
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "INSERT INTO trips (vehicleid, routeid, departuredate, arrivaldate) VALUES (?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, vehicleId);
		pst.setInt(2, routeId);
		pst.setString(3, departureDate);
		pst.setString(4, arrivalDate);
		
		int	rowsAffected = pst.executeUpdate();
		return rowsAffected>0;
	}

		@Override
		public boolean cancelTrip(int tripid) throws ClassNotFoundException, SQLException {
			String connStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(connStr);
			
			String cmd= "delete from trips where trip_id=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, tripid);
			int rowsAffected = pst.executeUpdate();
			return rowsAffected>0;
		}

		@Override
		public boolean bookTrip(int tripid, int passengerid, String bookingdate) throws SQLException, ClassNotFoundException
		{
			String connStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(connStr);
			
			String cmd = "INSERT INTO bookings (trip_id, passengerid, bookingdate) VALUES (?, ?, ?)";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, tripid);
			pst.setInt(2, passengerid);
			pst.setString(3, bookingdate);
			
			int rowsAffected = pst.executeUpdate();
			return rowsAffected>0;
		}

		@Override
		public boolean cancelBooking(int bookingid) throws ClassNotFoundException, SQLException {
			String connStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(connStr);
			
			String cmd = "delete from bookings where bookingid = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, bookingid);
			
			int rowsaffected = pst.executeUpdate();
			return rowsaffected>0;
		}

		@Override
		public boolean allocateDriver(int tripId, int driverId) throws ClassNotFoundException, SQLException {
			String connStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(connStr);
			
			String cmd = "update trips set driverid= ? where trip_id = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, driverId);
			pst.setInt(2, tripId);
			
			int rowsaffected = pst.executeUpdate();
			return rowsaffected>0;
		}

		@Override
		public boolean deallocateDriver(int tripId) throws SQLException, ClassNotFoundException {
			String connStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(connStr);
			
			String cmd = "delete from driver where tripid = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, tripId);
			
			int rowsaffected = pst.executeUpdate();
			return rowsaffected>0;
		}
		@Override
		public Trip SearchTrip(int tripid) throws ClassNotFoundException, SQLException {
			String ConnStr = DBPropertyUtil.connectionString("db");
			connection = DBConnUtil.getConnection(ConnStr);
			String cmd = "Select * from trips where trip_id = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, tripid);
			ResultSet rs = pst.executeQuery();
			
			Trip trip = null;
			if(rs.next())
			{
				trip = new Trip();
				
				trip.setTripId(rs.getInt("trip_id"));
				trip.setVehicleId(rs.getInt("vehicleid"));
				trip.setRouteId(rs.getInt("routeid"));
				trip.setArrivalDate(rs.getString("arrivalDate"));
				trip.setDepartureDate(rs.getString("departureDate"));
				trip.setTripStatus(rs.getString("trip_status"));
				trip.setTripType(rs.getString("trip_type"));
			}
			return trip;
		}

}

