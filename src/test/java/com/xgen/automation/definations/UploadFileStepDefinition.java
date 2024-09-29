package com.xgen.automation.definations;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import com.xgen.automation.actions.CreatePostgresDBSource;
import com.xgen.automation.actions.UploadFiles;
import com.xgen.automation.base.CommonAction;

public class UploadFileStepDefinition extends CommonAction {
	UploadFiles uploadFiles;

	public UploadFileStepDefinition() {
		uploadFiles = new UploadFiles();
	}

	// @Before
	public void setUpp() {

		startChromeDriver();
	}

	@After
	public void tearDownn() {

		quit();
	}
	
	@When("user Click on Upload Files {string} on Sources tab or page")
	public void user_click_on_upload_files_on_sources_tab_or_page(String FileName) {
		uploadFiles.user_click_on_upload_files_on_sources_tab_or_page(FileName);
	}

	
	
	@Then("verify a file upload Popup display")
	public void verify_a_file_upload_popup_display() {
		uploadFiles.verify_a_file_upload_popup_display();
	}

	//----------------------------------//
	

@When("user click on Upload Files button")
public void user_click_on_upload_files_button() {
	uploadFiles.user_click_on_upload_files_button();
}

@Then("verify a Pop up appears for the input values to enter")
public void verify_a_pop_up_appears_for_the_input_values_to_enter() {
	uploadFiles.verify_a_pop_up_appears_for_the_input_values_to_enter();
}

@Then("user enter source name {string} and enter Source Description {string}")
public void user_enter_source_name_and_enter_source_description(String sourceName, String sourceDescription) {
	uploadFiles.user_enter_source_name_and_enter_source_description(sourceName,sourceDescription);
}

@Then("choose the file format to upload as {string}")
public void choose_the_file_format_to_upload_as(String FileFormat) {
	uploadFiles.choose_the_file_format_to_upload_as(FileFormat);
}

@Then("user Click on Upload Files {string} on the File upload pop up")
public void user_click_on_upload_files_on_the_file_upload_pop_up(String FileName) {
	uploadFiles.user_click_on_upload_files_on_the_file_upload_pop_up(FileName);
}

@Then("verify the given file {string} is uploaded successfully")
public void verify_the_given_file_is_uploaded_successfully(String FileName) {
	uploadFiles.verify_the_given_file_is_uploaded_successfully(FileName);
}

	
	
	
	
	
	
}
