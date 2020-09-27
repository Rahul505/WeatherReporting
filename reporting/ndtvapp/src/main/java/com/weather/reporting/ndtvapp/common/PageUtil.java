package com.weather.reporting.ndtvapp.common;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import com.weather.reporting.ndtvapp.enums.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PageUtil.
 */
public class PageUtil {

	/**
	 * Gets the element.
	 *
	 * @param driver the driver
	 * @param byLocator the by locator
	 * @param timeout the timeout
	 * @return the element
	 */
	public static WebElement getElement(WebDriver driver, By byLocator, Timeout timeout) {

		WebDriverWait wait = new WebDriverWait(driver, timeout.getValue());
		return wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));

	}

	/**
	 * Checks if is displayed.
	 *
	 * @param driver the driver
	 * @param byLocator the by locator
	 * @param timeout the timeout
	 * @return true, if is displayed
	 */
	public static boolean isDisplayed(WebDriver driver, By byLocator, Timeout timeout) {

		WebDriverWait wait = new WebDriverWait(driver, timeout.getValue());
		return wait.until(ExpectedConditions.presenceOfElementLocated(byLocator)).isDisplayed();
	}

	/**
	 * Click.
	 *
	 * @param driver the driver
	 * @param element the element
	 */
	public static void click(WebDriver driver, WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		executor.executeScript("arguments[0].click();", element);
	}

	/**
	 * Gets the elements.
	 *
	 * @param driver the driver
	 * @param byLocator the by locator
	 * @param timeout the timeout
	 * @return the elements
	 */
	public static List<WebElement> getElements(WebDriver driver, By byLocator, Timeout timeout) {

		WebDriverWait wait = new WebDriverWait(driver, timeout.getValue());
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byLocator));

	}
}
