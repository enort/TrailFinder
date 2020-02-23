/**
 * 
 */
package com.trailfinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trailfinder.service.IHikeService;

/**
 * @author LookItsCashew
 * Controller for the TrailFinder UI layer
 */

@Controller
public class TrailFinderController {
	
	// Private Fields
	@Autowired
	IHikeService hikeService;

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
	@RequestMapping("/")
	public String base() {
		return "index";
	}
}
