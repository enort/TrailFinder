/**
 * 
 */
package com.trailfinder.dto;

/**
 * @author Administrator
 * DTO for Events posted on application
 */
public class EventDTO {

	// Private fields
	private int EventId;
	private double Length;
	private double Latitude;
	private double Longitude;
	
	// Getters and Setters
	/*
	 * Sets value of eventId
	 * @param Id of event
	 */
	public void setId(int eventId) {
		this.EventId = eventId;
	}
	
	/*
	 * Gets value of eventId
	 * @return EventId
	 */
	public int getId() {
		return EventId;
	}
	
	/*
	 * Sets value of Length
	 * @param length of event
	 */
	public void setLength(double length) {
		this.Length = length;
	}
	
	/*
	 * Gets value of length (distance) of event
	 * @return Length
	 */
	public double getLength() {
		return Length;
	}
	
	/*
	 * Sets value of Latitude of event start location
	 * @param latitude of start location
	 */
	public void setLatitude(double latitude) {
		this.Latitude = latitude;
	}
	
	/*
	 * Gets value of Latitude of start location
	 * @return Latitude
	 */
	public double getLatitude() {
		return Latitude;
	}
	
	/*
	 * Sets value of Longitude of start location
	 * @param longitude of start location
	 */
	public void setLongitude(double longitude) {
		this.Longitude = longitude;
	}
	
	/*
	 * Gets value of Longitude of start location
	 * @return Longitude
	 */
	public double getLongitude() {
		return Longitude;
	}
}
