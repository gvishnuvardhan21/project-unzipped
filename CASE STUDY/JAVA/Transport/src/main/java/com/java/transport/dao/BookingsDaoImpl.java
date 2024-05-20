package com.java.transport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.transport.model.Bookings;
import com.java.transport.util.DBConnUtil;
import com.java.transport.util.DBPropertyUtil;

public class BookingsDaoImpl implements BookingsDao{
	Connection connection;
	 PreparedStatement pst;
	@Override
	public List<Bookings> getBookingsByPassenger(int passengerId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Bookings where passengerid = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, passengerId);
		ResultSet rs = pst.executeQuery();
		List<Bookings> bookingsList = new ArrayList<Bookings>();
		Bookings bookings = null;
		while(rs.next())
		{
			bookings = new Bookings();
			bookings.setBookingid(rs.getInt("bookingid"));
			bookings.setTripid(rs.getInt("trip_id"));
			bookings.setPasssengerid(rs.getInt("passengerId"));
			bookings.setBookingdate(rs.getString("bookingdate"));
			bookings.setStatus(rs.getString("status"));
			bookingsList.add(bookings);
		}
		return bookingsList;
	}
	@Override
	public List<Bookings> getBookingsByTrip(int tripId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Bookings where trip_id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, tripId);
		ResultSet rs = pst.executeQuery();
		List<Bookings> bookingsList = new ArrayList<Bookings>();
		Bookings bookings = null;
		while(rs.next())
		{
			bookings = new Bookings();
			bookings.setBookingid(rs.getInt("bookingid"));
			bookings.setTripid(rs.getInt("trip_id"));
			bookings.setPasssengerid(rs.getInt("passengerId"));
			bookings.setBookingdate(rs.getString("bookingdate"));
			bookings.setStatus(rs.getString("status"));
			bookingsList.add(bookings);
		}
		return bookingsList;
	}

}
