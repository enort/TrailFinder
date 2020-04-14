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
	private double Latitude;
	private double Longitude;
	private EventCreatorDTO eventCreator;
	private List<EventAttendeeDTO> eventAttendees;
	
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
	public EventDTO(double distance, LocalDateTime eventStart, LocalDateTime eventEnd, double latitude, 
			double longitude, EventCreatorDTO eventCreator, List<EventAttendeeDTO> eventAttendees) 
	{
		this.distance = distance;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.Latitude = latitude;
		this.Longitude = longitude;
		this.eventCreator = eventCreator;
		this.eventAttendees = eventAttendees;
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

	/**
	 * @return the eventAttendees
	 */
	public List<EventAttendeeDTO> getEventAttendees() {
		return eventAttendees;
	}

	/**
	 * @param eventAttendees the eventAttendees to set
	 */
	public void setEventAttendees(List<EventAttendeeDTO> eventAttendees) {
		this.eventAttendees = eventAttendees;
	}

}
