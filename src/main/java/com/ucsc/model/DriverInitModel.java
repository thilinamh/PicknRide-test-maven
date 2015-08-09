package com.ucsc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DriverInitModel {
	
 private String uID;
 private double starting;
 private double ending;
 private int seats;
 private int cost;
 private String points;
 
 public String getuID() {
	return uID;
}
public void setuID(String uID) {
	this.uID = uID;
}
public double getStarting() {
	return starting;
}
public void setStarting(double starting) {
	this.starting = starting;
}
public double getEnding() {
	return ending;
}
public void setEnding(double ending) {
	this.ending = ending;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getPoly() {
	return points;
}
public void setPoly(String poly) {
	this.points = poly;
}

 
 
 

}
