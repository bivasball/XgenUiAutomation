package com.xgen.automation.actions.CreatingTheConnections;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.CreatingTheConnections.CreatingtheConnectionsLocator;

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
		click(select_OrderID);
		loadingWebPage();
		click(primarykey_dropdown);
		By select_ProductID = By.xpath("//ul/li//span[text()='ProductID']/parent::div/parent::div/span/input");
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
		click(select_OrderID);
		loadingWebPage();
		click(primarykey_dropdown);
		By select_ProductID = By.xpath("//ul/li//span[text()='ProductID']/parent::div/parent::div/span/input");
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
		
	}

}