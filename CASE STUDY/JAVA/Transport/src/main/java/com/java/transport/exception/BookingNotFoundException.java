package com.java.transport.exception;

public class BookingNotFoundException extends Exception{
	public BookingNotFoundException(String comment)
	{
		super(comment);
	}
}
