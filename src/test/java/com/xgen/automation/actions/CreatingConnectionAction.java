package com.xgen.automation.actions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.CreatingtheConnectionsLocator;

import io.cucumber.java.en.Given;

public class CreatingConnectionAction extends CommonAction implements CreatingtheConnectionsLocator {

	public void user_navigate_to_data_sync_by_clicking_on_sync_icon() {

		click(syncIcon);
		loadingWebPage();
		loadingWebPage();

	}

	public void verify_that_the_current_url_is(String string) {
		String theActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(theActualUrl, string);
		loadingWebPage();

	}

	public void user_click_on_add_icon_button() {

		click(addButtonOnSourcesTab);
		loadingWebPage();

	}

	public void verify_that_ther_current_url_is(String string) {
		String theActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(theActualUrl, string);
		loadingWebPage();

	}

	public void the_user_enter_input_values_to_connection_name_input_box(String string) {

		enterText(inputConnectionName, string);
		loadingWebPage();

	}

	public void the_user_enter_input_values_to_description_input_box(String string) {

		enterText(inputDescription, string);
		loadingWebPage();

	}

	public void the_user_select_from_the_select_source_dropdown(String string) {

		click(sourceDropDown);

		// By selectPgSalesDb= By.xpath("//li/div/span[text()='Pg sales db']");
		By selectPgSalesDb = By.xpath("//li/div/span[text()='" + string + "']");
		click(selectPgSalesDb);
		loadingWebPage();
		// sleep(5000);

	}

	public void the_user_select_from_the_select_destination_dropdown(String string) {

		click(destinationDropDown);

		By selectDWforTestAutomation = By.xpath("//li/div/span[text()='" + string + "']");
		click(selectDWforTestAutomation);
		loadingWebPage();
		loadingWebPage();
		// sleep(5000);

	}

	public void the_user_select_mui_switch_checkbox_for_entity_value_and_sync_mode_from_the_dropdown_and_primary_key_from_the_dropdown(
			String string, String string2, String string3) {

		categories();
		customers();
		employees();
		order_details();
		orders();
		products();
		transactions();

	}

	public void categories() {
		By mui_checkbox = By.xpath("//p[text()='categories']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='categories']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_CategoryID = By.xpath("//ul/li//span[text()='CategoryID']/parent::div/parent::div/span/input");
		scrollIntoView(select_CategoryID);
		click(select_CategoryID);
		loadingWebPage();
		// sleep(1000);

	}

	public void customers() {

		By mui_checkbox = By.xpath("//p[text()='customers']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='customers']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_CategoryID = By.xpath("//ul/li//span[text()='CustomerID']/parent::div/parent::div/span/input");
		scrollIntoView(select_CategoryID);
		click(select_CategoryID);
		loadingWebPage();
		// sleep(1000);

	}

	public void employees() {
		By mui_checkbox = By.xpath("//p[text()='employees']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='employees']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_CategoryID = By.xpath("//ul/li//span[text()='EmployeeID']/parent::div/parent::div/span/input");
		scrollIntoView(select_CategoryID);
		click(select_CategoryID);
		loadingWebPage();
		// sleep(1000);

	}

	public void order_details() {
		By mui_checkbox = By.xpath("//p[text()='order_details']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='order_details']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_OrderID = By.xpath("//ul/li//span[text()='OrderID']/parent::div/parent::div/span/input");
		scrollIntoView(select_OrderID);
		click(select_OrderID);
		loadingWebPage();
		click(primarykey_dropdown);
		By select_ProductID = By.xpath("//ul/li//span[text()='ProductID']/parent::div/parent::div/span/input");
		scrollIntoView(select_ProductID);
		click(select_ProductID);
		loadingWebPage();
		// sleep(1000);

	}

	public void orders() {

		By mui_checkbox = By.xpath("//p[text()='orders']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By.xpath("//p[text()='orders']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_OrderID = By.xpath("//ul/li//span[text()='OrderID']/parent::div/parent::div/span/input");
		scrollIntoView(select_OrderID);
		click(select_OrderID);
		loadingWebPage();

		// sleep(1000);

	}

	public void products() {
		By mui_checkbox = By.xpath("//p[text()='products']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='products']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_ProductID = By.xpath("//ul/li//span[text()='ProductID']/parent::div/parent::div/span/input");
		scrollIntoView(select_ProductID);
		click(select_ProductID);
		loadingWebPage();

		// sleep(1000);

	}

	public void transactions() {

		By mui_checkbox = By.xpath("//p[text()='transactions']/parent::div/parent::div/div/span/span/input");
		scrollIntoView(mui_checkbox);
		click(mui_checkbox);

		By primarykey_dropdown = By
				.xpath("//p[text()='transactions']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		// sleep(1000);
		By select_OrderID = By.xpath("//ul/li//span[text()='OrderID']/parent::div/parent::div/span/input");
		scrollIntoView(select_OrderID);
		click(select_OrderID);
		loadingWebPage();
		click(primarykey_dropdown);
		By select_ProductID = By.xpath("//ul/li//span[text()='ProductID']/parent::div/parent::div/span/input");
		scrollIntoView(select_ProductID);
		click(select_ProductID);
		loadingWebPage();
		// sleep(1000);
	}

	public void the_user_click_on_create_icon_button() {
		By createButton = By.xpath("//p[text()='Create']");
		click(createButton);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		

	}

	public void click_on_sync_data_flow_button_from_the_action_section_for(String string) {

		/*
		 * By syncDataFlowIcon = By.xpath(
		 * "//div//p[text()='Pg sales db']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Sync Data Flow']/button"
		 * );
		 */
		By syncDataFlowIcon = By.xpath(
				"//div//p[text()='"+string+"']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Sync Data Flow']/button");
		click(syncDataFlowIcon);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		/*
		 * By jobsLogsIcon = By.xpath(
		 * "//div//p[text()='Pg sales db']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Job Logs']/button"
		 * );
		 */
		By jobsLogsIcon = By.xpath(
				"//div//p[text()='"+string+"']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Job Logs']/button");
		click(jobsLogsIcon);
		loadingWebPage();

	}

	public void verify_from_the_job_logs_button_that_the_sync_is_succeeded() {

		By syncJobHistoryStatus = By
				.xpath("//p[contains(text(),'Sync Job History')]/parent::h2/following-sibling::div[1]//h6");
		loadingWebPage();
		loadingWebPage();
		String syncJobStatus = getElementText(syncJobHistoryStatus);
		System.out.println("-----------" + syncJobStatus);
		// Sync Succeeded

		By syncJobHistoryRefreshButton = By.xpath(
				"//p[contains(text(),'Sync Job History')]/parent::h2/following-sibling::div[2]//p[text()='Refresh']");

		By syncJobHistoryCloseButton = By.xpath(
				"//p[contains(text(),'Sync Job History')]/parent::h2/following-sibling::div[2]//p[text()='Close']");

		for (int count = 1; count <= 10; count++) {
			if (!getElementText(syncJobHistoryStatus).contains("Sync Succeeded")) {
				sleep(7000);
				click(syncJobHistoryRefreshButton);
				loadingWebPage();
				System.out.println("----in progress-------" + getElementText(syncJobHistoryStatus));
			} else if(getElementText(syncJobHistoryStatus).contains("Sync Succeeded")){
				System.out.println("-----Success------" + getElementText(syncJobHistoryStatus));
				break;
			}
		}


		click(syncJobHistoryCloseButton);
		
	}

	
	//--------------//-------------------- For Categories Forecast -----------------------//---------------//
	
	public void the_user_select_mui_switch_checkbox_for_entity_value(String string) {
		By mui_checkbox = By.xpath("//p[text()='CATEGORY_FORECAST']/parent::div/parent::div/div/span/span/input");
		//scrollIntoView(mui_checkbox);
		//click(mui_checkbox);
	}

	
	public void sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdown(String string) {
		
		
		By primarykey_dropdown = By
				.xpath("//p[text()='CATEGORY_FORECAST']/parent::div/parent::div/div[7]//div[@role='combobox']");
		click(primarykey_dropdown);
		
		By select_Forecast_Month = By.xpath("//ul/li//span[text()='Forecast_Month']/parent::div/parent::div/span/input");
		scrollIntoView(select_Forecast_Month);
		click(select_Forecast_Month);
		
		click(primarykey_dropdown);
		loadingWebPage();
		By select_Category_Name = By.xpath("//ul/li//span[text()='Category_Name']/parent::div/parent::div/span/input");
		scrollIntoView(select_Category_Name);
		click(select_Category_Name);
		loadingWebPage();
		
	}
	
	//--------------//-------------------- For Company Data -----------------------//---------------//
	
		public void the_user_select_mui_switch_checkbox_for_entity_value_for_company_data(String string) {
			By mui_checkbox = By.xpath("//p[text()='COMPANY']/parent::div/parent::div/div/span/span/input");
			//scrollIntoView(mui_checkbox);
			//click(mui_checkbox);
		}

		
		public void sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdownfor_company_data(String string) {
			
			
			By primarykey_dropdown = By
					.xpath("//p[text()='COMPANY']/parent::div/parent::div/div[7]//div[@role='combobox']");
			click(primarykey_dropdown);
			
			By select_CustomerID = By.xpath("//ul/li//span[text()='CustomerID']/parent::div/parent::div/span/input");
			scrollIntoView(select_CustomerID);
			click(select_CustomerID);
			
			loadingWebPage();
			
		}
	
		//--------------//-------------------- For Survey Data -----------------------//---------------//
		
			public void the_user_select_mui_switch_checkbox_for_entity_value_for_survey_data(String string) {
				By mui_checkbox = By.xpath("//p[text()='SURVEY']/parent::div/parent::div/div/span/span/input");
				//scrollIntoView(mui_checkbox);
				//click(mui_checkbox);
			}

			
			public void sync_mode_from_the_dropdown_and_select_primary_key_from_the_dropdownfor_survey_data(String string) {
				
				
				By primarykey_dropdown = By
						.xpath("//p[text()='SURVEY']/parent::div/parent::div/div[7]//div[@role='combobox']");
				click(primarykey_dropdown);
				
				By select_CustomerID = By.xpath("//ul/li//span[text()='CustomerID']/parent::div/parent::div/span/input");
				scrollIntoView(select_CustomerID);
				click(select_CustomerID);
				
				click(primarykey_dropdown);
				
				By select_Survey_Date  = By.xpath("//ul/li//span[text()='Survey_Date']/parent::div/parent::div/span/input");
				scrollIntoView(select_Survey_Date);
				click(select_Survey_Date);
				
				click(primarykey_dropdown);
				
				By select_Survey_Category  = By.xpath("//ul/li//span[text()='Survey_Category']/parent::div/parent::div/span/input");
				scrollIntoView(select_Survey_Category);
				click(select_Survey_Category);
				
				loadingWebPage();
				
			}
}