package com.trailfinder.dao;

public interface ITrailDAO {

	/*
	 * Should return a JSON list of trails from Google Places 
	 */
	public String findTrails(String placesSearchUrl) throws Exception;
	
}
