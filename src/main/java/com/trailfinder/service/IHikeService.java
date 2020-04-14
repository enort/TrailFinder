/**
 * 
 */
package com.trailfinder.service;

import java.util.List;

import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.ProfileDTO;
import com.trailfinder.dto.TrailDTO;

/**
 * @author LookItsCashew
 *
 */
public interface IHikeService {
	
	/*
	 * Gets the list of attendees of an event
	 * @param event the event dto the user is viewing
	 * @return profiles a list of profiles
	 */
	public List<ProfileDTO> getAttendees(EventDTO event);
	
	/*
	 * Retrieve a list of nearby trails from Google Places
	 * @return trails a list of TrailDTOs
	 */
	public List<TrailDTO> getNearbyTrails();
	
	/*
	 * Retrieve all events using DAO access
	 * @return events a list of EventDTOs
	 */
	public List<EventDTO> getEvents();
	
	/*
	 * Create an event using DAO access
	 * @param profile a ProfileDTO 
	 */
	public void createEvent(EventDTO event);
}
