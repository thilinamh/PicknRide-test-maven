package decoder;

import java.io.Serializable;

public class Location implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -5804429854224706436L;

	private double latitude;

	 private double longitude;

	 public Location() {

	 }

	 public Location(Double latitude, Double longitude) {
	  this.latitude = latitude;
	  this.longitude = longitude;
	 }
	 
	 /**
	  * @return the latitude
	  */
	 public double getLatitude() {
	  return latitude;
	 }

	 /**
	  * @return the longitude
	  */
	 public double getLongitude() {
	  return longitude;
	 }
	}