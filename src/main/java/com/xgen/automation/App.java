package com.xgen.automation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
	public static Logger log;
	
    public static void main(String[] args) {
    	log= LogManager.getLogger(App.class);
    	log.info("Logged into Myntra");
        System.out.println("Hello World!");
    }
}
