package com.java.transport.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.transport.dao.BookingsDao;
import com.java.transport.dao.BookingsDaoImpl;
import com.java.transport.model.Bookings;

public class BookingPassengerIdMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		System.out.println("enter the passenger id : ");
		int passengerid = sr.nextInt();
		
		BookingsDao dao = new BookingsDaoImpl();
		List<Bookings> bookingsList = dao.getBookingsByPassenger(passengerid);
		for (Bookings bookings : bookingsList) {
			System.out.println(bookings);
		}
	}
}
