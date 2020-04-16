package com.trailfinder.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dto.EventDTO;

@Component
public class EventDAO implements IEventDAO {

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// TODO save event info into the table and return if successful
		eventRepository.save(event);
		return false;
	}

	@Override
	public Iterable<EventDTO> fetchEvents() throws Exception {
		// TODO return all events from table
		return eventRepository.findAll(); 
	}

}
