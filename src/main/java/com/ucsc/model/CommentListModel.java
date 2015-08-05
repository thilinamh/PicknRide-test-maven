package com.ucsc.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class CommentListModel {
	
User usr;
String comment = "";
double rating;

/*public CommentListModel(User usr, String comment, double rating) {
	this.usr =usr;
	this.rating=rating;
	this.comment.add(comment);
}*/

public User getUsr() {
	return usr;
}
public void setUsr(User usr) {
	this.usr = usr;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public void addComment(String comment2) {
	comment +=comment2+"\n";
	
}

}
