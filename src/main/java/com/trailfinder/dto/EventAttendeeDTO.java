package com.trailfinder.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * @author Konrad Schaller
 * DTO to represent attendees for event
 */
@Entity
@Table(name="eventattendees")
public class EventAttendeeDTO {
	
	@Id
	@GeneratedValue
	@Column(name="AttendeeID")
	private int attendeeId;
	//@Column(name="EventID")
	//private int eventId;
	@Column(name="AttendeeFirstName")
	private String attendeeFirstName;
	@Column(name="AttendeeLastName")
	private String attendeeLastname;
	@Column(name="AttendeeEmail")
	private String attendeeEmail;
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name="EventID")
	private EventDTO event;
	
	// Custom constructor
	public EventAttendeeDTO(String attendeeFirstName, String attendeeLastName, String attendeeEmail, String phoneNumber) {
		//this.eventId = eventId;
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
