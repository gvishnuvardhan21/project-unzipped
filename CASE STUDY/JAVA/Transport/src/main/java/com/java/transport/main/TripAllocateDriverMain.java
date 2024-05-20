package com.java.transport.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.dao.TripDao;
import com.java.transport.dao.TripDaoImpl;

public class TripAllocateDriverMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		TripDao dao = new TripDaoImpl();
		
		System.out.println("enter driver id : ");
		int driverid = sr.nextInt();
		System.out.println("enter trip id: ");
		int tripid = sr.nextInt();
		
		if(dao.allocateDriver(driverid,tripid ))
		{
			System.out.println("your drived is been allocated !!");
		}
		else
			System.out.println("CHeck the driverid and tripid porperly !!");
}
}
