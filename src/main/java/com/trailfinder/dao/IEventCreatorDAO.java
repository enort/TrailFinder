package com.trailfinder.dao;

import java.util.Optional;

import com.trailfinder.dto.EventCreatorDTO;
import com.trailfinder.dto.EventDTO;

public interface IEventCreatorDAO {

	/*
	 * Saves the creator of the event to persistence
	 * @param eventCreator the creator of the event
	 * @return returns the result of the save
	 */
	public boolean saveEventCreator(EventCreatorDTO eventCreator) throws Exception;
	
	/*
	 * fetches the creator of an event
	 * @param event the event to fetch the creator from
	 * @return eventCreator the creator of the event
	 */
	public Optional<EventCreatorDTO> fetchEventCreator(EventDTO event) throws Exception;
	
}
