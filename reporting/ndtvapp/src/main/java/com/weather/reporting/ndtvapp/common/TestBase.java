package com.weather.reporting.ndtvapp.common;

import static com.weather.reporting.ndtvapp.common.ConfigManager.*;

import org.testng.annotations.*;
// TODO: Auto-generated Javadoc

/**
 * The Class TestBase.
 */
public class TestBase {

	/**
	 * Sets the up.
	 */
	@BeforeSuite
	public void setUp() {

		ConfigManager.loadConfig("inputData.properties");
		DriverManager.initializeDriver();
		DriverManager.getDriver().get(getValue("appURL"));
	}

	/**
	 * Tear down.
	 */
	@AfterSuite
	public void tearDown() {

		DriverManager.getDriver().quit();
	}
}
