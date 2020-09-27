package com.weather.reporting.ndtvapp.pages;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.*;

import com.weather.reporting.ndtvapp.common.*;
import com.weather.reporting.ndtvapp.enums.*;
import com.weather.reporting.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class NDTVHomePage.
 */
public class NDTVHomePage extends PageBase {

	/**
	 * Instantiates a new NDTV home page.
	 *
	 * @param driver the driver
	 */
	public NDTVHomePage(WebDriver driver) {

		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.weather.reporting.ndtvapp.common.PageBase#isPageLoad()
	 */
	@Override
	public boolean isPageLoad() {

		Logger logger = LogManager.getLogger(NDTVHomePage.class);
		boolean isDisplayed = PageUtil.isDisplayed(driver, NDTVHomePageEnum.PAGE_LOAD.getByLocator(), Timeout.THREE_SEC);
		LogUtil.log("Element is displayed");
		return isDisplayed;
	}

	/**
	 * Navigate to weather page.
	 *
	 * @return the weather page
	 */
	public WeatherPage navigateToWeatherPage() {
       
		PageUtil.click(driver, PageUtil.getElement(driver, NDTVHomePageEnum.MORE_MENU_BUTTON.getByLocator(), Timeout.THREE_SEC));
		PageUtil.click(driver, PageUtil.getElement(driver, NDTVHomePageEnum.WEATHER_MENU.getByLocator(), Timeout.THREE_SEC));
		WeatherPage weatherPage = PageFactory.initElements(driver, WeatherPage.class);
		Assert.assertTrue(weatherPage.isPageLoad(), "Weather Page is not laoded");
		return weatherPage;
	}
}
