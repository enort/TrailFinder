/**
 * 
 */
package com.trailfinder.dao;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

/**
 * @author schaller
 *
 */
@Component
public class TrailDAO implements ITrailDAO {

	@Override
	public String findTrails(String placesSearchUrl) throws Exception {
		// TODO Fetch the response from Google Places 
		
		// String builder to return the response 
		StringBuilder response = new StringBuilder();
		
		URL placesUrl = new URL(placesSearchUrl);
		
		// Create connection 
		HttpURLConnection connection = (HttpURLConnection) placesUrl.openConnection();
		
		try {
			InputStream inputStream = connection.getInputStream();
			BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
			
			// Read response into characters
			InputStreamReader streamReader = new InputStreamReader(bufferedInput);
			BufferedReader bufferedReader = new BufferedReader(streamReader); 
			
			// Read the lines and append them to response
			String inputLine = bufferedReader.readLine();
			while (inputLine != null) {
				// Append to the string builder result
				response.append(inputLine);
				// Check for next line
				inputLine = bufferedReader.readLine();
			}
		} finally {
			connection.disconnect();
		}
		return response.toString();
	}

}
