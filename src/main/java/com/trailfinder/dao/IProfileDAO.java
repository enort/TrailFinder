package com.trailfinder.dao;

import com.trailfinder.dto.ProfileDTO;

/*
 * @author LookItsCashew
 */
public interface IProfileDAO {

	/*
	 * @return userProfile the user's profile represented by ProfileDTO
	 */
	public ProfileDTO getProfile(int profileId);
	
	/*
	 * Save user profile creation
	 * @param profile saves profile information
	 */
	public void saveProfile(ProfileDTO profile);
	
}
