package com.java.transport;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.transport.model.Trip;

public class TripTest {

	
	@Test
	public void Constructor()
	{
		Trip t = new Trip();
		assertNotNull(t);
		Trip t1 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		assertEquals(1, t1.getTripId());
		assertEquals(2, t1.getVehicleId());
		assertEquals(3, t1.getRouteId());
		assertEquals("2024-05-02", t1.getDepartureDate());
		assertEquals("2024-05-08",t1.getArrivalDate());
		assertEquals("Scheduled",t1.getTripStatus());
		assertEquals("Passenger", t1.getTripType());
	}
	
	@Test
	public void testGetterSetter()
	{
		Trip t = new Trip();
		t.setTripId(1);
		t.setVehicleId(2);
		t.setRouteId(3);
		t.setDepartureDate("2024-05-02");
		t.setArrivalDate("2024-05-08");
		t.setTripStatus("Scheduled");
		t.setTripType("Passenger");
		
		assertEquals(1, t.getTripId());
		assertEquals(2, t.getVehicleId());
		assertEquals(3, t.getRouteId());
		assertEquals("2024-05-02", t.getDepartureDate());
		assertEquals("2024-05-08",t.getArrivalDate());
		assertEquals("Scheduled",t.getTripStatus());
		assertEquals("Passenger", t.getTripType());
	}
	
	@Test
	public void testHashcode()
	{
		Trip t1 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		Trip t2 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		assertEquals(t1.hashCode(), t2.hashCode());

	}
	
	@Test
	public void testEquals()
	{
		Trip t1 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		Trip t2 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		Trip t3 = new Trip(1,3,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		assertTrue(t1.equals(t2));
		assertFalse(t1.equals(t3));

	}
	
	@Test
	public void testToString()
	{
		Trip t1 = new Trip(1,2,3,"2024-05-02","2024-05-08","Scheduled","Passenger");
		String result = "Trip [tripId=1, vehicleId=2, routeId=3, departureDate=2024-05-02, arrivalDate="
				+ "2024-05-08, tripStatus=Scheduled, tripType=Passenger]";
		assertEquals(t1.toString(), result);
	}

}
