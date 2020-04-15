package com.trailfinder.dao;
import java.util.List;

import com.trailfinder.dto.EventDTO;

/*
 * @author LookItsCashew
 */
public interface IEventDAO {
	
	/*
	 * @param event the event to create in persistence
	 * @return true or false value of creation
	 */
	public boolean createEvent(EventDTO event) throws Exception;

	/*
	 * @return events a list of events
	 */
	public List<EventDTO> fetchEvents() throws Exception;
}
