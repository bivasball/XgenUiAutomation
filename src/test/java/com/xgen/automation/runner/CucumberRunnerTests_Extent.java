package com.xgen.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@Both", 
		features = "src/test/resources/features",
		glue = "com/xgen/automation/definations",
		plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class CucumberRunnerTests_Extent extends AbstractTestNGCucumberTests {

}