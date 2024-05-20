package com.java.transport.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.transport.dao.DriverDao;
import com.java.transport.dao.DriverDaoImpl;
import com.java.transport.model.Driver;

public class DriverAvailableMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sr = new Scanner(System.in);
		DriverDao dao = new DriverDaoImpl();
		
		System.out.println("availabe drivers list !!!");
		
		List<Driver> DriverList =  dao.getAvailableDrivers();
		
		for (Driver driver : DriverList) {
			System.out.println(driver);
		}
		
	}
}
