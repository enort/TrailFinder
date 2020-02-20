package com.trailfinder.dao;

import com.trailfinder.dto.ProfileDTO;

/*
 * @author LookItsCashew
 */
public interface IProfileDAO {

	/*
	 * @return userProfile the user's profile represented by ProfileDTO
	 */
	public ProfileDTO getProfile();
	
	/*
	 * @param profile saves profile information
	 */
	public void saveProfile();
	
	/*
	 * @param userId ID of selected user to view profile information
	 */
	public ProfileDTO viewProfile(int userId);
}
