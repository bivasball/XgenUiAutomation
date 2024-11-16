package com.xgen.automation.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.CreatePostgresDBSourceLocators;
import com.xgen.automation.utils.Constants;

public class CreatePostgresDBSource extends CommonAction implements CreatePostgresDBSourceLocators {
	
	
	public static Logger log;

	public CreatePostgresDBSource() {
		log = LogManager.getLogger(CreatePostgresDBSource.class);

	}

	/*
	 * public CreatePostgresDBSource(WebDriver driver) { this.driver = driver;
	 * PageFactory.initElements(driver, this); }
	 */

	public void the_user_click_on_connect_icon() {
		//driver.findElement(connectIcon).click();
		log.info("Click the Connect Icon");
		click(connectIcon,"VISIBILITY");
		loadingWebPage();

	}

	public void verify_sources_page_or_tab_is_present() {
		//driver.findElement(sourcePageOrTab).isDisplayed();
		//driver.findElement(sourcePageOrTab).click();
		log.info("Click the source page or tab");
		click(sourcePageOrTab,"VISIBILITY");
		loadingWebPage();

	}

	public void deletetheconnectionifpresent(String sourceName) {
		boolean sourcePresentorNot = verifySourceNameDisplayedInConnectSourcesTabList(sourceName);

		if (sourcePresentorNot == true) {
			loadingWebPage();
			deleteSourceFromConnectSourcesTabList(sourceName);
			loadingWebPage();
			//driver.findElement(popupDeleteButton).click();
			log.info("Click the Pop up Delete Button");
			click(popupDeleteButton,"VISIBILITY");
			loadingWebPage();
		} else {
			System.out.println("The source name is not present in the UI");
			log.info("The source name is not present in the UI");
		}

		loadingWebPage();
		log.info("Click the Pop up Cancel Button");
		click(popupCancelButton,"VISIBILITY");
		loadingWebPage();

	}

	public void deleteSource(String sourceName ) {
		sleep(2000);
		WebElement sourceDeleteicon = driver.findElement(By.xpath("//p[text()='"+sourceName+"']/parent::div/parent::div/parent::div/div[7]//span[@aria-label='Delete Source']/button"));
		
		hoverOverWebelementByAction(sourceDeleteicon);
		sleep(3000);
		log.info("Click The delete icon");
		clickByAction(sourceDeleteicon);
		System.out.println("The delete icon ****************** is clicked.");
		
		sleep(2000);

	}

	public void user_click_on_add_button() {
		//driver.findElement(addButtonOnSourcesTab).click();
		log.info("Click The Add Button on Source tab");
		click(addButtonOnSourcesTab,"VISIBILITY");
		loadingWebPage();

	}

	public void verify_several_db_sources_are_present() {
		driver.findElement(PostgresIcon).isDisplayed();

	}

	public void user_click_on_postgre_sql() {
		loadingWebPage();
		
		//driver.findElement(PostgresIcon).click();
		log.info("Click The Postgres Icon");
		click(PostgresIcon,"VISIBILITY");
		loadingWebPage();

	}

	public void verify_a_pop_up_appears_with_various_input_fields() {
		loadingWebPage();
		driver.findElement(inputsrcname).isDisplayed();

	}

	public void the_user_enter_the_source_name_and_source_description(String source, String description) {
		loadingWebPage();
		clearText(inputsrcname);
		log.info("Enter the Postgre SQL source");
		enterText(inputsrcname, Constants.PostgreSQLsource);

		clearText(inputsrcdesc);
		log.info("Enter the Postgresql Desc");
		enterText(inputsrcdesc, Constants.PostgreSQLDesc);

	}

	public void the_user_enter_host_port_db_name_schema_username_password() {
		log.info("Enter the Hostname");
		enterText(inputhost, Constants.Host);
		log.info("Enter the Database name");
		enterText(inputdatabase, Constants.DatabaseName);
		log.info("Click clear the Public");
		click(inputschemasClearthePublic);
		log.info("Enter the Schema name");
		enterText(inputschemas, Constants.Schemas);
		log.info("Enter the Username");
		enterText(inputusername, Constants.Username);
		log.info("Enter the password");
		enterText(inputpassword, Constants.Password);
		log.info("Click the raddio button scan changes");
		click(radioButtonScanChanges);
		loadingWebPage();

	}

	public void the_user_click_on_Validate_button() {
		log.info("Click the popup Validate Button");
		click(popupValidateButton);
		loadingWebPage();
	}

	public void verify_a_success_pop_appears() {
		sleep(2000);
		//String succMessageActual = getElementText(successMessage);		
		//Assert.assertEquals(succMessageActual, "Success");
		explicitWait(successMessage, 30, "INVISIBILITY");
	}

	public void the_user_click_on_Create_button() {
		loadingWebPage();
		log.info("Click the Create button");
		click(createButton);

	}

	public void verify_a_success_message() {
		loadingWebPage();

	}

}
