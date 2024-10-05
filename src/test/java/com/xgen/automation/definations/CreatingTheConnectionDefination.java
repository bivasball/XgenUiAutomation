package com.xgen.automation.definations;

import io.cucumber.java.en.*;

import com.xgen.automation.actions.CreatingConnectionAction;
import com.xgen.automation.base.CommonAction;

public class CreatingTheConnectionDefination extends CommonAction {
	CreatingConnectionAction creatingConnectionAction;
	
	public CreatingTheConnectionDefination(){
		creatingConnectionAction = new CreatingConnectionAction();
	}
	
	

@Given("user navigate to Data Sync by clicking on Sync Icon")
public void user_navigate_to_data_sync_by_clicking_on_sync_icon() {
	creatingConnectionAction.user_navigate_to_data_sync_by_clicking_on_sync_icon();
}

@Then("verify that the current url is {string}")
public void verify_that_the_current_url_is(String string) {
	creatingConnectionAction.verify_that_the_current_url_is(string);
}

@When("user click on Add icon button")
public void user_click_on_add_icon_button() {
	creatingConnectionAction.user_click_on_add_icon_button();
}

@Then("verify that ther current url is {string}")
public void verify_that_ther_current_url_is(String string) {
	creatingConnectionAction.verify_that_ther_current_url_is(string);
}

@Then("the user enter input values {string} to Connection Name input box")
public void the_user_enter_input_values_to_connection_name_input_box(String string) {
	creatingConnectionAction.the_user_enter_input_values_to_connection_name_input_box(string);
}

@Then("the user enter input values {string} to Description input box")
public void the_user_enter_input_values_to_description_input_box(String string) {
	creatingConnectionAction.the_user_enter_input_values_to_description_input_box(string);
}

@Then("the user Select {string} from the Select Source Dropdown")
public void the_user_select_from_the_select_source_dropdown(String string) {
	creatingConnectionAction.the_user_select_from_the_select_source_dropdown(string);
}

@Then("the user Select {string} from the Select Destination Dropdown")
public void the_user_select_from_the_select_destination_dropdown(String string) {
	creatingConnectionAction.the_user_select_from_the_select_destination_dropdown(string);
}



@Then("the user Select MuiSwitch checkbox for Entity Value {string} and Sync Mode {string} from the Dropdown and Primary Key {string} from the Dropdown")
public void the_user_select_mui_switch_checkbox_for_entity_value_and_sync_mode_from_the_dropdown_and_primary_key_from_the_dropdown(String string, String string2, String string3) {
	creatingConnectionAction.the_user_select_mui_switch_checkbox_for_entity_value_and_sync_mode_from_the_dropdown_and_primary_key_from_the_dropdown(string,string,string);
}

@When("the user Click on Create icon button")
public void the_user_click_on_create_icon_button() {
	creatingConnectionAction.the_user_click_on_create_icon_button();
}

@Then("verify the Connection for {string} is created successfully")
public void verify_the_connection_for_is_created_successfully(String string) {
    
}

@Given("Click on Sync Data flow button from the Action section for {string}")
public void click_on_sync_data_flow_button_from_the_action_section_for(String string) {
	creatingConnectionAction.click_on_sync_data_flow_button_from_the_action_section_for( string);
}

@Then("verify from the Job Logs button that the Sync is succeeded")
public void verify_from_the_job_logs_button_that_the_sync_is_succeeded() {
	creatingConnectionAction.verify_from_the_job_logs_button_that_the_sync_is_succeeded();
}


//-------------------- For Categories Forecast -----------------------//

@Given("the user Select MuiSwitch checkbox for Entity Value {string}")
public void the_user_select_mui_switch_checkbox_for_entity_value(String string) {
	creatingConnectionAction.the_user_select_mui_switch_checkbox_for_entity_value(string);
}

@Given("Sync Mode {string} from the Dropdown and Select Primary Key from the Dropdown")
public void sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdown(String string) {
	creatingConnectionAction.sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdown(string);
}

//-------------------- For Company Data -----------------------//
@Given("the user Select MuiSwitch checkbox for Entity Value {string} for company data")
public void the_user_select_mui_switch_checkbox_for_entity_value_for_company_data(String string) {
	creatingConnectionAction.the_user_select_mui_switch_checkbox_for_entity_value_for_company_data(string);
}

@Given("Sync Mode {string} from the Dropdown and Select Primary Key from the Dropdown for company data")
public void sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdown_for_company_data(String string) {
	creatingConnectionAction.sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdownfor_company_data(string);
}




	
}
