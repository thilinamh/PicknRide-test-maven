package com.ucsc.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class User  {
	
private String NIC;
private String password;
private List<CommentListModel> commentList = new ArrayList<CommentListModel>();;
private String name;
private int age;
private String uID;
private String gender;
private double rating;
private String image="http://icons.iconarchive.com/icons/visualpharm/must-have/256/User-icon.png";


@XmlTransient
public List<CommentListModel> getCommentList() {
	return commentList;
}
public void setCommentList(List<CommentListModel> commentList) {
	this.commentList = commentList;
}


public void addComment(User usr, String comment,double rating){
	
	CommentListModel cmt =new CommentListModel();
	cmt.addComment(comment);
	cmt.setRating(rating);
	cmt.setUsr(usr);
	
	commentList.add(cmt);
	 
}

public User getLightUser(){
	
	return this;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getuID() {
	return uID;
}
public void setuID(String uID) {
	this.uID = uID;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
@XmlTransient
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@XmlTransient
public String getNIC() {
	return NIC;
}
public void setNIC(String nIC) {
	NIC = nIC;
}
}
