package com.weather.reporting.ndtvapp.pages;

import java.util.*;
import java.util.stream.*;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.testng.*;

import com.weather.reporting.ndtvapp.common.*;
import com.weather.reporting.ndtvapp.enums.*;
import com.weather.reporting.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class WeatherPage.
 */
public class WeatherPage extends PageBase {

	/**
	 * Instantiates a new weather page.
	 *
	 * @param driver the driver
	 */
	public WeatherPage(WebDriver driver) {

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
		boolean isDisplayed = PageUtil.isDisplayed(driver, WeatherPageEnum.PAGE_LOAD.getByLocator(), Timeout.THREE_SEC);
		LogUtil.log("Element is displayed");
		return isDisplayed;
	}

	/**
	 * Convert list to map.
	 *
	 * @param weatherDetailsList the weather details list
	 * @param seperator the seperator
	 * @return the hash map
	 */
	public HashMap<String, String> convertListToMap(List<String> weatherDetailsList, String seperator) {

		HashMap<String, String> weatherDetails = new HashMap<>();
		String key, value = "";
		for (String item : weatherDetailsList) {

			key = item.split(seperator)[0];
			value = item.split(seperator)[1];
			weatherDetails.put(key, value);

		}

		return weatherDetails;
	}

	/**
	 * Extract weather details.
	 *
	 * @param city the city
	 */
	public void extractWeatherDetails(String city) {

		PageUtil.click(driver, PageUtil.getElement(driver, By.xpath(String.format(WeatherPageEnum.CITY.getXpath(), city)), Timeout.THREE_SEC));
		Assert.assertTrue(PageUtil.isDisplayed(driver, By.xpath(String.format(WeatherPageEnum.IS_CITY_SELECTED_DISPLAYED.getXpath(), city)), Timeout.FIVE_SEC),
		        "Selected City is not displayed");
		List<WebElement> elements = PageUtil.getElements(driver, WeatherPageEnum.WEATHER_DETAILS.getByLocator(), Timeout.THREE_SEC);
		List weatherDetailsList = elements.stream().map(element -> element.getText().trim()).collect(Collectors.toList());
		HashMap<String, String> weatherDetails = convertListToMap(weatherDetailsList, ":");
		System.out.println(weatherDetails);
		for (Map.Entry<String, String> map : weatherDetails.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

	
	/**
	 * Select city.
	 *
	 * @param city the city
	 */
	public void selectCity(String city) {

		WebElement webElement = PageUtil.getElement(driver, WeatherPageEnum.SEARCH_BOX.getByLocator(), Timeout.THREE_SEC);
		webElement.sendKeys(city);
		webElement.sendKeys(Keys.ENTER);
		Assert.assertTrue(PageUtil.isDisplayed(driver, By.xpath(String.format(WeatherPageEnum.SEARCHED_CITY.getXpath(), city)), Timeout.FIVE_SEC),
		        "Selected City is not displayed");
		WebElement searchedCityCheckBox = PageUtil.getElement(driver, By.xpath(String.format(WeatherPageEnum.SEARCHED_CITY_CHECKBOX.getXpath(), city)), Timeout.THREE_SEC);
		if (!searchedCityCheckBox.isSelected())
			PageUtil.click(driver, PageUtil.getElement(driver, By.xpath(String.format(WeatherPageEnum.SEARCHED_CITY.getXpath(), city)), Timeout.FIVE_SEC));
	}
}
