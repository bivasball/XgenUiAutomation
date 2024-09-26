package com.xgen.automation.base;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest  {
	protected static WebDriver driver;
	protected WebDriverWait wait;
	protected File driverPath;
	protected File browserPath;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	protected ChromeDriver startChromeDriver() {
		ChromeOptions options = new ChromeOptions();
		options.setImplicitWaitTimeout(Duration.ofSeconds(1));
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
		options.setCapability(ChromeOptions.LOGGING_PREFS, logPrefs);
		options.addArguments("--start-maximized");
		// to disable the automation text
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		return startChromeDriver(options);
	}

	protected ChromeDriver startChromeDriver(ChromeOptions options) {
		driver = new ChromeDriver(options);
		return (ChromeDriver) driver;
	}

	protected File getTempDirectory(String prefix) {
		File tempDirectory = null;
		try {
			tempDirectory = Files.createTempDirectory(prefix).toFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		tempDirectory.deleteOnExit();

		return tempDirectory;
	}

	protected File getTempFile(String prefix, String suffix) {
		File logLocation = null;
		try {
			logLocation = File.createTempFile(prefix, suffix);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		logLocation.deleteOnExit();

		return logLocation;
	}

	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	//@Before
	public void setUp() {

		startChromeDriver();
	}

	//@After
	public void tearDown() {

		quit();
	}

	public static void main(String[] args) {
		new BaseTest().startChromeDriver();
		
	}
	
}