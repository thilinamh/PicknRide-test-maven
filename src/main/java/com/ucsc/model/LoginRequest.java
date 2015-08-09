package com.ucsc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginRequest {
	private String ID;
	private String uID;
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
}
