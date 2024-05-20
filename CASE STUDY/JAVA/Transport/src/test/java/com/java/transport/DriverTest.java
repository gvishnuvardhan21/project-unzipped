package com.java.transport;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.transport.model.Driver;

public class DriverTest {

	@Test
	public void testConstructor()
	{
		Driver d1 = new Driver();
		assertNotNull(d1);
		Driver d = new Driver(1,"vijay",1234567890,"busy",2,3);
		assertEquals(1, d.getDriverid());
		assertEquals("vijay", d.getDriverName());
		assertEquals(1234567890, d.getPhoneNo());
		assertEquals("busy", d.getDriverStatus());
		assertEquals(2, d.getTripid());
		assertEquals(3, d.getVehicleid());
	}

	@Test
	public void testGetterSetter()
	{
		Driver d = new Driver();
		d.setDriverid(1);
		d.setDriverName("vijay");
		d.setPhoneNo(1234567890);
		d.setDriverStatus("busy");
		d.setTripid(2);
		d.setVehicleid(3);
		
		assertEquals(1, d.getDriverid());
		assertEquals("vijay", d.getDriverName());
		assertEquals(1234567890, d.getPhoneNo());
		assertEquals("busy", d.getDriverStatus());
		assertEquals(2, d.getTripid());
		assertEquals(3, d.getVehicleid());
	}
	
	@Test
	public void testHashcode()
	{
		Driver d = new Driver(1,"vijay",1234567890,"busy",2,3);
		Driver d1 = new Driver(1,"vijay",1234567890,"busy",2,3);
		assertEquals(d.hashCode(), d1.hashCode());
	}
	
	@Test
	public void testEquals()
	{
		Driver d1= new Driver(1,"vijay",1234567890,"busy",2,3);
		Driver d2 = new Driver(1,"vijay",1234567890,"busy",2,3);
		Driver d3= new Driver(1,"Vishnu",1234567890,"busy",2,3);

		assertTrue(d1.equals(d2));
		assertFalse(d1.equals(d3));
	}
	
	@Test
	public void testToString()
	{
		Driver d1= new Driver(1,"vijay",1234567890,"busy",2,3);
		String result = "Driver [driverid=1, driverName=vijay, phoneNo=1234567890, driverStatus=busy"
				+ ", tripid=2, vehicleid=3]";
		assertEquals(d1.toString(), result);
	}
}
