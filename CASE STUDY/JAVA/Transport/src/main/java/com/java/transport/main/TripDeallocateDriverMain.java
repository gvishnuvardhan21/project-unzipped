package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;

public class TripDeallocateDriverMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("enter trip id: ");
		int tripid = sr.nextInt();
		
		if(dao.deallocateDriver(tripid))
		{
			System.out.println("driver is been deallocated !");
		}
		else
			System.out.println("Check whether the tripid is available or not !!");
}
}
