package com.weather.reporting.ndtvapp.test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.*;
import org.testng.annotations.*;

import com.weather.reporting.ndtvapp.common.*;
import com.weather.reporting.ndtvapp.pages.*;
import static com.weather.reporting.ndtvapp.common.ConfigManager.*;

public class NDTVValidationTest extends TestBase {

	private WebDriver driver;
	
	@Test
	public void test() {
		NDTVHomePage homePage = PageFactory.initElements(DriverManager.getDriver(), NDTVHomePage.class);
		Assert.assertTrue(homePage.isPageLoad(), "HomePage is not loaded");
		WeatherPage weatherPage = homePage.navigateToWeatherPage();
		String city = getValue("city");
		weatherPage.selectCity(city);
		weatherPage.extractWeatherDetails(city);
	}
	
	
}
