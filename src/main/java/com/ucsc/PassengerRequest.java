package com.ucsc;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import com.ucsc.model.CommentRequest;
import com.ucsc.model.CommentListModel;

import com.ucsc.model.User;
import com.ucsc.repo.UserRepo;
import com.ucsc.repo.UserRepoStub;

@Path("PassengerRequest")
public class PassengerRequest {
	
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll( ){
		return UserResource.repo.findAllInfo();
	}
	
	@GET
	@Path("/comments/{id}")
	
	@Produces(MediaType.APPLICATION_JSON)
	public List<CommentListModel> getComments(@PathParam("id") String ID){
		System.out.println(ID);
		
		User usr= UserResource.repo.getUser(ID);
		List<CommentListModel> comments;
		
		if(usr != null){
		comments = usr.getCommentList();	
		}
		else{
			return null;
		}
		
		return comments;
		
	
	}
	
	@POST
	@Path("addcomments")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int addComment(CommentRequest a){
		User from = UserResource.repo.getUser(a.getFrom());
		UserResource.repo.getUser(a.getTo()).addComment(from, a.getComment(), a.getRating());
		System.out.println(a.getComment());
		return 200;
		
	}
}
