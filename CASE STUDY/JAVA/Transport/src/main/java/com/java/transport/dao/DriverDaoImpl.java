package com.java.transport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.transport.model.Driver;
import com.java.transport.util.DBConnUtil;
import com.java.transport.util.DBPropertyUtil;

public class DriverDaoImpl implements DriverDao {
	 Connection connection;
	 PreparedStatement pst;
	 
	@Override
	public List<Driver> getAvailableDrivers() throws SQLException, ClassNotFoundException {
		String ConnStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(ConnStr);
		String cmd = "select * from driver where driverStatus = ? ";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, "Available");
		ResultSet rs = pst.executeQuery();
		
		List<Driver> AvailabledriverList = new ArrayList<Driver>();
		Driver driver = null;
		while(rs.next())
		{
			driver = new Driver();
			driver.setDriverid(rs.getInt("driverid"));
			driver.setDriverName(rs.getString("driverName"));
			driver.setPhoneNo(rs.getLong("phoneNo"));
			driver.setDriverStatus(rs.getString("driverStatus"));
			driver.setTripid(rs.getInt("tripid"));
			driver.setVehicleid(rs.getInt("vehicleid"));
			AvailabledriverList.add(driver);
		}
		
		return AvailabledriverList;

	}

}
