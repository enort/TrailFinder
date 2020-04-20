package com.trailfinder.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dto.EventCreatorDTO;
import com.trailfinder.dto.EventDTO;

@Component
public class EventCreatorDAO implements IEventCreatorDAO {
	
	@Autowired
	EventCreatorRepository creatorRepository;

	@Override
	public boolean saveEventCreator(EventCreatorDTO eventCreator) throws Exception {
		// TODO Save the registered creator of the event
		EventCreatorDTO creatorCopy = creatorRepository.save(eventCreator);
		if (creatorCopy.equals(eventCreator)) {
			return true;
		}
		return false;
	}

	@Override
	public Optional<EventCreatorDTO> fetchEventCreator(EventDTO event) throws Exception {
		// TODO Fetch the creator of the event based on event passed in
		return creatorRepository.findById(event.getEventCreator().getCreatorId());
	}

}
