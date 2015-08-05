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
 
 /*public static void main(String args[]){
	 ArrayList<Location> a = (ArrayList<Location>) PolylineDecoder.decodePoly("a~l~Fjk~uOnzh@vlbBtc~@tsE`vnApw{A`dw@~w\\|tNtqf@l{Yd_Fblh@rxo@b}@xxSfytAblk@xxaBeJxlcBb~t@zbh@jc|Bx}C`rv@rw|@rlhA~dVzeo@vrSnc}Axf]fjz@xfFbw~@dz{A~d{A|zOxbrBbdUvpo@`cFp~xBc`Hk@nurDznmFfwMbwz@bbl@lq~@loPpxq@bw_@v|{CbtY~jGqeMb{iF|n\\~mbDzeVh_Wr|Efc\\x`Ij{kE}mAb~uF{cNd}xBjp]fulBiwJpgg@|kHntyArpb@bijCk_Kv~eGyqTj_|@`uV`k|DcsNdwxAott@r}q@_gc@nu`CnvHx`k@dse@j|p@zpiAp|gEicy@`omFvaErfo@igQxnlApqGze~AsyRzrjAb__@ftyB}pIlo_BflmA~yQftNboWzoAlzp@mz`@|}_@fda@jakEitAn{fB_a]lexClshBtmqAdmY_hLxiZd~XtaBndgC");
	 for(Location x: a)
	 System.out.println(x.getLatitude() +" "+x.getLongitude());	
 }*/
}
