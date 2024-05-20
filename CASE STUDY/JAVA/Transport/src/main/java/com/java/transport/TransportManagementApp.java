
package com.java.transport;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.transport.exception.BookingNotFoundException;
import com.java.transport.exception.VechileNotFoundException;
import com.java.transport.main.*;


public class TransportManagementApp {

	private static void DisplayChoice() {
		System.out.println("	Welcome to Yellow Bus 🚌	");
        System.out.println("\n--- Transport Management Menu ---");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Update Vehicle");
        System.out.println("3. Delete Vehicle");
        System.out.println("4. Show Vehicle");
        System.out.println("5. Search Vehicle By VehicleID");
        System.out.println("6. Schedule Trip");
        System.out.println("7. Cancel Trip");
        System.out.println("8. Book Trip");
        System.out.println("9. Cancel Booking");
        System.out.println("10. Allocate Driver");
        System.out.println("11. Deallocate Driver");
        System.out.println("12. Get Bookings By Passenger");
        System.out.println("13. Get Bookings By Trip");
        System.out.println("14. Get Available Drivers");
        System.out.println("15. Exit");
        System.out.print("Enter your choice: ");
    }
	
	private static int getUserChoice() {
		Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
  public static void main(String[] args) throws ClassNotFoundException, SQLException, VechileNotFoundException, BookingNotFoundException {
	  
	  boolean end = false;
	  
	  while(!end)
	  {
		  DisplayChoice();
		  int choice = getUserChoice();
		  
		  switch(choice)
		  {
		  		case 1:
		  			System.out.println("Give Details For Adding Vehicle : ");
		  			VehicleInsertMain.main(args);
		  			break;
		  			
		  		case 2:
		  			System.out.println("Give Details Update vehicle : ");
		  			VehicleUpdateMain.main(args);
		  			break;
		  		
		  		case 3:
		  			System.out.println("Give Details To Delete Vehicle : ");
		  			VehicleDeleteMain.main(args);
		  			break;
		  		
		  		case 4:
		  			System.out.println("Vehicle List : ");
		  			VehicleShowMain.main(args);
		  			break;
		  			
		  		case 5:
		  			System.out.println("Search Vehicle By VehicleID : ");
		  			VehicleSearchMain.main(args);
		  			break;
		  		
		  		case 6:
		  			System.out.println("Give Details Schedule Trip:");
		  			TripScheduleMain.main(args);
		  			break;
		  		
		  		case 7:
		  			 System.out.println("7. Cancel Trip");
		  			 TripCancelMain.main(args);
		  			 break;
		  			 
		  		case 8:
		  			 System.out.println("8. Book Trip");
		  			 TripBookMain.main(args);
		  			 break;
		  		
		  		case 9:
		  			 System.out.println("9. Cancel Booking");
		  			 TripCancelBookingMain.main(args);
		  			 break;
		  		
		  		case 10:
		  			System.out.println("10. Allocate Driver");
		  			TripAllocateDriverMain.main(args);
		  			break;
		  		
		  		case 11:
		  			 System.out.println("11. Deallocate Driver");
		  			 TripDeallocateDriverMain.main(args);
		  			 break;
		  		
		  		case 12:
		  			 System.out.println("12. Get Bookings By Passenger");
		  			 BookingPassengerIdMain.main(args);
		  			 break;
		  		
		  		case 13:
		  			System.out.println("13. Get Bookings By Trip");
		  			BookingTripidMain.main(args);
		  			break;
		  		
		  		case 14:
		  			 System.out.println("14. Get Available Drivers");
		  			 DriverAvailableMain.main(args);
		  			 break;
		  		  
		  		case 15:
		  			end = true;
		  			break;
		  			
		  	  default:
                  System.out.println("Invalid choice. Please try again.");
		  }
	  }
	  System.out.println("...Exiting Transport Management Application...");  
  }

}
