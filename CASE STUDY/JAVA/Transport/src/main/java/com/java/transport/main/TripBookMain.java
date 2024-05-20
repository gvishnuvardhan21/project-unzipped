package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;
import com.java.transport.model.Trip;

public class TripBookMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("Enter details to book an trip !");
		System.out.println("enter tripid :");
		int tripid = sr.nextInt();
		System.out.println("enter passengerid :");
		int passengerid = sr.nextInt();
		sr.nextLine();
		System.out.println("enter bookingdate :");
		String bookingdate = sr.nextLine();
		
		if(dao.bookTrip(tripid, passengerid, bookingdate))
		{
			System.out.println("hurray ! your trip is booked");
		}
		else
			System.out.println("something went wrong :(");
	}
}
