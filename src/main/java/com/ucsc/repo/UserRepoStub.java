package com.ucsc.repo;


import java.util.ArrayList;
import java.util.List;



import com.ucsc.model.User;
public class UserRepoStub implements UserRepo {
	
	 static List<User> users = new ArrayList<>(); //DB of users
	
	@Override
	public List<User> findAll(){
		
		return users;
	}
	public boolean auth(String uID, String pwd){
		for(User usr:users){
			System
			if(usr.getuID()==uID && usr.getPassword()==pwd){
				return true;
			}
		}
		return false;
		
	}
	
	public List<User> findAllInfo(){
		List<User> lst= new ArrayList<>();
		for (User x : users){
			lst.add(x.getLightUser());
		}
		return lst;
	}
	public void addUser(User usr){
		users.add(usr);
	}
	
	public User  getUser(String ID) {
		for(User x:users){
			if (x.getuID().equals(ID)){
				return x;
			}
		}
		return null;
	}
}

