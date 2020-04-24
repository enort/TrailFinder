package com.trailfinder.dto;

import java.time.LocalDateTime;


public class Event {

	private int eventId;
	private double distance;
	private LocalDateTime eventStart;
	private LocalDateTime eventEnd;
	private double Latitude;
	private double Longitude;
	private String creatorFirstName;
	
	/**
	 * Constructs a representation of EventDTO
	 * @param eventDTO the eventDTO to represent
	 * @return event the event object returned
	 */
	public Event (EventDTO eventDTO) {
		this.eventId = eventDTO.getEventId();
		this.distance = eventDTO.getDistance();	
		this.eventStart = eventDTO.getEventStart();
		this.eventEnd = eventDTO.getEventEnd();
		this.Latitude =  Double.valueOf(eventDTO.getLatitude());
		this.Longitude = Double.valueOf(eventDTO.getLongitude());
		this.creatorFirstName = eventDTO.getEventCreator().getCreatorFirstName();
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
	public double getLatitude() {
		return Latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return Longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}

	/**
	 * @return the creatorFirstName
	 */
	public String getCreatorFirstName() {
		return creatorFirstName;
	}

	/**
	 * @param creatorFirstName the creatorFirstName to set
	 */
	public void setCreatorFirstName(String creatorFirstName) {
		this.creatorFirstName = creatorFirstName;
	}
	
	
	
}
