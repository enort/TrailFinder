/**
 * 
 */
package com.trailfinder;



import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import com.trailfinder.dto.EventCreatorDTO;
import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.TrailDTO;
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
	
	@RequestMapping(value="/saveEvent", method=RequestMethod.GET)
	public String saveEvent(EventDTO eventDTO) {
		eventDTO.setEventId(10);
		return "eventcreation";
	}
	@RequestMapping(value="/eventcreation", method=RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("eventDTO", new EventDTO());
		return "eventcreation";
	}
	
	@RequestMapping(value="/Event", method=RequestMethod.GET)
	public String evt(@RequestParam(value="eventId") int eventId, Model model) {
		EventDTO eventDTObyID;
		EventDTO eventDTO=null;
		//int eventId=1;
		try {
			eventDTObyID = hikeService.fetchEventById(eventId);
			eventDTO=eventDTObyID;
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
	@RequestMapping(value="/fetchTrailList", method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<TrailDTO> fetchTrailList(@RequestParam(value="lat") double lat, @RequestParam(value="lng") double lng) {
		// List of trails to return 
		List<TrailDTO> trails = new ArrayList<>();
		try {
			trails = hikeService.getNearbyTrails(lat, lng);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return trails;
	}


}
