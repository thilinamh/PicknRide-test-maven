package com.ucsc.model;

import java.util.ArrayList;

import decoder.Location;

public class RideSession {

	boolean available=true;
	String driverID;
	String passengerID;
	double startingTime;
	double endingTime;
	ArrayList<Location> driverRoute;
	ArrayList<Location> passenderRoute;
	String startingPoint;
	String endingPoint;
	
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
	public RideSession(String driverID, double startingTime, double endingTime,
			ArrayList<Location> route) {
		
		this.driverID = driverID;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.driverRoute = route;
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
	public ArrayList<Location> getDriverRoute() {
		return driverRoute;
	}
	public void setDriverRoute(ArrayList<Location> driverRoute) {
		this.driverRoute = driverRoute;
	}
	public ArrayList<Location> getPassenderRoute() {
		return passenderRoute;
	}
	public void setPassenderRoute(ArrayList<Location> passenderRoute) {
		this.passenderRoute = passenderRoute;
	}
	
}
