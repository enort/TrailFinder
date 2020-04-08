/**
 * 
 */
package com.trailfinder.dto;

/**
 * @author LookItsCashew
 * Represents a trail Place that is nearby from Google Places library
 * Will be separate entities from Events, which are user created and custom
 */
public class TrailDTO {
	
	// Private fields
	private int id;
	private String name;
	private double latitude;
	private double longitude;
	//Adds an interesting bit to the trail
	private String hotSpot;
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String gethotSpot(){
		return hotSpot;
	}
	public String sedhotSpot(String hotSpot){
		return hotSpot;
	}


}
