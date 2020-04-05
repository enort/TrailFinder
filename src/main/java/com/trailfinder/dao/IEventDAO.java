package com.trailfinder.dao;
import com.trailfinder.dto.EventDTO;

/*
 * @author LookItsCashew
 */
public interface IEventDAO {
	
	/*
	 * @return eventList a list of Events represented by EventDTOs
	 */
	public EventDTO getEvent(int eventId);
	
	/*
	 * @param event creates an event visible to other users
	 */
	public void createEvent(EventDTO event);

}
