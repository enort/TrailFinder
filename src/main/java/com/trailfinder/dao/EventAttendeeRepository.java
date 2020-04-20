package com.trailfinder.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trailfinder.dto.EventAttendeeDTO;

public interface EventAttendeeRepository extends CrudRepository<EventAttendeeDTO, Integer> {

	List<EventAttendeeDTO> findByEventId(int eventId);
	
}
