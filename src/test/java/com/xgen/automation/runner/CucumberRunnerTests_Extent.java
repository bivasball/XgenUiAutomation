package com.xgen.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@Story004", 
		features = {"src/test/resources/features",
				"src/test/resources/features/Creating_the_Connections"
		},
		glue = {"com/xgen/automation/definations",
				"com/xgen/automation/definations/CreatingTheConnections"
				
		},
		plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class CucumberRunnerTests_Extent extends AbstractTestNGCucumberTests {

}