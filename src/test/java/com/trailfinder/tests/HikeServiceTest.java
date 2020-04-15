/**
 * 
 */
package com.trailfinder.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
		events = hikeService.getEvents();
	}

	private void thenListOfEventsWillBeReturned() {
		// TODO Auto-generated method stub
		assertEquals(5, events.size());
	}
	
}
