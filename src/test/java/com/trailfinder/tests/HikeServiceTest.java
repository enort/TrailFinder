/**
 * 
 */
package com.trailfinder.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.trailfinder.dao.IEventDAO;
import com.trailfinder.dto.*;
import com.trailfinder.service.IHikeService;

/**
 * This is a test for the hike service class
 * @author LookItsCashew
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class HikeServiceTest {
	
	@Autowired
	IHikeService hikeService;
	
	List<EventDTO> events;
	EventCreatorDTO creator;
	EventDTO event;
	EventCreatorDTO creatorCopy;
	EventDTO eventCopy;
	boolean isEventCreated;
	
	@Autowired
	IEventDAO eventDAO;

	private boolean isEventAttended;
	
	
	@Test
	public void getEvents_ReturnListOfEvents() throws Exception {
		givenHomePageWithMapOfSurroundingArea();
		whenMapRenders();
		thenListOfEventsWillBeReturned();
	}

	private void givenHomePageWithMapOfSurroundingArea() {
		// TODO Auto-generated method stub
		
	}

	private void whenMapRenders() throws Exception {
		// TODO Auto-generated method stub
		events = (List<EventDTO>) hikeService.getEvents();
	}

	private void thenListOfEventsWillBeReturned() {
		// TODO Auto-generated method stub
		assertEquals(5, events.size());
	}
	
	
	@Test
	public void createEvent_CreateEventWithCreatorInfo() throws Exception {
		givenARegisteredEventHasACreator();
		whenTheEventIsSaved();
		thenEventAndCreatorSaveReturnsTrue();
	}

	private void givenARegisteredEventHasACreator() {
		// TODO Create an "Event" that will register an event with the creator
		creator = new EventCreatorDTO("Konrad", "Schaller", "yeetville@ohio.com", "5135555555");
		//LocalDateTime timeNow = ;
		event = new EventDTO(5.0, LocalDateTime.of(2020, 4, 19, 4, 30), LocalDateTime.of(2020, 4, 19, 7, 30), "34.71", "-84.52", creator);
		eventCopy = event;
		eventCopy.setEventCreator(null);
		creatorCopy = event.getEventCreator();
		
	}

	private void whenTheEventIsSaved() {
		// TODO Save the event along with the creator info
		creator.setEvent(event);
		event.setEventCreator(creator);
		try {
			isEventCreated = hikeService.createEvent(event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void thenEventAndCreatorSaveReturnsTrue() {
		// TODO Auto-generated method stub
		assertTrue(isEventCreated);
	}
	
	@Test
	public void attendEvent_AttendEventWithAttendeeInfo() throws Exception {
		givenAnEventExists();
		whenTheEventIsAttended();
		thenAttendeeSaveReturnsTrue();
	}

	private void givenAnEventExists() throws Exception {
		// TODO retrieve an event from persistence and attend it
		Optional<EventDTO> event = eventDAO.fetchEventById(6);
		this.event = event.get();
	}

	private void whenTheEventIsAttended() {
		// TODO Join the event and persist the attendee
		EventAttendeeDTO attendee = new EventAttendeeDTO("David", "Tennant", "fakeemaillisting@email.com", "5555555555");
		attendee.setEvent(event);
		attendee.setEventId(event.getEventId());
		try {
			isEventAttended = hikeService.attendEvent(attendee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void thenAttendeeSaveReturnsTrue() {
		// TODO Assert the value of the event being attended
		assertTrue(isEventAttended);
	}
	
	
}
