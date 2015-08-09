package com.ucsc;





import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.api.*;
import com.squareup.okhttp.Request;
import com.ucsc.model.*;
import com.ucsc.repo.*;
import com.google.maps.GeoApiContext;
import com.google.maps.model.LatLng;


@Path("user")
public class UserResource {
 public static  UserRepo repos =new UserRepoStub();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll( ){
		return repos.findAll();
	}
	
	
	
	/*
	 * content type - application/json
	 * request body-
	 * { 
	 * "uID":"1",
	 * "name":"jason",
	 * "age":24,
	 * "gender":"male",
	 * "password":"weasdad",
	 * "NIC":"995424545a"
	 * }
	 * 
	 * */
	@POST
	@Path("register") //http://localhost:8080/PicknRide/webapi/user/register
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response register(User usr){
		
		
		/*for (User x:repo.findAll()){
			System.out.println(x.getuID());
		}*/
		System.out.println("Connected");
		if(repos.getUser(usr.getuID()) == null){
			repos.addUser(usr);
			System.out.println(usr.getName()+" registered");
			return Response.ok().build();
		}else{
			return Response.status(Status.CONFLICT).build();
		}
		
	}
	
	@GET
	@Path("{id}") ////http://localhost:8080/PicknRide/webapi/user/15
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public User findUser(@PathParam("id") String ID){
		//GeoApiContext  context = new GeoApiContext().setApiKey("AIzaFakeKey"); 
		
		User ret= repos.getUser(ID);
		if(ret !=null){
			return ret;
			
		}else{
			return null;
		}
	}
	




// Note: you could even inject this as a method parameter
@Context private HttpServletRequest request;

@POST
@Path("authenticate")
@Consumes(MediaType.APPLICATION_JSON)
public String authenticate(LoginRequest r) {
	
	//System.out.println(r.getUserName()+" "+r.getPassword());	
	System.out.println(r.getuID());	
   if (repos.auth(r.getuID(), r.getPassword()) ) {
        request.getSession(true);
        return "200";
        //return Response.ok().build();
    }
    return "500";
   //return Response.notAcceptable(null).build();
    
}



}
