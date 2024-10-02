package com.xgen.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@Testcase_01.1", 
		features = "src/test/resources/features",
		glue = "com/xgen/automation/definations",
		plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class CucumberRunnerTests_Extent extends AbstractTestNGCucumberTests {

}