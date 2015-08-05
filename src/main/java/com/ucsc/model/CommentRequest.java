package com.ucsc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommentRequest {
String comment;
String from;
String to;
double rating;

public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

}
