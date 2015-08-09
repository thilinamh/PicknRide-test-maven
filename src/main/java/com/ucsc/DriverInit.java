package com.ucsc;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;







import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.maps.model.*;
import com.ucsc.model.DriverInitModel;
import com.ucsc.model.RideSession;
import com.ucsc.repo.SessionRepo;

import decoder.Location;
import decoder.PolylineDecoder;

@Path("DriverInit")
public class DriverInit {
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void getRoute(DriverInitModel ride){
		//array.getAsString();
		
		 
		//JsonElement a=  new com.google.gson.JsonParser().parse(array);
		//JsonObject obj = a.getAsJsonObject();
		//JsonObject s=obj.getAsJsonObject("overview_polyline");
		
		System.out.println(ride.getuID());
		String str ="a~l~Fjk~uOnzh@vlbBtc~@tsE`vnApw{A`dw@~w\\|tNtqf@l{Yd_Fblh@rxo@b}@xxSfytAblk@xxaBeJxlcBb~t@zbh@jc|Bx}C`rv@rw|@rlhA~dVzeo@vrSnc}Axf]fjz@xfFbw~@dz{A~d{A|zOxbrBbdUvpo@`cFp~xBc`Hk@nurDznmFfwMbwz@bbl@lq~@loPpxq@bw_@v|{CbtY~jGqeMb{iF|n\\~mbDzeVh_Wr|Efc\\x`Ij{kE}mAb~uF{cNd}xBjp]fulBiwJpgg@|kHntyArpb@bijCk_Kv~eGyqTj_|@`uV`k|DcsNdwxAott@r}q@_gc@nu`CnvHx`k@dse@j|p@zpiAp|gEicy@`omFvaErfo@igQxnlApqGze~AsyRzrjAb__@ftyB}pIlo_BflmA~yQftNboWzoAlzp@mz`@|}_@fda@jakEitAn{fB_a]lexClshBtmqAdmY_hLxiZd~XtaBndgC";
		//ArrayList<Location> loc =(ArrayList<Location>) PolylineDecoder.decodePoly(ride.getPoly());
		//System.out.println(str);
		if(ride !=null){
			//List<Location> locs = PolylineDecoder.decodePoly(ride.getPoly());
			//RideSession ridesession =new RideSession(ride.getuID(),ride.getStarting(),ride.getEnding(), locs);
			//SessionRepo.getSessionList().add(ridesession);
			//SessionRepo.getSessionList().
		}
		
		
	}

}
