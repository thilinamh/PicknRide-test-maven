package com.ucsc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
private String uID;
private String name;
private String NIC;
private int age;
private String gender;
private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getuID() {
	return uID;
}
public void setuID(String uID) {
	this.uID = uID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNIC() {
	return NIC;
}
public void setNIC(String nIC) {
	NIC = nIC;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}
