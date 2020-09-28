package com.weather.reporting.weather.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import io.restassured.RestAssured;
import io.restassured.response.Response;

// TODO: Auto-generated Javadoc
/**
 * The Class WeatherAPI.
 */
public class WeatherAPI {

	/**
	 * Gets the weather details of city.
	 * @param city the city
	 * @return the weather details of city
	 */
	public static void getWeatherDetailsOfCity(String url, String city) {
		url = url.replace("{city}", city);
		System.out.println("URL "+url);
		System.out.println("City "+city);
		Response response = RestAssured.given().when().get(url);
		System.out.println(response.statusCode());
		System.out.println(response.getStatusLine().toString());
	}

}
