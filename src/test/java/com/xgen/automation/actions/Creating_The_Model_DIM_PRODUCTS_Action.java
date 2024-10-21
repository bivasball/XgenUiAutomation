package com.xgen.automation.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;

public class Creating_The_Model_DIM_PRODUCTS_Action extends CommonAction implements Creating_The_Model_Locator {

	public static Logger log;

	public Creating_The_Model_DIM_PRODUCTS_Action() {
		log = LogManager.getLogger(Creating_The_Model_DIM_PRODUCTS_Action.class);

	}

	public void selectCheckBox(String fieldName) {

		By checkboxselect = By.xpath("//p[text()='" + fieldName + "']/parent::div/parent::div/div/span/input");
		click(checkboxselect, "PRESENCE");
		log.info("The check box is selected");

	}

	public void selectCheckBox(String source, String fieldName) {
		By checkboxselect = By.xpath("//p[text()='" + source + "']/parent::div/preceding-sibling::div//p[text()='"
				+ fieldName + "']/parent::div/parent::div/div/span/input");
		click(checkboxselect, "PRESENCE");
		log.info("The check box is selected");

	}

	public void click_on_view_radio_button_to_select_the_view() {
		log.info("to click the radio button");
		click(radiobuttonView, "SELECTED");
		log.info("The radio button is clicked");
		loadingWebPage();

	}

	public void enter_the_input_dim_products_to_model_name() {
		log.info("Enter DIM_PRODUCTS to model name ");
		click(inputModelName, "VISIBILITY");
		enterText(inputModelName, "DIM_PRODUCTS");

	}

	public void enter_the_input_dim_products_to_model_desc() {
		log.info("Enter Description to model name ");
		click(inputModelDescrip, "VISIBILITY");
		enterText(inputModelDescrip, "Dim products for model");

	}

	public void select_edw_from_the_drop_down_model_schema() {
		log.info("Select edw from the model schema ");
		click(modelSchemaDropdown, "VISIBILITY");

		click(selectEDW, "VISIBILITY");
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		// sleep(1000);
	}

	public void click_on_source_node_and_choose_products() {
		log.info("click on source node  ");
		click(buttonSourceNode, "VISIBILITY");
		loadingWebPage();
		// sleep(1000);
		log.info("click on source object");
		click(sourceObject, "VISIBILITY");
		// sleep(1000);
		log.info("click on source Product");
		click(source_Products, "VISIBILITY");
		loadingWebPage();
		// sleep(5000);

	}

	public void click_on_join_node_and_map_products_to_join_node_join1() {
		click(buttonJoinNode, "VISIBILITY");
		loadingWebPage();
		// sleep(3000);
		// ----join Products to join_1 ----//
		dragAndDropFromSourceToDestination(productNode, join_1_leftSideNode);
		log.info("Product node to Join_1 node is mapped");
		// sleep(3000);
	}

	public void click_on_products_node_and_choose_the_check_box_of_columns_tab() {
		log.info("Select the check box of Column tab of Products");
		click(productLabel, "VISIBILITY");
		loadingWebPage();
		// sleep(2000);
		log.info("Select the checkboxes");
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
		log.info("Click in the open area");
		click(openArea, "VISIBILITY");
		loadingWebPage();
		// sleep(2000);

	}

	public void click_on_source_node_and_choose_categories() {
		log.info("Select the Source Node");
		click(buttonSourceNode, "VISIBILITY");
		loadingWebPage();
		log.info("Select the source Object");
		click(sourceObject, "VISIBILITY");
		loadingWebPage();
		log.info("Select the source Categories");
		click(source_Categories, "VISIBILITY");
		loadingWebPage();
		// sleep(5000);

	}

	public void click_on_join_node_and_map_categories_to_join_node_join1() {

		// ----join Categories to join_1 ----//
		log.info("Map the Categories to Join_1 node");
		dragAndDropFromSourceToDestination(categoriesNode, join_1_leftSideNode);

		// sleep(5000);

	}

	public void click_on_categories_node_and_choose_the_check_box_of_columns_tab() {
		log.info("Click the label Categories");
		click(categoriesLabel, "VISIBILITY");
		loadingWebPage();
		// sleep(2000);
		log.info("Select the checkboxes");
		selectCheckBox("CategoryID");
		selectCheckBox("Description");
		selectCheckBox("CategoryName");
		log.info("Click on the open Area");
		click(openArea, "VISIBILITY");
		loadingWebPage();
		// sleep(2000);

	}

	public void click_on_join1_node_and_map_join1_to_dim_products_node() {
		log.info("Map the Join_1 node to Dim_Products Node");

		dragAndDropFromSourceToDestination(join_1_RightSideNode, ModelNameNode);

		// sleep(5000);

	}

	public void click_on_join1_node_and_choose_the_check_box_of_columns_tab() {
		log.info("Click the label Join_1");
		click(label_join_1, "VISIBILITY");
		// sleep(1000);
		log.info("Select the checkboxes");
		selectCheckBox("s_categories", "CategoryID");
		selectCheckBox("s_categories", "Description");
		selectCheckBox("s_categories", "CategoryName");

		selectCheckBox("s_products", "ProductID");
		selectCheckBox("s_products", "UnitPrice");
		selectCheckBox("s_products", "SupplierID");
		selectCheckBox("s_products", "ProductName");
		selectCheckBox("s_products", "Discontinued");
		selectCheckBox("s_products", "ReorderLevel");
		selectCheckBox("s_products", "UnitsInStock");
		selectCheckBox("s_products", "UnitsOnOrder");
		selectCheckBox("s_products", "QuantityPerUnit");

	}

	public void click_on_join1_and_click_on_join_tab() {
		log.info("Click the the join tab");
		click(button_Join_1_join_tab, "VISIBILITY");

	}

	public void click_on_edit_join_of_join1() {

		click(button_Join_1_join_tab_editJoin, "VISIBILITY");
	}

	public void click_on_join_type_left_outer_join_and_click_on_plus_icon_add() {
		log.info("Click the left out join button");
		click(button_left_outer_join, "VISIBILITY");

		log.info("Click the Icon Add button");
		click(icon_add, "VISIBILITY");

	}

	public void create_a_left_outer_join_with_s_products_categoryid_l_categories_categoryid() {

		log.info("Enter the text Category id ");
		enterText(input_s_categories, "CATEGORYID");
		sendReturnKey(input_s_categories);
		// sleep(1000);

		enterText(input_s_products, "CATEGORYID");
		sendReturnKey(input_s_products);
		// sleep(1000);

	}

	public void click_apply_button() {

		log.info("Click the Apply button");
		click(button_apply, "VISIBILITY");
		// sleep(2000);

		loadingWebPage();
		// sleep(2000);

	}

	public void create_button_and_select_save_the_dim_products_model() {

		log.info("Click the Create button");
		click(button_create, "PRESENCE");
		loadingWebPage();
		loadingWebPage();

		log.info("Click the save button");
		click(button_save_icon, "PRESENCE");
		loadingWebPage();
		loadingWebPage();
		// sleep(1000);

	}

}