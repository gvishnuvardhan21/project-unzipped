package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;
import com.java.transport.exception.BookingNotFoundException;
import com.java.transport.exception.VechileNotFoundException;

public class TripCancelBookingMain {
	public static void main(String[] args) throws BookingNotFoundException  {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("Enter the bookinId to cancel the booking ");
		int bookingid = sr.nextInt();
		
		try {
			if(dao.cancelBooking(bookingid))
				System.out.println("booking cancelled :(  ");
			else
				throw new BookingNotFoundException("Booking with ID " + bookingid +" not found.");
		} catch (ClassNotFoundException | SQLException | BookingNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
