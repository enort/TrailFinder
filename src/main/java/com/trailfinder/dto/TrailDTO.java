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
	 * @param set the name
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
	 * @param set the latitude
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
	 * @param set the longitude
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


}
