package com.xgen.automation.actions;

import org.openqa.selenium.By;
import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;

public class Creating_The_Model_DIM_PRODUCTS_Action extends CommonAction implements Creating_The_Model_Locator {

	public void selectCheckBox(String fieldName) {

		By checkboxselect = By.xpath("//p[text()='" + fieldName + "']/parent::div/parent::div/div/span/input");
		click(checkboxselect);
		
	}

	public void selectCheckBox(String source, String fieldName) {		
		By checkboxselect = By.xpath("//p[text()='" + source + "']/parent::div/preceding-sibling::div//p[text()='"
				+ fieldName + "']/parent::div/parent::div/div/span/input");
		click(checkboxselect);
		
	}

	public void click_on_view_radio_button_to_select_the_view() {		
		click(radiobuttonView);
		loadingWebPage();

	}

	public void enter_the_input_dim_products_to_model_name() {		
		click(inputModelName);
		enterText(inputModelName, "DIM_PRODUCTS");

	}

	public void enter_the_input_dim_products_to_model_desc() {		
		click(inputModelDescrip);
		enterText(inputModelDescrip, "Dim products for model");

	}

	public void select_edw_from_the_drop_down_model_schema() {		
		click(modelSchemaDropdown);	
		click(selectEDW);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		sleep(1000);
	}

	

	public void click_on_source_node_and_choose_products() {		
		click(buttonSourceNode);
		loadingWebPage();
		sleep(1000);		
		click(sourceObject);
		sleep(1000);		
		click(source_Products);
		loadingWebPage();
		sleep(5000);

	}

	public void click_on_join_node_and_map_products_to_join_node_join1() {		
		click(buttonJoinNode);
		loadingWebPage();
		sleep(3000);
		// ----join Products to join_1 ----//
		dragAndDropFromSourceToDestination(productNode, join_1_leftSideNode);
		sleep(3000);
	}

	public void click_on_products_node_and_choose_the_check_box_of_columns_tab() {		
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
		
		click(openArea);
		loadingWebPage();
		sleep(2000);

	}

	public void click_on_source_node_and_choose_categories() {
		click(buttonSourceNode);
		loadingWebPage();

		click(sourceObject);
		loadingWebPage();
		
		click(source_Categories);
		loadingWebPage();
		sleep(5000);

	}

	public void click_on_join_node_and_map_categories_to_join_node_join1() {
		
		// ----join Categories to join_1 ----//
		dragAndDropFromSourceToDestination(categoriesNode, join_1_leftSideNode);

		sleep(5000);

	}

	public void click_on_categories_node_and_choose_the_check_box_of_columns_tab() {		
		click(categoriesLabel);
		loadingWebPage();
		sleep(2000);
		selectCheckBox("CategoryID");
		selectCheckBox("Description");
		selectCheckBox("CategoryName");

		click(openArea);
		loadingWebPage();
		sleep(2000);

	}

	public void click_on_join1_node_and_map_join1_to_dim_products_node() {
		
		dragAndDropFromSourceToDestination(join_1_RightSideNode, ModelNameNode);

		sleep(5000);

	}

	public void click_on_join1_node_and_choose_the_check_box_of_columns_tab() {		
		click(label_join_1);
		sleep(1000);

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
		
		click(button_Join_1_join_tab);

	}

	public void click_on_edit_join_of_join1() {
		
		click(button_Join_1_join_tab_editJoin);
	}

	public void click_on_join_type_left_outer_join_and_click_on_plus_icon_add() {
		
		click(button_left_outer_join);

		
		click(icon_add);

		
	}

	public void create_a_left_outer_join_with_s_products_categoryid_l_categories_categoryid() {
		
		

		enterText(input_s_categories, "CATEGORYID");
		sendReturnKey(input_s_categories);
		sleep(1000);

		
		enterText(input_s_products, "CATEGORYID");
		sendReturnKey(input_s_products);
		sleep(1000);

		

	}

	public void click_apply_button() {
		
		
		click(button_apply);
		sleep(2000);
		click(button_apply);

		loadingWebPage();
		sleep(2000);

	}

	
	public void create_button_and_select_save_the_dim_products_model() {
		
		
		click(button_create);
		loadingWebPage();
		loadingWebPage();

		
		click(button_save_icon);

		sleep(5000);

	}
	
	

}