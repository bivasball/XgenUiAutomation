package com.xgen.automation.definations;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;

import com.xgen.automation.actions.CreatingConnectionAction;
import com.xgen.automation.actions.Creating_The_Model_Action;
import com.xgen.automation.actions.Creating_The_Model_DIM_PRODUCTS_Action;
import com.xgen.automation.base.CommonAction;

public class Creating_The_Model_DIM_PRODUCTS_Def extends CommonAction {
	Creating_The_Model_DIM_PRODUCTS_Action creating_The_Model_DIM_PRODUCTS_Action;

	public Creating_The_Model_DIM_PRODUCTS_Def() {
		creating_The_Model_DIM_PRODUCTS_Action = new Creating_The_Model_DIM_PRODUCTS_Action();
	}

	@Given("Click on View Radio button to select the view")
	public void click_on_view_radio_button_to_select_the_view() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_view_radio_button_to_select_the_view();
	}

	@Given("Enter the input DIM PRODUCTS to Model Name")
	public void enter_the_input_dim_products_to_model_name() {
		creating_The_Model_DIM_PRODUCTS_Action.enter_the_input_dim_products_to_model_name();
	}

	@Given("Enter the input Dim products to Model Desc")
	public void enter_the_input_dim_products_to_model_desc() {
		creating_The_Model_DIM_PRODUCTS_Action.enter_the_input_dim_products_to_model_desc();
	}

	@Given("Select edw from the drop down Model Schema")
	public void select_edw_from_the_drop_down_model_schema() {
		creating_The_Model_DIM_PRODUCTS_Action.select_edw_from_the_drop_down_model_schema();
	}

	@Given("Click on Source Node and Choose PRODUCTS")
	public void click_on_source_node_and_choose_products() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_source_node_and_choose_products();
	}

	@Given("Click on Join Node and Map PRODUCTS to Join Node JOIN1")
	public void click_on_join_node_and_map_products_to_join_node_join1() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join_node_and_map_products_to_join_node_join1();
	}

	@Given("Click on PRODUCTS Node and choose the Check box of Columns tab")
	public void click_on_products_node_and_choose_the_check_box_of_columns_tab() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_products_node_and_choose_the_check_box_of_columns_tab();
	}

	@Given("Click on Source Node and Choose CATEGORIES")
	public void click_on_source_node_and_choose_categories() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_source_node_and_choose_categories();
	}

	@Given("Click on Join Node and Map CATEGORIES to Join Node JOIN1")
	public void click_on_join_node_and_map_categories_to_join_node_join1() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join_node_and_map_categories_to_join_node_join1();
	}

	@Given("Click on CATEGORIES Node and choose the Check box of Columns tab")
	public void click_on_categories_node_and_choose_the_check_box_of_columns_tab() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_categories_node_and_choose_the_check_box_of_columns_tab();
	}

	@Given("Click on JOIN1 Node and Map JOIN1 to DIM PRODUCTS Node")
	public void click_on_join1_node_and_map_join1_to_dim_products_node() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join1_node_and_map_join1_to_dim_products_node();
	}

	@Given("Click on JOIN1 Node and choose the Check box of Columns tab")
	public void click_on_join1_node_and_choose_the_check_box_of_columns_tab() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join1_node_and_choose_the_check_box_of_columns_tab();
	}

	@Given("Click on Join tab on JOIN1")
	public void click_on_join1_and_click_on_join_tab() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join1_and_click_on_join_tab();
	}

	@Given("Click on Edit join of JOIN1")
	public void click_on_edit_join_of_join1() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_edit_join_of_join1();
	}

	@Given("Click on Join Type LEFT OUTER JOIN and click on plus icon Add")
	public void click_on_join_type_left_outer_join_and_click_on_plus_icon_add() {
		creating_The_Model_DIM_PRODUCTS_Action.click_on_join_type_left_outer_join_and_click_on_plus_icon_add();
	}

	@Given("Create a left outer join with s_products.CATEGORYID = l_categories.CATEGORYID")
	public void create_a_left_outer_join_with_s_products_categoryid_l_categories_categoryid() {
		creating_The_Model_DIM_PRODUCTS_Action
				.create_a_left_outer_join_with_s_products_categoryid_l_categories_categoryid();
	}

	@Given("Click Apply button")
	public void click_apply_button() {
		creating_The_Model_DIM_PRODUCTS_Action.click_apply_button();
	}

	@Given("Create Button and Select Save the DIM PRODUCTS model")
	public void create_button_and_select_save_the_dim_products_model() {
		creating_The_Model_DIM_PRODUCTS_Action.create_button_and_select_save_the_dim_products_model();
	}

}