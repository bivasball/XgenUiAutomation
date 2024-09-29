package com.xgen.automation.actions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.UploadFilesLocators;

public class UploadFiles extends CommonAction implements UploadFilesLocators {
	
	public void user_click_on_upload_files_on_sources_tab_or_page(String FileName) {
		
		click(uploadFileIcon);
		loadingWebPage();
		click(radioButtonNew);
		clearText(inputSource);
		enterText(inputSource,"CATEGORY_FORECAST");
		
		clearText(inputSourceDesc);
		enterText(inputSourceDesc,"Category Forecast Data");
		
		click(fileFormatDropdown);
		click(selectExcel);
		click(importFileButton);
		
		//File uploadFile = new File("src/test/resources/files/CategoryForecast.xlsx");
		File uploadFile = new File("src/test/resources/files/"+FileName+"");
		WebElement fileInput = driver.findElement(uploadimportfile);
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    //sleep(2000);
	    click(uploadimportfileSaveButton);
	    loadingWebPage();
	    loadingWebPage();
	    loadingWebPage();
	    //sleep(1000);
	    
		

	}

	public void verify_a_file_upload_popup_display() {
		sleep(2000);
		String alertMessage = getElementText(popupAlertMessageForUpload);
	    System.out.println("--------------#------------"+alertMessage);
	    waitTillalertToastifyDisappears();

	}
	public void user_click_on_upload_files_button() {
		click(uploadFileIcon);
		loadingWebPage();
	    
	}
	
	public void verify_a_pop_up_appears_for_the_input_values_to_enter() {
	    
	}
	
	public void user_enter_source_name_and_enter_source_description(String sourceName, String sourceDescription) {
		click(radioButtonNew);
		clearText(inputSource);
		enterText(inputSource,sourceName);
		
		clearText(inputSourceDesc);
		enterText(inputSourceDesc,sourceDescription);
	    
	}
	
	public void choose_the_file_format_to_upload_as(String fileFormat) {
		click(fileFormatDropdown);
		By fileformat = By.xpath("//ul/li[@data-value='"+fileFormat+"']");
		click(fileformat);
		click(importFileButton);
	}
	
	public void user_click_on_upload_files_on_the_file_upload_pop_up(String FileName) {
		File uploadFile = new File("src/test/resources/files/"+FileName+"");
		WebElement fileInput = driver.findElement(uploadimportfile);
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    //sleep(2000);
	    click(uploadimportfileSaveButton);
	    loadingWebPage();
	    loadingWebPage();
	    loadingWebPage();
	}
	
	
	
	public void verify_the_given_file_is_uploaded_successfully(String string) {
		sleep(2000);
		String alertMessage = getElementText(popupAlertMessageForUpload);
	    System.out.println("--------------#------------"+alertMessage);
	    waitTillalertToastifyDisappears();

	}

	
}
