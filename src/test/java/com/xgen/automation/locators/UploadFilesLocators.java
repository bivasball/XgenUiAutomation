package com.xgen.automation.locators;

import org.openqa.selenium.By;

public interface UploadFilesLocators extends Header{
	By xx = By.xpath("");
	By uploadFileIcon = By.xpath("//p[normalize-space()='Upload File']");	
	By radioButtonNew = By.xpath("//span[text()='New']/parent::label/span/input");	
	By radioButtonExisting = By.xpath("//span[text()='Existing']/parent::label/span/input");
	
	
	
	By inputSource = By.xpath("//input[@name='srcname']");
	By inputSourceDesc = By.xpath("//input[@name='srcdesc']");
	
	By fileFormatDropdown = By.xpath("//div[@role='combobox']");
	By selectExcel = By.xpath("//ul/li[@data-value='excel']");
	
	By importFileButton = By.xpath("//span[@role='button']");
	By uploadimportfile = By.xpath("//input[@id='upload-import-file']");
	By uploadimportfileSaveButton = By.xpath("//p[text()='Save']/parent::button");
	
	By popupAlertMessageForDelete = By.xpath("//div[@role='alert' and @class='Toastify__toast-body']//p");
	
	By popupAlertMessageForUpload = By.xpath("//div[@class='Toastify__toast-body']/div[2]");
	
}
