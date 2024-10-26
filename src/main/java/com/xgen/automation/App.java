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
    	log.info("Logged into Xgen Data Solution");
        System.out.println("Hello World!");
        for(int i=1; i<1000;i++) {
        	log.info("Logged for logs ---to create the back rotation");
        	
        }
    }
}
