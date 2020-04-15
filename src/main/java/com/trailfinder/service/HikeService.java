package com.trailfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trailfinder.dao.IEventDAO;
import com.trailfinder.dto.EventAttendeeDTO;
import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.TrailDTO;

@Component
public class HikeService implements IHikeService {
	
	@Autowired
	IEventDAO eventDAO;

	@Override
	public List<EventAttendeeDTO> getAttendees(EventDTO event) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrailDTO> getNearbyTrails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventDTO> getEvents() throws Exception {
		// TODO Auto-generated method stub
		return eventDAO.fetchEvents();
	}

	@Override
	public boolean createEvent(EventDTO event) throws Exception {
		// TODO Auto-generated method stub
		eventDAO.createEvent(event);
		return false;
	}

}
