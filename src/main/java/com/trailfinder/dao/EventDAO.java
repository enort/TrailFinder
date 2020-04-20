package com.trailfinder.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dto.EventDTO;

@Component
public class EventDAO implements IEventDAO {

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// save event info into the table and return if successful
		EventDTO eventCopy = eventRepository.save(event);
		if (eventCopy.equals(event)) {
			return true;
		}
		return false;
	}

	@Override
	public Iterable<EventDTO> fetchEvents() throws Exception {
		// return all events from table
		return eventRepository.findAll(); 
	}

}
