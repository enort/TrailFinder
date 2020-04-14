/**
 * 
 */
package com.trailfinder.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LookItsCashew
 * DTO for Events posted on application
 */
public class EventDTO {

	private int eventId;
	private double distance;
	private LocalDateTime eventStart;
	private LocalDateTime eventEnd;
	private String Latitude;
	private String Longitude;
	private EventCreatorDTO eventCreator;
	
	/**
	 * Create and initialize a new instance of the EventDTO
	 * 
	 * @param eventId
	 * @param distance
	 * @param eventStart
	 * @param eventEnd
	 * @param latitude
	 * @param longitude
	 * @param eventCreator
	 */
	public EventDTO(double distance, LocalDateTime eventStart, LocalDateTime eventEnd, String latitude, 
			String longitude, EventCreatorDTO eventCreator) 
	{
		this.distance = distance;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.Latitude = latitude;
		this.Longitude = longitude;
		this.eventCreator = eventCreator;
	}
	
	/**
	 * Create an instance of EventDTO
	 */
	public EventDTO() {
	
	}
	
	/**
	 * @return the eventId
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the eventStart
	 */
	public LocalDateTime getEventStart() {
		return eventStart;
	}

	/**
	 * @param eventStart the eventStart to set
	 */
	public void setEventStart(LocalDateTime eventStart) {
		this.eventStart = eventStart;
	}

	/**
	 * @return the eventEnd
	 */
	public LocalDateTime getEventEnd() {
		return eventEnd;
	}

	/**
	 * @param eventEnd the eventEnd to set
	 */
	public void setEventEnd(LocalDateTime eventEnd) {
		this.eventEnd = eventEnd;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return Latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return Longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	/**
	 * @return the eventCreator
	 */
	public EventCreatorDTO getEventCreator() {
		return eventCreator;
	}

	/**
	 * @param eventCreator the eventCreator to set
	 */
	public void setEventCreator(EventCreatorDTO eventCreator) {
		this.eventCreator = eventCreator;
	}
}
