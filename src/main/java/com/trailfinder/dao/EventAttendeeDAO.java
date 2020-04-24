package com.trailfinder.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventDTO;

@Component
public class EventAttendeeDAO implements IEventAttendeeDAO {
	
	@Autowired
	EventAttendeeRepository attendeeRepository;

	@Override
	public boolean saveEventAttendee(EventAttendeeDTO attendee) throws Exception {
		// TODO Persist attendee to the event
		EventAttendeeDTO attendeeCopy = attendeeRepository.save(attendee);
		if (attendeeCopy.equals(attendee)) {
			return true;
		}
		return false;
	}

	@Override
	public List<EventAttendeeDTO> fetchEventAttendees(EventDTO event) throws Exception {
		// TODO retrieve event's attendees
		return attendeeRepository.findByEventId(event.getEventId());
	}

}
