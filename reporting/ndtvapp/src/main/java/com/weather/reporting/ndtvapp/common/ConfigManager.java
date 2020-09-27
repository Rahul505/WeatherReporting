package com.weather.reporting.ndtvapp.common;

import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ConfigManager.
 */
public class ConfigManager {

	/** The config. */
	private static Properties config = new Properties();

	/**
	 * Load config.
	 *
	 * @param fileName the file name
	 */
	public static void loadConfig(String fileName) {

		try {
			config.load(ConfigManager.class.getClassLoader().getResourceAsStream(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Gets the value.
	 *
	 * @param key the key
	 * @return the value
	 */
	public static String getValue(String key) {

		String value = "";
		if (key != null) {
			value = config.getProperty(key);

		} else
			System.out.println("No Value Found for the key :" + key + " in 'inputData.properties'");
		return value;
	}

	/**
	 * Gets the list of values.
	 *
	 * @param key the key
	 * @return the list of values
	 */
	public static List<String> getListOfValues(String key) {

		List<String> values = null;
		if (key != null) {
			values = Arrays.asList(config.getProperty(key).split(","));

		} else
			System.out.println("No Value Found for the key :" + key + " in 'inputData.properties'");
		return values;
	}
}
