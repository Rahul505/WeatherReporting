package com.weather.reporting.ndtvapp.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum Timeout.
 */
public enum Timeout {

	/** The three sec. */
	THREE_SEC(3),

	/** The five sec. */
	FIVE_SEC(5),

	/** The ten sec. */
	TEN_SEC(10),

	/** The thirty sec. */
	THIRTY_SEC(30),

	/** The medium timeout. */
	MEDIUM_TIMEOUT(60),

	/** The long timeout. */
	LONG_TIMEOUT(90);

	/** The time out. */
	int timeOut;

	/**
	 * Instantiates a new timeout.
	 *
	 * @param timeOut the time out
	 */
	private Timeout(int timeOut) {

		this.timeOut = timeOut;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {

		return this.timeOut;
	}

}
