package com.java.transport;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.transport.model.Bookings;


	public class BookingTest {

		@Test
		public void testConstructors() {
			Bookings B1 = new Bookings();
			assertNotNull(B1);
			
			Bookings B2 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			assertEquals(1, B2.getBookingid());
			assertEquals(5, B2.getTripid());
			assertEquals(8,B2.getPasssengerid());
			assertEquals("2024-05-01 08:00:00" , B2.getBookingdate());
			assertEquals("Confirmed", B2.getStatus());
			
		}
		
		@Test
		public void testGetterSetter() {
			Bookings b = new Bookings();
			b.setBookingid(1);
			b.setTripid(5);
			b.setPasssengerid(8);
			b.setBookingdate("2024-05-01 08:00:00");
			b.setStatus("Confirmed");
			
			assertEquals(1, b.getBookingid());
			assertEquals(5, b.getTripid());
			assertEquals(8,b.getPasssengerid());
			assertEquals("2024-05-01 08:00:00" , b.getBookingdate());
			assertEquals("Confirmed", b.getStatus());
		}
		
		@Test
		public void testHashCode() {
			Bookings b1 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			Bookings b2 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			assertEquals(b1.hashCode(),b2.hashCode());
		}
		
		@Test
		public void testEquals() {
			Bookings b1 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			Bookings b2 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			Bookings b3 = new Bookings(1,6,7,"2024-05-03 08:00:00","Confirmed");
			assertTrue(b1.equals(b2));
			assertFalse(b2.equals(b3));
		}
		
		@Test
		public void testToString() {
			Bookings b1 = new Bookings(1,5,8,"2024-05-01 08:00:00","Confirmed");
			String res = "Bookings [bookingid=1, trip_id=5, passengerid=8, bookingdate=2024-05-01 08:00:00, status=Confirmed]";
			assertEquals(b1.toString(),res);
			
		}

		

	}

