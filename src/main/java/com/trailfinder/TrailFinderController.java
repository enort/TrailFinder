/**
 * 
 */
package com.trailfinder;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trailfinder.dto.EventDTO;
import com.trailfinder.service.IHikeService;

/**
 * @author LookItsCashew
 * Controller for the TrailFinder UI layer
 */

@Controller
public class TrailFinderController {
	
	@Autowired
	private IHikeService hikeService;

	/**
	 * Handles return of home screen view and index end point
	 * @return index
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * Handles return of home screen view and / end point
	 * @return index
	 * @throws Exception 
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String base(Model model) {
		Iterable<EventDTO> events = null;
		try {
			events = hikeService.getEvents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("events", events);
		return "index";
	}
	
	@RequestMapping(value="/Event", method=RequestMethod.GET)
	public String evt(@RequestParam(value="eventId") int eventId, Model model) {
		Optional<EventDTO> eventDTObyID;
		EventDTO eventDTO=null;
		//int eventId=1;
		try {
			eventDTObyID = hikeService.fetchEventById(eventId);
			eventDTO=eventDTObyID.get();
			model.addAttribute("event", eventDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return "eventdetails";}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String prof(Model model) {
		//ProfileDTO profile = hikeService.getProfile(0);
		//model.addAttribute("ProfileDTO", profile);
		return "profile";
	}
	
	/**
	 * Needs to return the JSON of all trails from Google Places
	 * @param lat the latitiude of the user's current location
	 * @param lng the longitude of the user's current location
	 * @return trails the trails to be returned to the view
	 */
	

}
