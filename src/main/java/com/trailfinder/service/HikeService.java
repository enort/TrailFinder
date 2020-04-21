package com.trailfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dao.IEventAttendeeDAO;
import com.trailfinder.dao.IEventCreatorDAO;
import com.trailfinder.dao.IEventDAO;
import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventCreatorDTO;
import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.TrailDTO;

@Component
public class HikeService implements IHikeService {
	
	@Autowired
	IEventDAO eventDAO;
	@Autowired 
	IEventCreatorDAO creatorDAO;
	@Autowired
	IEventAttendeeDAO attendeeDAO;

	@Override
	public List<EventAttendeeDTO> getAttendees(EventDTO event) throws Exception {
		// Return the list of attendees for an event
		List<EventAttendeeDTO> attendees = attendeeDAO.fetchEventAttendees(event);
		for (EventAttendeeDTO attendee : attendees) {
			attendee.setEvent(event);
		}
		return attendees;
	}

	@Override
	public List<TrailDTO> getNearbyTrails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EventDTO> getEvents() throws Exception {
		// Set the creators of the events and return the list of events
		Iterable<EventDTO> events = eventDAO.fetchEvents();
		for (EventDTO event : events) {
			event.setEventCreator(creatorDAO.fetchEventCreator(event));
			event.getEventCreator().setEvent(event);
		}
		return events;
	}

	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// persist the event and creator
		boolean isEventCreated = eventDAO.createEvent(event);
		EventCreatorDTO creator = event.getEventCreator();
		creator.setEventId(event.getEventId());
		boolean isCreatorSaved = creatorDAO.saveEventCreator(creator);
		if (isEventCreated && isCreatorSaved) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean attendEvent(EventAttendeeDTO attendee) throws Exception {
		// persist the attendee
		boolean isEventAttended = attendeeDAO.saveEventAttendee(attendee);
		return isEventAttended;
	}

}
