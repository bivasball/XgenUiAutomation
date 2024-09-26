package com.xgen.automation.actions;

import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.LoginLocator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends CommonAction implements LoginLocator {

	public void the_user_navigate_to_url(String url) {
		startChromeDriver();
		openPage(url);

	}

	public void verify_the_user_should_be_able_to_enter_username_and_password2() {

		enterText(username, "automate@xgen.com");
		enterText(password, "1234");

	}

	public void the_user_click_on_login_button() {
		
		click(submitButton);
		loadingWebPage();

	}

	public void verify_the_login_should_be_successful_and_select_subscription_dropdown_should_be_available() {
		
		click(arrowDropDownIcon);

	}

	public void the_user_select_a_subscription_from_the_dropdown(String string) {
			
		click(selectSubscription);
		loadingWebPage();
	}

	public void verify_the_user_land_to_welcome_page(String expectedGreetings) {
		
		loadingWebPage();
		
		String userwelcome = getElementText(userWelcome);
		Assert.assertEquals(userwelcome, expectedGreetings);

	}

	
	public void the_user_click_on_logout_button() {
	    click(logoutButton);
	    loadingWebPage();
	}

	
	public void verify_the_user_successfully_logout() {
	   String currenturl = driver.getCurrentUrl();
	   //Assert.assertEquals(currenturl, "http://xgendemo.uxli.com/login");
	}

	
	public void login_page_is_displayed() {
		loadingWebPage();
		  String currenturl = driver.getCurrentUrl();
		  
		   Assert.assertEquals(currenturl, "http://xgendemo.uxli.com/login");
	}
	
	
	public void close_the_chrome_browser() {
		quit();
	    
	}


	
}
