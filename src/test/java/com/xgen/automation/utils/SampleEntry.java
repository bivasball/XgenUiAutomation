package com.xgen.automation.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleEntry {
	private static final Logger logger = LoggerFactory.getLogger(SampleEntry.class);

	public static void main(String[] args) {

		logger.info("Application started");
		logger.debug("Debugging information");
		logger.error("An error occurred", new RuntimeException("Test error"));
	}

}
