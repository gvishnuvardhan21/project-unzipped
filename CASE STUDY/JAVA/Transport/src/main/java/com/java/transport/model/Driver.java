package com.java.transport.model;

import java.util.Objects;

public class Driver {
	 
	private int driverid;
	private String driverName;
	private long phoneNo;
	private String driverStatus;
	private int tripid;
	private int vehicleid;
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	public int getTripid() {
		return tripid;
	}
	public void setTripid(int tripid) {
		this.tripid = tripid;
	}
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public Driver() {

	}
	public Driver(int driverid, String driverName, long phoneNo, String driverStatus, int tripid, int vehicleid) {

		this.driverid = driverid;
		this.driverName = driverName;
		this.phoneNo = phoneNo;
		this.driverStatus = driverStatus;
		this.tripid = tripid;
		this.vehicleid = vehicleid;
	}
	@Override
	public String toString() {
		return "Driver [driverid=" + driverid + ", driverName=" + driverName + ", phoneNo=" + phoneNo
				+ ", driverStatus=" + driverStatus + ", tripid=" + tripid + ", vehicleid=" + vehicleid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(driverid, driverName, phoneNo, driverStatus, tripid, vehicleid);
	}
	
	@Override
	public boolean equals(Object obj) {
		Driver d = (Driver)obj;
		if(d.getDriverid()== driverid && d.getDriverName()== driverName && d.getPhoneNo()== phoneNo &&
			d.getDriverStatus()== driverStatus && d.getTripid()== tripid && d.getVehicleid()== vehicleid)
			return true;
		else
			return false;
	} 
}
