package com.weather.reporting.ndtvapp.enums;

import org.openqa.selenium.*;

// TODO: Auto-generated Javadoc
/**
 * The Enum WeatherPageEnum.
 */
public enum WeatherPageEnum {

	/** The page load. */
	PAGE_LOAD(By.xpath("//div[text()='Current weather conditions in your city.' and @class='infoHolder']"), "Page Load Element"),

	/** The search box. */
	SEARCH_BOX(By.id("searchBox"), "SearchBox"),

	/** The city. */
	CITY(("//div[@class='cityText' and text()='%s']"), "City Element"),

	/** The is city selected. */
	IS_CITY_SELECTED_DISPLAYED(("//div[@class='leaflet-popup-content']//span[contains(text(),'%s')]"), "Is City Selected"),

	/** The weather details. */
	WEATHER_DETAILS(By.xpath("//div[@class='leaflet-popup-content']//b"), "Weather Details"),

	/** The searched city. */
	SEARCHED_CITY(("//div[@class='message' and not(@style='display: none;')]//label[@for='%s']"), "Searched City"),

	/** The searched city checkbox. */
	SEARCHED_CITY_CHECKBOX(("//div[@class='message' and not(@style='display: none;')]//label[@for='%s']//input"), "Searched City Checkbox");

	/** The by locator. */
	private By byLocator;

	/** The description. */
	private String xpath, description;

	/**
	 * Instantiates a new weather page enum.
	 *
	 * @param byLocator the by locator
	 * @param description the description
	 */
	private WeatherPageEnum(By byLocator, String description) {

		this.byLocator = byLocator;
		this.description = description;
	}

	/**
	 * Instantiates a new weather page enum.
	 *
	 * @param xpath the xpath
	 * @param description the description
	 */
	private WeatherPageEnum(String xpath, String description) {

		this.xpath = xpath;
		this.description = description;
	}

	/**
	 * Gets the xpath.
	 *
	 * @return the xpath
	 */
	public String getXpath() {

		return xpath;
	}

	/**
	 * Gets the by locator.
	 *
	 * @return the by locator
	 */
	public By getByLocator() {

		return byLocator;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {

		return description;
	}
}
