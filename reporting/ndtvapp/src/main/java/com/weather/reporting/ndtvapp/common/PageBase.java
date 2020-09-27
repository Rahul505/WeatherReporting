package com.weather.reporting.ndtvapp.common;

import org.openqa.selenium.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PageBase.
 */
public abstract class PageBase {

	/** The driver. */
	protected WebDriver driver;

	/**
	 * Instantiates a new page base.
	 *
	 * @param driver the driver
	 */
	public PageBase(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * Checks if is page load.
	 *
	 * @return true, if is page load
	 */
	public abstract boolean isPageLoad();
}
