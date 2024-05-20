package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;

public class TripCancelMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("Enter the tripId to casncel the trip !");
		int tripid = sr.nextInt();
		if(dao.cancelTrip(tripid))
		{
			System.out.println("We will be missing you !Trip cancelled :(");
		}
		else 
			System.out.println("there is an error in cancelling the trip !");
	}
}
