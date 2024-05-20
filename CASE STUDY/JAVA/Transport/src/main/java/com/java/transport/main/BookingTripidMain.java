package com.java.transport.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.java.transport.dao.*;

import com.java.transport.dao.BookingsDao;
import com.java.transport.dao.BookingsDaoImpl;
import com.java.transport.exception.BookingNotFoundException;
import com.java.transport.model.Bookings;
import com.java.transport.model.Trip;

public class BookingTripidMain {
	public static void main(String[] args) throws BookingNotFoundException {
		Scanner sr = new Scanner(System.in);
		System.out.println("enter the trip id : ");
		int tripid = sr.nextInt();
		
		TripDao Tdao = new TripDaoImpl();
		Trip tripFound = null;
		try {
			tripFound = Tdao.SearchTrip(tripid);
			if(tripFound == null)
			{
				throw new BookingNotFoundException("Bookings Not Found For the Given Trip ID : "+ tripid);
			}
		} catch (ClassNotFoundException | SQLException | BookingNotFoundException  e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		BookingsDao dao = new BookingsDaoImpl();
		List<Bookings> bookingsList;
		try {
			bookingsList = dao.getBookingsByTrip(tripid);
			for (Bookings bookings : bookingsList) {
				System.out.println(bookings);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
