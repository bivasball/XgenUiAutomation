package com.xgen.automation.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends CommonAction {
	

	//@Before
	public void setUpp() {

		startChromeDriver();
	}

	//@After
	public void tearDownn() {

		quit();
	}

	
	
}