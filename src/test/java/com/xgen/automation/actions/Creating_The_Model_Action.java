package com.xgen.automation.actions;

import org.openqa.selenium.By;
import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;
import com.xgen.automation.locators.CreatingtheConnectionsLocator;

import io.cucumber.java.en.Given;

public class Creating_The_Model_Action extends CommonAction implements Creating_The_Model_Locator {

	public void navigate_to_data_modeller() {
		By modelIcon = By.xpath("//span[text()='Model']");
		click(modelIcon);
		loadingWebPage();
		sleep(1000);
		By plusiconAddButton = By.xpath("//p[text()='Add']/parent::a");
		click(plusiconAddButton);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();

		By radiobuttonView = By.xpath("//span[text()='View']/parent::label/span/input");
		click(radiobuttonView);
		loadingWebPage();

		By inputModelName = By.xpath("//input[@id='modelName']");
		click(inputModelName);
		enterText(inputModelName, "DIM_PRODUCTS");

		By inputModelDescrip = By.xpath("//input[@id='modelDesc']");
		click(inputModelDescrip);
		enterText(inputModelDescrip, "DIM_PRODUCTS");

		By modelSchemaDropdown = By.xpath("//div[@id='select-schema-label']");
		click(modelSchemaDropdown);

		By selectEDW = By.xpath("//p[text()='edw']");
		click(selectEDW);

		// ------------------for Products -------------//
		By buttonSourceNode = By.xpath("//span[@aria-label='Source Node']/button");
		click(buttonSourceNode);
		loadingWebPage();
		sleep(1000);

		By sourceObject = By.xpath("//div[text()='TESTAUTOMATE']");
		click(sourceObject);
		sleep(1000);

		By source_Products = By.xpath("//p[text()='PRODUCTS']");
		click(source_Products);
		loadingWebPage();
		sleep(5000);

		By buttonJoinNode = By.xpath("//span[@aria-label='Join Node']/button");
		click(buttonJoinNode);
		loadingWebPage();
		sleep(3000);

		By productNode = By.xpath("//div[@data-nodeid='SRN_1']");

		By join_1_leftSideNode = By.xpath("//div[@data-id='JON_2-JON-target']");
		By join_1_RightSideNode = By.xpath("//div[@data-id='JON_2-JON-source']");

		// ----join Products to join_1 ----//
		dragAndDropFromSourceToDestination(productNode, join_1_leftSideNode);

		sleep(3000);

		// -----------------------------for categories ----------------//
		click(buttonSourceNode);
		loadingWebPage();

		click(sourceObject);
		loadingWebPage();

		By source_Categories = By.xpath("//p[text()='CATEGORIES']");
		click(source_Categories);
		loadingWebPage();
		sleep(5000);
		By categoriesNode = By.xpath("//div[@data-nodeid='SRN_3']");
		// ----join Categories to join_1 ----//
		dragAndDropFromSourceToDestination(categoriesNode, join_1_leftSideNode);

		sleep(5000);

		// ----check box selection for PRODUCTS ---//
		By productLabel = By.xpath("//span[text()='S_PRODUCTS']/parent::div[contains(@class,'MuiBox-root')]");
		click(productLabel);
		loadingWebPage();
		sleep(2000);
		selectCheckBox("ProductID");
		selectCheckBox("UnitPrice");
		selectCheckBox("CategoryID");
		selectCheckBox("SupplierID");
		selectCheckBox("ProductName");
		selectCheckBox("Discontinued");
		selectCheckBox("ReorderLevel");
		selectCheckBox("UnitsInStock");
		selectCheckBox("UnitsOnOrder");
		selectCheckBox("QuantityPerUnit");

		By openArea = By.xpath("//div[@class='react-flow__viewport react-flow__container']");
		click(openArea);
		loadingWebPage();
		sleep(2000);

		// ----check box selection for Categories ---//
		By categoriesLabel = By.xpath("//span[text()='S_CATEGORIES']/parent::div[contains(@class,'MuiBox-root')]");
		click(categoriesLabel);
		loadingWebPage();
		sleep(2000);
		selectCheckBox("CategoryID");
		selectCheckBox("Description");
		selectCheckBox("CategoryName");

		click(openArea);
		loadingWebPage();
		sleep(2000);

		// ---9. Create a left outer join with “s_products.CATEGORYID =
		// l_categories.CATEGORYID” by selecting join node. ---in JOIN_1 node//
		By join_1_node_label = By.xpath("[text()='JOIN_1']");
		click(join_1_node_label);
		sleep(1000);
		By button_Join_1_join_tab = By.xpath("//button[text()='Join']");
		click(button_Join_1_join_tab);

		By button_Join_1_join_tab_editJoin = By.xpath("//button[text()='Edit Join']");
		click(button_Join_1_join_tab_editJoin);

		By button_left_outer_join = By.xpath("//button[@value='LEFT OUTER JOIN']");
		click(button_left_outer_join);

		By icon_add = By.xpath("//div[contains(@class,'MuiBox-root css-z6iby2')]//button");
		click(icon_add);

		By input_s_categories = By.xpath("//div[contains(@class,'css-1a1stbe')]/div[1]//input");
										  
		enterText(input_s_categories, "CATEGORYID");
		sendReturnKey(input_s_categories);
		sleep(1000);
		
		By input_s_products = By.xpath("//div[contains(@class,'css-1a1stbe')]/div[3]//input");
		enterText(input_s_products, "CATEGORYID");
		sendReturnKey(input_s_products);
		sleep(1000);
		
		By button_apply = By.xpath("//p[text()='Apply']/parent::button");
		click(button_apply);
		sleep(2000);
		click(button_apply);

		loadingWebPage();
		sleep(15000);

		// ------------------join -----JOIN_1 to ModelName ---------

		By ModelNameNode = By.xpath("//div[@data-nodeid='SEN_NODE']");
		dragAndDropFromSourceToDestination(join_1_RightSideNode, ModelNameNode);

		sleep(5000);

		//----------------------- click create button ----------------//
		By button_create = By.xpath("//p[text()='Create']");
		click(button_create);
		loadingWebPage();
		loadingWebPage();
		
		By button_save_icon = By.xpath("//ul[@role='menu']/li[1]");
		click(button_save_icon);
		
		sleep(5000);
		
	}

	public void selectCheckBox(String fieldName) {

		By checkboxselect = By.xpath("//p[text()='" + fieldName + "']/parent::div/parent::div/div/span/input");

		click(checkboxselect);
		// sleep(200);
	}

}