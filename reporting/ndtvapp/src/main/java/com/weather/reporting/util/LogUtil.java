package com.weather.reporting.util;

import org.apache.log4j.*;

import com.weather.reporting.ndtvapp.pages.*;

public class LogUtil {

	public static void log(String message)
	{
		Logger logger = LogManager.getLogger("Logs");
		logger.info(message);
	}
}
