/**
 * 
 */
package com.trailfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trailfinder.dto.EventDTO;
import com.trailfinder.dto.ProfileDTO;
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
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String base(Model model) {
		List<EventDTO> events = hikeService.getEvents();
		model.addAttribute("List<EventDTO>", events);
		return "index";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String prof(Model model) {
		ProfileDTO profile = hikeService.getProfile(0);
		model.addAttribute("ProfileDTO", profile);
		return "profile";
	}
	

}
