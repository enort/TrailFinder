/**
 * 
 */
package com.trailfinder.service;

import com.trailfinder.dto.ProfileDTO;

/**
 * @author LookItsCashew
 *
 */
public interface IHikeService {

	/*
	 * Should retrieve a profile
	 * @return profile a ProfileDTO that contains the profile information of the user
	 */
	public ProfileDTO getProfile();
}
