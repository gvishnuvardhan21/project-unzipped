package com.java.transport;

import java.sql.SQLException;

import org.junit.Test;

import com.java.transport.exception.BookingNotFoundException;
import com.java.transport.exception.VechileNotFoundException;

public class AppTest {

  @Test
  public void testMain() throws ClassNotFoundException, SQLException, VechileNotFoundException, BookingNotFoundException {
    TransportManagementApp.main(null);
  }

}
