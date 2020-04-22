/**
 * 
 */
package com.trailfinder.service;

import java.util.List;
import java.util.Optional;

import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.TrailDTO;

/**
 * @author LookItsCashew
 *
 */
public interface IHikeService {
	
	/**
	 * Gets the list of attendees of an event
	 * @param event the event dto the user is viewing
	 * @return profiles a list of profiles
	 */
	public List<EventAttendeeDTO> getAttendees(EventDTO event) throws Exception ;
	
	/**
	 * Retrieve a list of nearby trails from Google Places
	 * @return trails a list of TrailDTOs
	 */
	public List<TrailDTO> getNearbyTrails(double lat, double lng) throws Exception;
	
	/**
	 * Retrieve all events using DAO access
	 * @return events a list of EventDTOs
	 */
	public Iterable<EventDTO> getEvents() throws Exception ;
	
	/**
	 * Create an event using DAO access
	 * @param profile a ProfileDTO 
	 */
	public boolean createEvent(EventDTO event) throws Exception ;

	/**
	 * Adds the registered user to the event attendee list
	 * @param attendee the attendee to add
	 * @return value of successful save or not
	 */
	public boolean attendEvent(EventAttendeeDTO attendee) throws Exception;

	/**
	 * returns the event dto by Id
	 * @param eventId
	 * @return
	 * @throws Exception
	 */
	public Optional<EventDTO> fetchEventById(int eventId) throws Exception;

}
