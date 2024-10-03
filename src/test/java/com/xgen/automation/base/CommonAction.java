package com.xgen.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.xgen.automation.locators.Header;

//import io.cucumber.java.After;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
//import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class CommonAction implements Header {

	public void sleep(int slpSec) {
		try {

			Thread.sleep(slpSec);

		} catch (Exception e) {

		}
	}

	public void enterText(By Object, String text) {
		try {
			explicitWait(Object, 5, "VISIBILITY");
			WebElement el = driver.findElement(Object);
			el.clear();
			el.sendKeys(text);

		} catch (Exception e) {
			// logger.error("Exception in 'enterText'");
		}
	}

	public void clearText(By Object) {
		try {
			WebElement el = driver.findElement(Object);
			el.clear();

		} catch (Exception e) {
			// logger.error("Exception in 'clearText'");
		}
	}

	public void explicitWait(By obj, int maxiTimeout, String strConditionMode) {

		String mode = strConditionMode.toUpperCase();
		try {
			switch (mode) {
			case "VISIBILITY":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.visibilityOfElementLocated(obj));
				break;

			case "INVISIBILITY":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.invisibilityOfElementLocated(obj));
				break;

			case "PRESENCE":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.presenceOfElementLocated(obj));
				break;

			case "FRAME":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(obj));
				break;

			case "CLICKABLE":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.elementToBeClickable(obj));
				break;

			default:
				// logger.error("Incorrect Condition mode");

			}

		} catch (Exception e) {
			// logger.error("Exception in 'explicit wait'");
		}
	}

	public Boolean explicitWaitBool(By obj, int maxiTimeout, String strConditionMode) throws Exception {

		String mode = strConditionMode.toUpperCase();
		try {
			switch (mode) {
			case "VISIBILITY":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.visibilityOfElementLocated(obj));
				return true;

			case "INVISIBILITY":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.invisibilityOfElementLocated(obj));
				return true;

			case "PRESENCE":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.presenceOfElementLocated(obj));
				return true;

			case "FRAME":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(obj));
				return true;

			case "CLICKABLE":
				(new WebDriverWait(driver, Duration.ofSeconds(maxiTimeout)))
						.until(ExpectedConditions.elementToBeClickable(obj));
				return true;

			default:
				// logger.error("Incorrect Condition mode");

			}

		} catch (Exception e) {
			// logger.error("Exception in 'explicit wait'");
		}
		return false;
	}

	public void click(By Object) {
		try {
			explicitWait(Object, 5, "CLICKABLE");
			WebElement el = driver.findElement(Object);
			el.click();
			System.out.println("The element is clicked");
		} catch (Exception e) {
			// logger.error("Exception in 'enterText'");
		}
	}
	
	
	public void clickElement(WebElement element) {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	}
	
	public void scrollIntoView(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}
	public void scrollIntoView(By Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(Element));
		
	}
	public void clickByAction(WebElement Object) {
		Actions action = new Actions(driver);
		action.moveToElement(Object).click();	
		
	    
	}
	
	public void doubleClickByAction(WebElement Object) {
		Actions action = new Actions(driver);
		action.doubleClick(Object).perform();;	
	    
	}
	public void hoverOverWebelementByAction(WebElement Object) {
		Actions action = new Actions(driver);
		action.moveToElement(Object).build().perform();	
	    
	}
	
	public void selectItem(WebElement ele, String option) {
		Select select = new Select(ele);
		select.selectByVisibleText(option);
		String itemSelected = select.getFirstSelectedOption().getText().trim();
		if (itemSelected.isEmpty()) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript(
					"var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }",
					ele, option);
			System.out.println("Selected " + option + " Option from dropdown");
		} else {
			System.out.println("Selected " + option + " Option from dropdown");
		}
	}

	public String getElementText(By Object) {

		try {
			return driver.findElement(Object).getText();

		} catch (Exception e) {
			// logger.error("get element text " + e.getMessage());
			return null;
		}
	}

	public void waitTillPageLoadComplete() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").toString().equals("complete");

	}

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

	public ChromeDriver startChromeDriver() {
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
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
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

	// @Before
	public void setUp() {

		startChromeDriver();
	}

	// @After
	public void tearDown() {

		quit();
	}

	public void deleteSourceFromConnectSourcesTabList(String sourceName) {
		
		
		driver.findElement(By.xpath("//p[text()='Refresh']")).click();
		sleep(3000);
	
		By sourceToDelete = By.xpath("//p[text()='"+sourceName+"']/parent::div/parent::div/parent::div/div[7]//span[@aria-label='Delete Source']/button//*[name()='svg']");
		//System.out.println(sourceToDelete.toString());
		
		
		//click(sourceToDelete);
		
		WebElement sourceDeleteicon= driver.findElement(By.xpath("//p[text()='"+sourceName+"']/parent::div/parent::div/parent::div/div[7]//span[@aria-label='Delete Source']/button"));
		//clickElement(sourceDeleteicon);
		hoverOverWebelementByAction(sourceDeleteicon);
		sleep(3000);
		//clickByAction(sourceDeleteicon);
		click(sourceToDelete);
		System.out.println("The delete icon ****************** is clicked.");
		sleep(6000);
	}
	
	
	

	public boolean verifySourceNameDisplayedInConnectSourcesTabList(String sourceName) {
		boolean flag = false;
		int numberOfRowsDisplayed = driver
				.findElements(By.xpath("//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div/div/div/p"))
				.size();
		System.out.println("ROWS :- "+numberOfRowsDisplayed);
		for (int row = 1; row <= numberOfRowsDisplayed; row++) {
			String sourceNamefromUI = driver.findElement(By.xpath(
					"//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div[" + row + "]/div/div/p"))					
					.getText();
			System.out.println("source name from ui :- "+sourceNamefromUI);
			if (sourceNamefromUI.equalsIgnoreCase(sourceName)) {
				System.out.println("This is true");
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public void loadingWebPage()  {
		long startTime = System.currentTimeMillis();
		explicitWait(By.xpath("//span[contains(@style,'react-spinners-RiseLoader-odd')]"), 30, "INVISIBILITY");
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken to load a webpage: " + ((double) Math.round(estimatedTime) / 1000d) + " Second");
	}
	
	public void waitTillalertToastifyDisappears()  {
		long startTime = System.currentTimeMillis();
		explicitWait(By.xpath("//div[@role='alert' and @class='Toastify__toast-body']"), 30, "INVISIBILITY");
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken to vanish Toastify Icon: " + ((double) Math.round(estimatedTime) / 1000d) + " Second");
	}
	
}