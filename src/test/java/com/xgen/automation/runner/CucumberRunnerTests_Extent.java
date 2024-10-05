package com.xgen.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//tags = "@CreateConnectionPgSalesData or @DeleteConnectionPgSalesData", 
		//tags = "@CreateConnectionCategoryForecastData or @DeleteConnectionCategoryForecastData", 
		
		//tags = "@CreateConnectionCompanyData", 
		//tags = "@DeleteConnectionCategoryForecastData",
		tags ="@Testcase_3.3",
		features = {"src/test/resources/features"},
		glue = {"com/xgen/automation/definations"
				//"com/xgen/automation/definations/CreatingTheConnections"
				
		},
		plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class CucumberRunnerTests_Extent extends AbstractTestNGCucumberTests {

}