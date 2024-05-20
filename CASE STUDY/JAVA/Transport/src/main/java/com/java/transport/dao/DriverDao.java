package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.transport.model.Driver;

public interface DriverDao {
 
	List<Driver> getAvailableDrivers() throws SQLException, ClassNotFoundException;
}
