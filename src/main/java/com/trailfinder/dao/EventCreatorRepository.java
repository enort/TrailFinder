package com.trailfinder.dao;

import org.springframework.data.repository.CrudRepository;

import com.trailfinder.dto.EventCreatorDTO;

public interface EventCreatorRepository extends CrudRepository<EventCreatorDTO, Integer> {

	EventCreatorDTO findByEventId(int eventId);
	
}
