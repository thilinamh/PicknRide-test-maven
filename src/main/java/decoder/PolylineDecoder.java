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
 
 public  static boolean isInside(Location circle, double radius,Location point){
	 double center_x=circle.getLatitude();
	 double center_y=circle.getLongitude();
	 double x=point.getLatitude();
	 double y=point.getLongitude();
	 
		    double square_dist =Math.pow( (center_x - x) , 2) + Math.pow((center_y - y) , 2);
		    return square_dist <= Math.pow(radius , 2);
 }
 
 public static void main(String args[]){
	 String a1="gvq@etplNj@fA^`An@fBRxAJlARl@C`@KXY^CVBPJb@L~@JpA?fB?xBC~ERbDr@xf@VtQ`@fYv@~k@ZxTXdVp@~k@H~FtBtLJbC";
	 String b="euuq@isglNx@b@pH|DFBjItChDuAnPs@vHbAvFr@jM~L`IhD|CtAzDv_@tBjSZrWVnTfDdVd@bBt@fDrAjG^nA`@vBb@bBh@fBfA~EnA~Dh@bBj@xCJh@Bh@FtAFfA@bAXnIP|CRzDDZ@~@Dr@DXFJ~@bC`BnBj@`ARz@DXAPML]Nm@XaCv@OHGPo@jG_@zCKjC?p@@j@BnAV~CXjBFzALtBXtCb@|AnApD";
	 String c ="ablq@sbtlNwC]mAs@aCg@}DaAwBs@mCaAqAsAkB{@uABkFpAcEz@qChBwAlAwAbAuChBqCdAsBx@iB~@sAZgGjBmIxA{HdAeDB_DVcInA_HjAoAj@oMbHiGdDyEz@}GjA_KnAyLj@_Dz@oCl@gEdBuDtDiDt@gEl@wEd@kDbAoBt@oAJuA?mAVgA?qBv@cFdCsDhAmDhBuBfAq@v@}AhAuBfAaE|C_CzBaB~Bm@~@Qp@a@\\aElBwCRqD^";
	 String d="cpqq@a|}kN\\ETI`@Oj@YfAm@t@e@p@e@n@a@`@Y\\[ZUPKNGTA\\?D@h@@\\?^CXETIPMRSTYRW^Yb@_@TWX]TUNQPQRMb@Ob@F`@QTBRDVLXLTJXRb@j@RX^h@`B`Dl@dAJ\\J\\B`@?^A~@?BCvB?~DE~ECxEE~DAxBBjBDhAD`@HVPVNPNHXN^Rb@PRFLDLD";
	 String y="wxok@}odiNCr@KtAaA`Da@pAE|ABfACHSZGLELAPBVUb@Mx@C`@Dj@Lt@AbALd@?PI\\QR]Zk@f@e@b@GF";
	 ArrayList<Location> a = (ArrayList<Location>) PolylineDecoder.decodePoly(y);
	 
	 for(Location x: a){
		 
		 if(isInside(new Location(40.6174 ,-88.82182), 0.2,x)) {
			 System.out.println(x.getLatitude() +" "+x.getLongitude());	
		 }
	 System.out.println(x.getLatitude() +" "+x.getLongitude());	
 }
 }
}
