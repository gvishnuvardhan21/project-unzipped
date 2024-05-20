package com.java.transport;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.transport.model.Vehicle;

public class VehicleTest {

	@Test
	public void testConstructor() {
		Vehicle veh = new Vehicle();
		assertNotNull(veh);
	Vehicle v = new Vehicle(26,"Lancer", 500.000,"car","available");
	assertEquals(26, v.getVehicleId());
	assertEquals("Lancer", v.getModel());
	assertEquals(500.000 , v.getCapacity(), 0.001);
	assertEquals("car" , v.getType());
	assertEquals("available", v.getStatus());
	}
	
	
	@Test
	public void testGettersAndSetters()
	{
	Vehicle v= new Vehicle();
	v.setVehicleId(1);
	v.setModel("tata");
	v.setCapacity(150.00);
	v.setType("bus");
	v.setStatus("available");
	assertEquals(1,v.getVehicleId());
	assertEquals("tata",v.getModel());
	assertEquals(150.00,v.getCapacity(),0.0001);
	assertEquals("bus",v.getType());
	assertEquals("available",v.getStatus());
	
	}
	
	
	@Test
	public void testHashCode()
	{
		Vehicle v1 = new Vehicle(26,"Lancer", 500.000,"car","available");
		Vehicle v2 = new Vehicle(26,"Lancer", 500.000,"car","available");
		assertEquals(v1.hashCode(), v2.hashCode());
	}
	
	@Test
	public void testEquals()
	{
		Vehicle v1 = new Vehicle(26,"Lancer", 500.000,"car","available");
		Vehicle v2 = new Vehicle(26,"Lancer", 500.000,"car","available");
		Vehicle v3 = new Vehicle(263,"Lancer", 500.000,"car","available");

		assertTrue(v1.equals(v2));
		assertFalse(v1.equals(v3));
	}
	
	@Test
	public void testToString()
	{
		Vehicle v1 = new Vehicle(26,"Lancer", 500.000,"car","available");
		String result = "Vehicle [VehicleId=26, Model=Lancer, Capacity=500.0, Type=car, Status=available]";
		assertEquals(v1.toString(),result);
	}
}
