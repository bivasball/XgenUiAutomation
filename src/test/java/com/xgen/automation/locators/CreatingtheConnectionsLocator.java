package com.xgen.automation.locators;

import org.openqa.selenium.By;

public interface CreatingtheConnectionsLocator {
	By xx = By.xpath("");
	By syncIcon= By.xpath("//span[text()='Sync']");
	By addButtonOnSourcesTab = By.xpath("//p[normalize-space()='Add']");
	By inputConnectionName= By.xpath("//p[normalize-space()='XDF_']/parent::div/following-sibling::input");
	By inputDescription= By.xpath("//label[text()='Description']/following-sibling::div/input");
	
	By sourceDropDown= By.xpath("//label[text()='Select Source']/following-sibling::div");
	By destinationDropDown= By.xpath("//label[text()='Select Destination']/following-sibling::div");
}
