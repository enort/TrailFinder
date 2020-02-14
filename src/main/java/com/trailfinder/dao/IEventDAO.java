package com.trailfinder.dao;
import java.util.List;

import com.trailfinder.dto.*;

/*
 * @author LookItsCashew
 */
public interface IEventDAO {
	
	/*
	 * @return eventList a list of Events represented by EventDTOs
	 */
	public List<EventDTO> getEvents();
	
	/*
	 * @param event creates an event visible to other users
	 */
	public void createEvent(EventDTO event);

}
