package com.trailfinder.dao;

import org.springframework.data.repository.CrudRepository;

import com.trailfinder.dto.EventDTO;

public interface EventRepository extends CrudRepository<EventDTO, Integer> {

}
