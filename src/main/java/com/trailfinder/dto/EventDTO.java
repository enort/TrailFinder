/**
 * 
 */
package com.trailfinder.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author LookItsCashew
 * DTO for Events posted on application
 */
@SuppressWarnings("serial")
@Entity
@Table(name="events")
public class EventDTO implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="EventID")
	private int eventId;
	@Column(name="Distance")
	private double distance;
	@Column(name="EventStart")
	private LocalDateTime eventStart;
	@Column(name="EventEnd")
	private LocalDateTime eventEnd;
	@Column(name="Latitude")
	private String Latitude;
	@Column(name="Longitude")
	private String Longitude;
	@Transient
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
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String startTimeString = this.eventStart.toString();
		LocalDateTime eventStartTime = LocalDateTime.parse(startTimeString.replace("T", " "), formatter);
		return eventStartTime;
	}

	/**
	 * @param eventStart the eventStart to set
	 */
	public void setEventStart(LocalDateTime eventStart) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String endTimeString = eventStart.toString();
		LocalDateTime eventStartTime = LocalDateTime.parse(endTimeString.replace("T", " "), formatter);
		this.eventStart = eventStartTime;
	}

	/**
	 * @return the eventEnd
	 */
	public LocalDateTime getEventEnd() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String endTimeString = this.eventEnd.toString();
		LocalDateTime eventEndTime = LocalDateTime.parse(endTimeString.replace("T", " "), formatter);
		return eventEndTime;
	}

	/**
	 * @param eventEnd the eventEnd to set
	 */
	public void setEventEnd(LocalDateTime eventEnd) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String endTimeString = eventEnd.toString();
		LocalDateTime eventEndTime = LocalDateTime.parse(endTimeString.replace("T", " "), formatter);
		this.eventEnd = eventEndTime;
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
	
	public String toString() {
		return eventCreator.getCreatorFirstName() + "'s hiking event";
	}
}
