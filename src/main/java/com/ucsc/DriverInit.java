package com.ucsc;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParser;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonObjectParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.maps.model.*;

@Path("DriverInit")
public class DriverInit {
	
	LatLng a= new LatLng(0, 0);
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void getRoute(String array){
		//array.getAsString();
		
		 
		JsonElement a=  new com.google.gson.JsonParser().parse(array);
		JsonObject obj = a.getAsJsonObject();
		JsonObject s=obj.getAsJsonObject("overview_polyline");
		
		System.out.println(s.toString());
	}
	
	@POST
	@Path("init")
	@Consumes(MediaType.APPLICATION_JSON)
	public void getInitDetails(){
		
	}

}
