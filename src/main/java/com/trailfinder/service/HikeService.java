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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrailDTO> getNearbyTrails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EventDTO> getEvents() throws Exception {
		// TODO Set the creators of the events and return the list of events
		Iterable<EventDTO> events = eventDAO.fetchEvents();
		for (EventDTO event : events) {
			EventCreatorDTO creator = new EventCreatorDTO("Johnny", "guitar", "fakeemail@email.com", "5135555555");
			event.setEventCreator(creator);
		}
		return events;
	}

	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// persist the event and creator
		boolean isEventCreated = eventDAO.createEvent(event);
		boolean isCreatorSaved = creatorDAO.saveEventCreator(event.getEventCreator());
		if (isEventCreated && isCreatorSaved) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean attendEvent(EventAttendeeDTO attendee) throws Exception {
		// TODO persist the attendee
		boolean isEventAttended = attendeeDAO.saveEventAttendee(attendee);
		return isEventAttended;
	}

}
