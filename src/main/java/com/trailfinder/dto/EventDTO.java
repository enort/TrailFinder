/**
 * 
 */
package com.trailfinder.dto;

import java.util.Date;
import java.util.List;

/**
 * @author LookItsCashew
 * DTO for Events posted on application
 */
public class EventDTO {

	// Private fields
	private int eventId;
	private double distance;
	private Date eventStart;
	private Date eventEnd;
	private double Latitude;
	private double Longitude;
	private ProfileDTO eventCreator;
	private List<ProfileDTO> attendees;
	
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
	public Date getEventStart() {
		return eventStart;
	}

	/**
	 * @param eventStart the eventStart to set
	 */
	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}

	/**
	 * @return the eventEnd
	 */
	public Date getEventEnd() {
		return eventEnd;
	}

	/**
	 * @param eventEnd the eventEnd to set
	 */
	public void setEventEnd(Date eventEnd) {
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
	public ProfileDTO getEventCreator() {
		return eventCreator;
	}

	/**
	 * @param eventCreator the eventCreator to set
	 */
	public void setEventCreator(ProfileDTO eventCreator) {
		this.eventCreator = eventCreator;
	}

	/**
	 * @return the attendees
	 */
	public List<ProfileDTO> getAttendees() {
		return attendees;
	}

	/**
	 * @param atendees the attendees to set
	 */
	public void setAttendees(List<ProfileDTO> attendees) {
		this.attendees = attendees;
	}
}
