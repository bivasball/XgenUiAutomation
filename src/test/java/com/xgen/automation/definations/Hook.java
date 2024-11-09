package com.xgen.automation.definations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.xgen.automation.base.CommonAction;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends CommonAction {
	public static Logger log;

	public Hook() {
		log = LogManager.getLogger(Hook.class);

	}

	@Before
	public void setUpp() {
		//System.out.println("I am inside the BEFORE HOOK 1111");
		//startChromeDriver();
	}

	@After
	public void tearDownn() {
		//System.out.println("I am inside the AFTER HOOK 2222");
		//quit();
	}

	@AfterStep
	public void actionPostEachStep(Scenario scenario) {
		//System.out.println("I am inside Each Step ............");
		
		if(scenario.isFailed()) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", screenshot.toString());
	}
	}
	
}