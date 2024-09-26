package com.xgen.automation.locators;

import org.openqa.selenium.By;

public interface LoginLocator {
	By xx = By.xpath("");
	By username = By.id("outlined-adornment-email");
	By password = By.id("outlined-adornment-password");
	By submitButton = By.xpath("//button[@type='submit']");
	
	By arrowDropDownIcon = By.xpath("//div[@id='select_subs']");
	By selectSubscription = By.xpath("//ul[@role='listbox']/li");
	By userWelcome = By.xpath("//h4");
	By logoutButton = By.xpath("//span[@aria-label=\"Logout\"]/button[@type='button']");
	
	
	
	
}
