package decoder;

import java.util.*;

public class PolylineDecoder {
	
 public static List<Location> decodePoly(String encoded) {
	 
  ArrayList<Location> poly = new ArrayList<Location>();
  int index = 0, len = encoded.length();
  int lat = 0, lng = 0;
  while (index < len) {
   int b, shift = 0, result = 0;
   do {
    b = encoded.charAt(index++) - 63;
    result |= (b & 0x1f) << shift;
    shift += 5;
   } while (b >= 0x20);
   int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
   lat += dlat;
   shift = 0;
   result = 0;
   do {
    b = encoded.charAt(index++) - 63;
    result |= (b & 0x1f) << shift;
    shift += 5;
   } while (b >= 0x20);
   int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
   lng += dlng;
   Location p = new Location((((double) lat / 1E5)),
     (((double) lng / 1E5)));
   poly.add(p);
  }
  return poly;
 }
 
 public static void main(String args[]){
	 ArrayList<Location> a = (ArrayList<Location>) PolylineDecoder.decodePoly("}sj~FrdzuOskDbki@`eJgoQ??xkC|cNzkHdP");
	 for(Location x: a)
	 System.out.println(x.getLatitude() +" "+x.getLongitude());	
 }
}
