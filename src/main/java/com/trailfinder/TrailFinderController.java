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
import org.springframework.web.bind.annotation.RequestParam;

import com.trailfinder.dto.EventDTO;
import com.trailfinder.service.IHikeService;

/**
 * @author LookItsCashew
 * Controller for the TrailFinder UI layer
 */

@Controller
public class TrailFinderController {
	
	// Private Fields
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
	
	@RequestMapping("/searchResults")
	public String searchResults(@RequestParam(value="searchTerm", required=true)String searchTerm)
	{
		String updatedSearchTerm = searchTerm + ""; 
		return "index";
	}
}
