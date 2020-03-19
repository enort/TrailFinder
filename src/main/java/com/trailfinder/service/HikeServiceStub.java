/**
 * 
 */
package com.trailfinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

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
	public ProfileDTO getProfile(int profileId) {
		// TODO create a List of profiles and check if the passed Id matches any
		List<ProfileDTO> profiles = new ArrayList<ProfileDTO>();
		
		// Create 5 profiles
		for (int i = 0; i < 5; i++)
		{
			profiles.add(new ProfileDTO(i, "TestName" + i, "TestBio", null));
		}
		
		return profileId >= 0 && profileId < profiles.size() ? profiles.get(profileId) : null;
	}

	@Override
	public void saveProfile(ProfileDTO profile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TrailDTO> getNearbyTrails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventDTO> getEvents() {
		// TODO Create list of events to be returned
		List<EventDTO> events = new ArrayList<EventDTO>();
		
		// Create 5 events
		for (int i = 0; i < 5; i++)
		{
			ProfileDTO profile = new ProfileDTO(i, "test " + i, "TestBio " + i, null);
			
			EventDTO event = new EventDTO();
			event.setEventId(i);
			event.setLatitude(39.1330 + i);
			event.setLongitude(-84.4134 + i);
			event.setDistance(i + (i/2));
			event.setEventCreator(profile);
			events.add(event);
		}
		
		return events;
	}

	@Override
	public void createEvent(EventDTO event) {
		// TODO Auto-generated method stub
		
	}
	
	

}
