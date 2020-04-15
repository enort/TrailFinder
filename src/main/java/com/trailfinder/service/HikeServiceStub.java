/**
 * 
 */
package com.trailfinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.ProfileDTO;
import com.trailfinder.dto.TrailDTO;

/**
 * @author LookItsCashew
 *
 */
@Component
public class HikeServiceStub  implements IHikeService {

	@Override
	public List<TrailDTO> getNearbyTrails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventDTO> getEvents() throws Exception {
		// TODO Create list of events to be returned
		List<EventDTO> events = new ArrayList<EventDTO>();
		
		// Create 5 events
		for (int i = 0; i < 5; i++)
		{
			//ProfileDTO profile = new ProfileDTO(i, "test " + i, "TestBio " + i, null);
			
			//events.add(new EventDTO(i, 39.1330 + i, null, null, -84.4134 + i, i + (i/2), profile));
		}
		
		return events;
	}

	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EventAttendeeDTO> getAttendees(EventDTO event) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
