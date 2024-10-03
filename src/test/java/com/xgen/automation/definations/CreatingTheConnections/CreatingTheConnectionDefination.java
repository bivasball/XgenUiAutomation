package com.xgen.automation.definations.CreatingTheConnections;

import io.cucumber.java.en.*;
import com.xgen.automation.actions.Login;
import com.xgen.automation.actions.CreatingTheConnections.CreatingConnectionAction;
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

@Then("verify a web table with the following Headers are displayed")
public void verify_a_web_table_with_the_following_headers_are_displayed(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
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

	
	
	
}
