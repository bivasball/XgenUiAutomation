package com.xgen.automation.locators;

import org.openqa.selenium.By;

public interface CreatePostgresDBSourceLocators extends Header{
	By xx = By.xpath("");
	By connectIcon = By.xpath("//span[text()='Connect']");	
	By sourcePageOrTab = By.xpath("//button[text()='Sources']");	
	By pgsalesdbinSourcetab = By.xpath("//p[text()='PG_SALES_DB']");
	
	
	By pgsalesdbinSourceButtonDelete = By.xpath("//span[@aria-label='Delete Source']//button[@type='button']//*[name()='svg']");
	By popupDeleteButton = By.xpath("//p[text()='Delete']");	
	
	By popupCancelButton = By.xpath("//p[text()='Cancel']");
	By addButtonOnSourcesTab = By.xpath("//p[normalize-space()='Add']");
	
	By PostgresIcon = By.xpath("//h6[text()='Postgres']");	
	By inputsrcname = By.xpath("//input[@id='srcname']");	
	By inputsrcdesc = By.xpath("//input[@id='srcdesc']");
	
	By inputhost = By.xpath("//input[@name='host']");	
	By inputport = By.xpath("//input[@name='port']");	
	By inputdatabase = By.xpath("//input[@name='database']");	
	
	By inputschemas = By.xpath("//input[@id='Array_L_1_schemas']");	
	By inputusername = By.xpath("//input[@id='Input_L_1_username']");	
	By inputpassword = By.xpath("//input[@id='Input_L_1_password']");	
	
	By radioButtonScanChanges = By.xpath("//input[@value='Standard']");
	By popupValidateButton = By.xpath("//button[contains(text(),'Validate')]");
	
	By successMessage = By.xpath("//p[text()='Success']");
	By createButton = By.xpath("//p[text()='Create']");
	
	
	By inputschemasClearthebox = By.xpath("//p[contains(text(),'Schemas')]/parent::div/following-sibling::div//button[@title='Clear']");	
	
	By inputschemasClearthePublic  = By.xpath("//p[contains(text(),'Schemas')]/parent::div/following-sibling::div//*[@data-testid='CancelIcon']");	
	
}
