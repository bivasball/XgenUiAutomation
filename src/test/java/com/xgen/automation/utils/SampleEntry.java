package com.xgen.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.log4j.BasicConfigurator;

public class SampleEntry {

	//mainLogger is a logger object that we got from LogManager. All loggers are 
        //using this method only. We can consider LogManager as a factory to create
        //Logger objects
	static Logger mainLogger = LogManager.getLogger(SampleEntry.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		mainLogger.info("This is just a logger");	

	}
}

