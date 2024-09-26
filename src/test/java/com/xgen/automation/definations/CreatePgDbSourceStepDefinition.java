package com.xgen.automation.definations;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import com.xgen.automation.actions.CreatePostgresDBSource;
import com.xgen.automation.base.CommonAction;

public class CreatePgDbSourceStepDefinition extends CommonAction {
	CreatePostgresDBSource createdbSource;
	
	public CreatePgDbSourceStepDefinition(){
		createdbSource = new CreatePostgresDBSource(driver);
	}
	
	@When("the user Click on Connect Icon")
	public void the_user_click_on_connect_icon() {
		createdbSource.the_user_click_on_connect_icon();
	}

	@Then("verify Sources page or tab is present")
	public void verify_sources_page_or_tab_is_present() {
		createdbSource.verify_sources_page_or_tab_is_present();
		//createdbSource.deletetheconnectionifpresent();
	}

	@When("user click on Add button")
	public void user_click_on_add_button() {
		createdbSource.user_click_on_add_button();
	}

	@Then("verify several DB Sources are present")
	public void verify_several_db_sources_are_present() {
		createdbSource.verify_several_db_sources_are_present();
	}

	@When("user click on PostgreSQL")
	public void user_click_on_postgre_sql() {
		createdbSource.user_click_on_postgre_sql();
	}

	@Then("verify a pop up appears with various input fields")
	public void verify_a_pop_up_appears_with_various_input_fields() {
		createdbSource.verify_a_pop_up_appears_with_various_input_fields();
	}
	
	@Given("the user enter the source name {string} and source description {string}")
	public void the_user_enter_the_source_name_and_source_description(String source, String description) {
		createdbSource.the_user_enter_the_source_name_and_source_description(source,description);
	}

	

	
	@Then("the user enter Host, port, Db name, schema, username, password")
	public void the_user_enter_host_port_db_name_schema_username_password() {
		createdbSource.the_user_enter_host_port_db_name_schema_username_password();
	}
	
	@When("the user click on Validate button")
	public void the_user_click_on_validate_button() {
		createdbSource.the_user_click_on_Validate_button();
	}

	@Then("verify a success pop appears")
	public void verify_a_success_pop_appears() {
		createdbSource.verify_a_success_pop_appears();
	}

	@When("the user click on Create button")
	public void the_user_click_on_create_button() {
		createdbSource.the_user_click_on_Create_button();
	}

	@Then("verify a success message")
	public void verify_a_success_message() {
		createdbSource.verify_a_success_message();
	}

	
	@When("the user Click on delete button of {string} from the displayed list")
	public void the_user_click_on_delete_button_of(String sourceName) {
		createdbSource.deletetheconnectionifpresent(sourceName);
		
		
	}

	@Then("verify that it will ask for confirmation pop up")
	public void verify_that_it_will_ask_for_confirmation_pop_up() {
	    
	}

	@When("the user click on delete button of the pop up")
	public void the_user_click_on_delete_button_of_the_pop_up() {
	   
	}

	@Then("verify the db {string} is deleted from the list of Sources tab")
	public void verify_the_db_is_deleted_from_the_list_of_sources_tab(String string) {
	    
	}
	
	// @Before
		public void setUpp() {

			startChromeDriver();
		}

		@After
		public void tearDownn() {

			quit();
		}
}
