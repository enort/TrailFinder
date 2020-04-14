package com.trailfinder.dto;

/*
 * @author Konrad Schaller
 * DTO to represent attendees for event
 */
public class EventAttendeeDTO {
	
	private int attendeeId;
	private int eventId;
	private String attendeeFirstName;
	private String attendeeLastname;
	private String attendeeEmail;
	private String phoneNumber;
	
	// Custom constructor
	public EventAttendeeDTO(int eventId, String attendeeFirstName, String attendeeLastName, String attendeeEmail, String phoneNumber) {
		this.eventId = eventId;
		this.attendeeFirstName = attendeeFirstName;
		this.attendeeLastname = attendeeLastName;
		this.attendeeEmail = attendeeEmail;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the attendeeId
	 */
	public int getAttendeeId() {
		return attendeeId;
	}

	/**
	 * @param attendeeId the attendeeId to set
	 */
	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
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
	 * @return the attendeeFirstName
	 */
	public String getAttendeeFirstName() {
		return attendeeFirstName;
	}

	/**
	 * @param attendeeFirstName the attendeeFirstName to set
	 */
	public void setAttendeeFirstName(String attendeeFirstName) {
		this.attendeeFirstName = attendeeFirstName;
	}

	/**
	 * @return the attendeeLastname
	 */
	public String getAttendeeLastname() {
		return attendeeLastname;
	}

	/**
	 * @param attendeeLastname the attendeeLastname to set
	 */
	public void setAttendeeLastname(String attendeeLastname) {
		this.attendeeLastname = attendeeLastname;
	}

	/**
	 * @return the attendeeEmail
	 */
	public String getAttendeeEmail() {
		return attendeeEmail;
	}

	/**
	 * @param attendeeEmail the attendeeEmail to set
	 */
	public void setAttendeeEmail(String attendeeEmail) {
		this.attendeeEmail = attendeeEmail;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return this.attendeeFirstName + " " + this.attendeeLastname;
	}

}
