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
		int i;
		for (i = 0; i < 5; i++)
		{
			ProfileDTO testProfile = new ProfileDTO();
			testProfile.setProfileId(i);
			testProfile.setFirstName("TestName" + i);
			testProfile.setBio("TestBio");
			testProfile.setEvents(null);
			profiles.add(testProfile);
		}
		
		// Check which profile was selected
		ProfileDTO profile = new ProfileDTO();
		switch (profileId) 
		{
			case 0: profile = profiles.get(0); break;
			case 1: profile = profiles.get(1); break;
			case 2: profile = profiles.get(2); break;
			case 3: profile = profiles.get(3); break;
			case 4: profile = profiles.get(4); break;
			default: profile = null; break;
		}
		
		return profile;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createEvent(EventDTO event) {
		// TODO Auto-generated method stub
		
	}
	
	

}
