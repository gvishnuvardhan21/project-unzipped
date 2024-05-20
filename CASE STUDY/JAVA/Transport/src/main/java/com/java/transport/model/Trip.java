package com.java.transport.model;

import java.util.*;

public class Trip {

	    private int tripId;
	    private int vehicleId;
	    private int routeId;
	    private String departureDate;
	    private String arrivalDate;
	    private String tripStatus;
	    private String tripType;
	    
	    
		public Trip(int tripId, int vehicleId, int routeId, String departureDate, String arrivalDate, String tripStatus,
				String tripType) {
			this.tripId = tripId;
			this.vehicleId = vehicleId;
			this.routeId = routeId;
			this.departureDate = departureDate;
			this.arrivalDate = arrivalDate;
			this.tripStatus = tripStatus;
			this.tripType = tripType;
		}
		public Trip() {
		}

		public int getTripId() {
			return tripId;
		}
		public void setTripId(int tripId) {
			this.tripId = tripId;
		}
		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
		public int getRouteId() {
			return routeId;
		}
		public void setRouteId(int routeId) {
			this.routeId = routeId;
		}
		public String getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		public String getArrivalDate() {
			return arrivalDate;
		}
		public void setArrivalDate(String arrivalDate) {
			this.arrivalDate = arrivalDate;
		}
		public String getTripStatus() {
			return tripStatus;
		}
		public void setTripStatus(String tripStatus) {
			this.tripStatus = tripStatus;
		}
		public String getTripType() {
			return tripType;
		}
		public void setTripType(String tripType) {
			this.tripType = tripType;
		}
		@Override
		public String toString() {
			return "Trip [tripId=" + tripId + ", vehicleId=" + vehicleId + ", routeId=" + routeId + ", departureDate="
					+ departureDate + ", arrivalDate=" + arrivalDate + ", tripStatus=" + tripStatus + ", tripType="
					+ tripType + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(tripId,vehicleId,routeId,departureDate,arrivalDate,tripStatus,tripType);
		}
		@Override
		public boolean equals(Object obj) {
			Trip t = (Trip) obj;
			if(t.getTripId()== tripId && t.getVehicleId()== vehicleId && t.getRouteId() == routeId 
			&& t.getDepartureDate()== departureDate && t.getArrivalDate() == arrivalDate &&
			t.getTripStatus() == tripStatus && t.getTripType() == tripType)
				return true;
			else
				return false;
		}
	}
