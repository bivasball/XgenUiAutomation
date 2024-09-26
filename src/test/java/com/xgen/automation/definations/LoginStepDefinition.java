package com.xgen.automation.definations;

import io.cucumber.java.en.*;
import com.xgen.automation.actions.Login;
import com.xgen.automation.base.CommonAction;

public class LoginStepDefinition extends CommonAction {
	Login login;
	
	public LoginStepDefinition(){
		login = new Login();
	}
	
	@When("the user navigate to {string} url")
	public void the_user_navigate_to_url(String string) {
		login.the_user_navigate_to_url(string);
	}

	@Then("verify the user should be able to enter username and password")
	public void verify_the_user_should_be_able_to_enter_username_and_password() {
		login.verify_the_user_should_be_able_to_enter_username_and_password2();
	    
	}

	@When("the user click on Login button")
	public void the_user_click_on_login_button() {
		login.the_user_click_on_login_button();
	}

	@Then("verify the login should be successful and Select Subscription dropdown should be available")
	public void verify_the_login_should_be_successful_and_select_subscription_dropdown_should_be_available() {
	    login.verify_the_login_should_be_successful_and_select_subscription_dropdown_should_be_available();
	}

	@When("the user select a subscription {string} from the dropdown")
	public void the_user_select_a_subscription_from_the_dropdown(String subscriptio) {
		login.the_user_select_a_subscription_from_the_dropdown(subscriptio);
	}

	@Then("verify the user land to Welcome page {string}")
	public void verify_the_user_land_to_welcome_page(String greeting) {
	    login.verify_the_user_land_to_welcome_page(greeting);
	}
	
	//------------------//
	@When("the user click on Logout Button")
	public void the_user_click_on_logout_button() {
		 login.the_user_click_on_logout_button();
	}

	@Then("verify the user successfully logout")
	public void verify_the_user_successfully_logout() {
	   login.verify_the_user_successfully_logout();
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
	    login.login_page_is_displayed();
	}

	@Given("Close the Chrome Browser")
	public void close_the_chrome_browser() {
	    login.close_the_chrome_browser();
	}


	
}
