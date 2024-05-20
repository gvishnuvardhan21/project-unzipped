package com.java.transport.model;

import java.util.Objects;

public class Vehicle {
	
	private int VehicleId;
	private String Model;
	private double Capacity;
	private String Type;
	private String Status;
	public int getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getCapacity() {
		return Capacity;
	}
	public void setCapacity(double capacity) {
		Capacity = capacity;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Vehicle(int vehicleId, String model, double capacity, String type, String status) {

		VehicleId = vehicleId;
		Model = model;
		Capacity = capacity;
		Type = type;
		Status = status;
	}
	public Vehicle() {

		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + ", Model=" + Model + ", Capacity=" + Capacity + ", Type=" + Type
				+ ", Status=" + Status + "]";
	}	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(VehicleId,  Model,  Capacity,  Type,  Status);
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicle vehicle = (Vehicle)obj;
		if(vehicle.getVehicleId()== VehicleId && vehicle.getModel()== Model &&
		   vehicle.getCapacity() == Capacity && vehicle.getType()== Type && vehicle.getStatus()== Status)
			return true;
		else
			return false;
	
	}
	
}
