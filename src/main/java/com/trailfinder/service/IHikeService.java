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
	 * Retrieve a user's profile using a profileId
	 * @return profile a ProfileDTO 
	 */
	public ProfileDTO getProfile(int profileId);
	
	/*
	 * Save user profile using DAO access
	 * @param profile a ProfileDTO 
	 */
	public void saveProfile(ProfileDTO profile);
	
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
