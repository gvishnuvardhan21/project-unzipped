package com.java.transport.dao;

import java.sql.SQLException;
import com.java.transport.model.Trip;

public interface TripDao {
	  boolean scheduleTrip(int vehicleId, int routeId, String departureDate, String arrivalDate) throws ClassNotFoundException, SQLException;
	  boolean cancelTrip(int tripid) throws ClassNotFoundException, SQLException;
	  boolean bookTrip(int tripid, int passengerid, String bookingdate) throws SQLException, ClassNotFoundException;
	  boolean cancelBooking (int bookingid) throws ClassNotFoundException, SQLException;
	  boolean allocateDriver(int tripId, int driverId) throws ClassNotFoundException, SQLException;
	  boolean deallocateDriver(int tripId) throws SQLException, ClassNotFoundException;
	Trip SearchTrip(int tripid) throws ClassNotFoundException, SQLException;
	 
	  
}
