package com.trailfinder.dao;


import java.util.List;

import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventDTO;

public interface IEventAttendeeDAO {

	/*
	 * Should save the attendee when selected
	 * @param attendee the event attendee to be added
	 * @return the result of the save
	 */
	public boolean saveEventAttendee(EventAttendeeDTO attendee) throws Exception;
	
	/*
	 * retrieves all attendees for a particular event
	 * @param event the event to retrieve attendees from
	 * @return the list of attendees
	 */
	public List<EventAttendeeDTO> fetchEventAttendees(EventDTO event) throws Exception;
}
