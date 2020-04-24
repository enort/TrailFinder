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

import com.google.gson.Gson;
import com.trailfinder.dto.EventAttendeeDTO;
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
	
	@RequestMapping(value="/Event", method=RequestMethod.GET)
	public String evt(@RequestParam(value="eventId") int eventId, Model model) {
		EventDTO eventDTO;
		List<EventAttendeeDTO> attendees=null;
		try {
			eventDTO = hikeService.fetchEventById(eventId);
			attendees = hikeService.getAttendees(eventDTO);
			model.addAttribute("event", eventDTO);
			model.addAttribute("attendees", attendees);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "eventdetails";
	}
	
	@RequestMapping(value="/Event/Attend", method=RequestMethod.POST)
	public String attendEvent(@RequestParam(value="eventId", required=true) int eventId, EventAttendeeDTO attendee, Model model) {
		boolean isEventAttended;
		try {
			// fetch the event user is attending
			EventDTO eventAttending = hikeService.fetchEventById(attendee.getEventId());
			attendee.setEvent(eventAttending);
			
			// Persist the attendee
			isEventAttended = hikeService.attendEvent(attendee);
			if (isEventAttended) {
				model.addAttribute("event", eventAttending);
				return "eventdetails";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
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
	
	/**
	 * Needs to return the JSON of all events from persistence
	 * @return events the events to be returned to the view
	 */
	@RequestMapping(value="/getEventsJSON", method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public String getEventsJSON() {
		// List of trails to return 
		List<EventDTO> events = new ArrayList<>();
		try {
			events = (List<EventDTO>) hikeService.getEvents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject response= new JSONObject();
		JSONArray responseArray = new JSONArray();
		for (EventDTO event : events) {
			//StringBuilder sb = new StringBuilder();
			//sb.append("{").append("''");
			JSONObject eventObject = new JSONObject();
			eventObject.put("distance", event.getDistance());
			eventObject.put("eventStart", event.getEventStart());
			eventObject.put("eventEnd", event.getEventEnd());
			eventObject.put("Latitude", event.getLatitude());
			eventObject.put("Longitude", event.getLongitude());
			eventObject.put("eventId", event.getEventId());
			//eventObject.put("eventCreator", event.getEventCreator());
			responseArray.put(eventObject);
		}
		response.put("events", responseArray);
		return response.toString();
	}

}
