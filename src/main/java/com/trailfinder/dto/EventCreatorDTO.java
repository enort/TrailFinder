package com.trailfinder.dto;

/*
 * @author Konrad Schaller
 * A DTO that will map to database
 */
public class EventCreatorDTO {
	
	private int creatorId;
	private int eventId;
	private String creatorFirstName;
	private String creatorLastName;
	private String creatorEmail;
	private String phoneNumber;
	
	// Custom constructor to build an event creator object
	public EventCreatorDTO(int eventId, String creatorFirstName, String creatorLastName, String creatorEmail, String phoneNumber) {
		this.eventId = eventId;
		this.creatorFirstName = creatorFirstName;
		this.creatorLastName = creatorLastName;
		this.creatorEmail = creatorEmail;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return the creatorId
	 */
	public int getCreatorId() {
		return creatorId;
	}
	/**
	 * @param creatorId the creatorId to set
	 */
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
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
	/**
	 * @return the creatorLastName
	 */
	public String getCreatorLastName() {
		return creatorLastName;
	}
	/**
	 * @param creatorLastName the creatorLastName to set
	 */
	public void setCreatorLastName(String creatorLastName) {
		this.creatorLastName = creatorLastName;
	}
	/**
	 * @return the creatorEmail
	 */
	public String getCreatorEmail() {
		return creatorEmail;
	}
	/**
	 * @param creatorEmail the creatorEmail to set
	 */
	public void setCreatorEmail(String creatorEmail) {
		this.creatorEmail = creatorEmail;
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
		return this.creatorFirstName + " " + this.creatorLastName;
	}

}
