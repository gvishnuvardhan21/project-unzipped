package com.java.transport.model;

import java.util.Objects;

public class Bookings {
	private int bookingid;
	private int trip_id;
	private int passsengerid;
	private String bookingdate;
	private String status;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getTripid() {
		return trip_id;
	}
	public void setTripid(int tripid) {
		this.trip_id = tripid;
	}
	public int getPasssengerid() {
		return passsengerid;
	}
	public void setPasssengerid(int passsengerid) {
		this.passsengerid = passsengerid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Bookings() {
	}
	
	public Bookings(int bookingid, int trip_id, int passsengerid, String bookingdate, String status) {
		super();
		this.bookingid = bookingid;
		this.trip_id = trip_id;
		this.passsengerid = passsengerid;
		this.bookingdate = bookingdate;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bookings [bookingid=" + bookingid + ", trip_id=" + trip_id + ", passengerid=" + passsengerid
				+ ", bookingdate=" + bookingdate + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingid, trip_id, passsengerid, bookingdate, status);
	}
	@Override
	public boolean equals(Object obj) {
		Bookings book = (Bookings)obj;
		if(book.getBookingid() == bookingid
				&& book.getTripid() == trip_id
				&& book.getPasssengerid() == passsengerid
				&& book.getBookingdate() == bookingdate
				&& book.getStatus() == status) {
			return true;
		}
		return false;
	}
	
	
}
