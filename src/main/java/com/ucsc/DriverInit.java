package com.ucsc;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.google.maps.model.*;

@Path("Driverinit")
public class DriverInit {
	
	LatLng a= new LatLng(0, 0);
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void getRoute(String array){
		System.out.println(array);
	}
	
	@POST
	@Path("init")
	@Consumes(MediaType.APPLICATION_JSON)
	public void getInitDetails(){
		
	}

}
