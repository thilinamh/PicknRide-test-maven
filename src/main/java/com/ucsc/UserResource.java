package com.ucsc;





import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ucsc.model.*;
import com.ucsc.repo.*;

@Path("user")
public class UserResource {
 private UserRepo repo =new UserRepoStub();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll(){
		return repo.findAll();
	}
	
	@POST
	@Path("register") //http://localhost:8080/PicknRide/webapi/user/register
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
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response register(User usr){
		
		/*for (User x:repo.findAll()){
			System.out.println(x.getuID());
		}*/
		
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
		User ret= repo.getUser(ID);
		if(ret !=null){
			return ret;
			
		}else{
			return null;
		}
	}
}
