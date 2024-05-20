package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.transport.model.Bookings;

public interface BookingsDao {
	List<Bookings> getBookingsByPassenger(int passengerId) throws ClassNotFoundException, SQLException;
	List<Bookings> getBookingsByTrip(int tripId) throws ClassNotFoundException, SQLException;
}
