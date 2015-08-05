package com.ucsc;





import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.api.*;
import com.ucsc.model.*;
import com.ucsc.repo.*;
import com.google.maps.GeoApiContext;
import com.google.maps.model.LatLng;


@Path("user")
public class UserResource {
 public static  UserRepo repo =new UserRepoStub();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll( ){
		return repo.findAll();
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
		if(repo.getUser(usr.getuID()) == null){
			repo.addUser(usr);
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
		
		User ret= repo.getUser(ID);
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
public Response authenticate(LoginRequest r) {
	System.out.println(r.getUserName()+" "+r.getPassword());	
    // Implementation of your authentication logic
    if (r.getUserName().equals("tm") && r.getPassword().equals("qaz") ) {
        request.getSession(true);
        return Response.ok().build();
    }
   return Response.notAcceptable(null).build();
    
}



}
