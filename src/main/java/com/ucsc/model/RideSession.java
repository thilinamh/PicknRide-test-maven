package com.ucsc.model;

import java.util.List;

import decoder.Location;

public class RideSession {

	boolean available=true;
	String driverID;
	String passengerID;
	double startingTime;
	double endingTime;
	List<Location> driverRoute;
	List<Location> passenderRoute;
	String startingPoint;
	String endingPoint;
	

	public RideSession(String driverID, double startingTime, double endingTime,
			List<Location> route) {
		
		this.driverID = driverID;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.driverRoute = route;
	}
	
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}
	public double getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(double startingTime) {
		this.startingTime = startingTime;
	}
	public double getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(double endingTime) {
		this.endingTime = endingTime;
	}
	public List<Location> getDriverRoute() {
		return driverRoute;
	}
	public void setDriverRoute(List<Location> driverRoute) {
		this.driverRoute = driverRoute;
	}
	public List<Location> getPassenderRoute() {
		return passenderRoute;
	}
	public void setPassenderRoute(List<Location> passenderRoute) {
		this.passenderRoute = passenderRoute;
	}
	
}
