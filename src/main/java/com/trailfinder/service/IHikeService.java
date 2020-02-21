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
	 * Should retrieve a user's profile using DAO access
	 * @return profile a ProfileDTO 
	 */
	public ProfileDTO getProfile(int profileId);
	
	/*
	 * Should save the user's profile using DAO access
	 * @param profile a ProfileDTO 
	 */
	public void saveProfile(ProfileDTO profile);
	
	/*
	 * Should retrieve a list of nearby trails from Google Places
	 * @return trails a list of TrailDTOs
	 */
	public List<TrailDTO> getNearbyTrails();
	
	/*
	 * Should retrieve all events using DAO access
	 * @return events a list of EventDTOs
	 */
	public List<EventDTO> getEvents();
	
	/*
	 * Should create an event using DAO access
	 * @param profile a ProfileDTO 
	 */
	public void createEvent(EventDTO event);
}
