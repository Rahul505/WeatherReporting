package com.weather.reporting.ndtvapp.enums;

import org.openqa.selenium.*;

// TODO: Auto-generated Javadoc
/**
 * The Enum NDTVHomePageEnum.
 */
public enum NDTVHomePageEnum {

	/** The page load. */
	PAGE_LOAD(By.xpath("//div[@class='ndtvlogo']//a[@href='https://www.ndtv.com']"), "PageLoad Element"),

	MORE_MENU_BUTTON(By.xpath("//a[@class='topnavmore']"), "More Menu Button"),

	WEATHER_MENU(By.xpath("//a[text()='WEATHER']"), "Weather Menu");

	/** The by locator. */
	private By byLocator;

	/** The description. */
	private String xpath, description;

	/**
	 * Instantiates a new NDTV home page enum.
	 *
	 * @param byLocator the by locator
	 * @param description the description
	 */
	private NDTVHomePageEnum(By byLocator, String description) {

		this.byLocator = byLocator;
		this.description = description;
	}

	/**
	 * Instantiates a new NDTV home page enum.
	 *
	 * @param xpath the xpath
	 * @param description the description
	 */
	private NDTVHomePageEnum(String xpath, String description) {

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
