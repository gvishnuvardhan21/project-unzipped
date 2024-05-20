package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;
import com.java.transport.model.Trip;

public class TripScheduleMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("Enter details to Schedule the Trip");
		System.out.println("Enter Vehicle id :");
		int vehicleid = sr.nextInt();
		System.out.println("Enter route id :");
		int routeid = sr.nextInt();
		sr.nextLine();
		System.out.println("Enter departure date yy-mm-dd :");
		String departureDate = sr.nextLine();
		System.out.println("Enter Arrival date yy-mm-dd :");
		String arrivaldate = sr.nextLine();
		
		if(dao.scheduleTrip(vehicleid, routeid, departureDate, arrivaldate))
		{
			System.out.println("done Scheduled perfectly  ..");
		}
	}
}
