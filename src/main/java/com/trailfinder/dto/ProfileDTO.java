package com.trailfinder.dto;

import java.util.List;

/**
 * @author LookItsCashew
 * DTO for profile information
 */
public class ProfileDTO {

	private int profileId;
	private String firstName;
	private String bio;
	private List<EventDTO> events;
	
	public ProfileDTO() {	
	}
	
	/**
	 * Create and initialize a new instance of the ProfileDTO
	 * @param profileId
	 * @param firstName
	 * @param bio
	 * @param events
	 */
	public ProfileDTO(int profileId, String firstName, String bio, List<EventDTO> events) {
		this.profileId = profileId;
		this.firstName = firstName;
		this.bio = bio;
		this.events = events;
	}	
	
	/**
	 * @return the profileId
	 */
	public int getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}
	/**
	 * @return the events
	 */
	public List<EventDTO> getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(List<EventDTO> events) {
		this.events = events;
	}
	
	
	
}
