package com.weather.reporting.ndtvapp.common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.*;

// TODO: Auto-generated Javadoc
/**
 * The Class DriverManager.
 */
public class DriverManager {

	/** The driver. */
	private static WebDriver driver;

	/**
	 * Initialize driver.
	 */
	public static void initializeDriver() {

		
		String browser = System.getProperty("browser");
		if (browser.equals("chrome")) {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
		}
	}

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public static WebDriver getDriver() {

		return driver;
	}
}
