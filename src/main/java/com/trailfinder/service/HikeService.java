package com.trailfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.trailfinder.dao.IEventAttendeeDAO;
import com.trailfinder.dao.IEventCreatorDAO;
import com.trailfinder.dao.IEventDAO;
import com.trailfinder.dao.ITrailDAO;
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
	@Autowired
	ITrailDAO trailDAO;

	@Override
	@Cacheable("getAttendees")
	public List<EventAttendeeDTO> getAttendees(EventDTO event) throws Exception {
		// Return the list of attendees for an event
		List<EventAttendeeDTO> attendees = attendeeDAO.fetchEventAttendees(event);
		for (EventAttendeeDTO attendee : attendees) {
			attendee.setEvent(event);
		}
		return attendees;
	}

	@Override
	public List<TrailDTO> getNearbyTrails(double lat, double lng) throws Exception {
		// TODO Return a list of TrailDTOs that represent the returned Google Places API results
		
		// Build the request url
		StringBuilder requestUrl = new StringBuilder();
		requestUrl.append("https://maps.googleapis.com/maps/api/place/textsearch/json?query=trails&location=")
		.append(lat + ",")
		.append(lng)
		.append("&radius=10000")
		.append("&key=AIzaSyCmC6Uco6nl8sRYwKBa8Xnjll3olfbYGKM");
		
		// Connect to the Google server with the built request
		trailDAO.findTrails(requestUrl.toString());
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
