package com.xgen.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.CreatePostgresDBSourceLocators;
import com.xgen.automation.utils.Constants;

public class CreatePostgresDBSource extends CommonAction implements CreatePostgresDBSourceLocators {
	WebDriver driver;

	public CreatePostgresDBSource(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void the_user_click_on_connect_icon() {
		driver.findElement(connectIcon).click();
		loadingWebPage();

	}

	public void verify_sources_page_or_tab_is_present() {
		driver.findElement(sourcePageOrTab).isDisplayed();
		driver.findElement(sourcePageOrTab).click();
		loadingWebPage();

	}

	public void deletetheconnectionifpresent(String sourceName) {
		boolean sourcePresentorNot = verifySourceNameDisplayedInConnectSourcesTabList(sourceName);

		if (sourcePresentorNot == true) {
			loadingWebPage();
			deleteSourceFromConnectSourcesTabList(sourceName);
			loadingWebPage();
			driver.findElement(popupDeleteButton).click();
			loadingWebPage();
		} else {
			System.out.println("The source name is not present in the UI");
		}

		loadingWebPage();
		
		click(popupCancelButton);
		loadingWebPage();

	}

	public void deleteSource(String sourceName ) {
		sleep(2000);
		WebElement sourceDeleteicon = driver.findElement(By.xpath("//p[text()='"+sourceName+"']/parent::div/parent::div/parent::div/div[7]//span[@aria-label='Delete Source']/button"));
		
		hoverOverWebelementByAction(sourceDeleteicon);
		sleep(3000);
		clickByAction(sourceDeleteicon);
		System.out.println("The delete icon ****************** is clicked.");
		
		sleep(2000);

	}

	public void user_click_on_add_button() {
		driver.findElement(addButtonOnSourcesTab).click();
		loadingWebPage();

	}

	public void verify_several_db_sources_are_present() {
		driver.findElement(PostgresIcon).isDisplayed();

	}

	public void user_click_on_postgre_sql() {
		loadingWebPage();
		driver.findElement(PostgresIcon).click();
		loadingWebPage();

	}

	public void verify_a_pop_up_appears_with_various_input_fields() {
		loadingWebPage();
		driver.findElement(inputsrcname).isDisplayed();

	}

	public void the_user_enter_the_source_name_and_source_description(String source, String description) {
		loadingWebPage();
		clearText(inputsrcname, Constants.PostgreSQLsource);
		enterText(inputsrcname, Constants.PostgreSQLsource);

		clearText(inputsrcdesc, Constants.PostgreSQLDesc);
		enterText(inputsrcdesc, Constants.PostgreSQLDesc);

	}

	public void the_user_enter_host_port_db_name_schema_username_password() {

		enterText(inputhost, Constants.Host);

		enterText(inputdatabase, Constants.DatabaseName);

		click(inputschemasClearthePublic);
		enterText(inputschemas, Constants.Schemas);
		enterText(inputusername, Constants.Username);
		enterText(inputpassword, Constants.Password);
		click(radioButtonScanChanges);
		loadingWebPage();

	}

	public void the_user_click_on_Validate_button() {
		click(popupValidateButton);
		loadingWebPage();
	}

	public void verify_a_success_pop_appears() {
		sleep(2000);
		String succMessageActual = getElementText(successMessage);		
		//Assert.assertEquals(succMessageActual, "Success");
		explicitWait(successMessage, 30, "INVISIBILITY");
	}

	public void the_user_click_on_Create_button() {
		loadingWebPage();
		click(createButton);

	}

	public void verify_a_success_message() {
		loadingWebPage();

	}

}
