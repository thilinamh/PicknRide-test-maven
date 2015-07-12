package com.ucsc.repo;

import java.util.List;

import com.ucsc.model.User;

public interface UserRepo {

	public abstract  List<User> findAll();
	public abstract User  getUser(String ID);
	public abstract void addUser(User usr);
	

}