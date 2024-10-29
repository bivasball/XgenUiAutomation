package com.xgen.automation.definations;

import com.xgen.automation.actions.Deleting_The_Model_Action;
import com.xgen.automation.base.CommonAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Deleting_The_Model_Def extends CommonAction {
	Deleting_The_Model_Action deleting_The_Model_Action;
	
	public Deleting_The_Model_Def(){
		deleting_The_Model_Action = new Deleting_The_Model_Action();
	}
	
	@Given("verify if DIM_PRODUCTS data model is present or not")
	public void verify_if_dim_products_data_model_is_present_or_not() {
		deleting_The_Model_Action.verify_if_dim_products_data_model_is_present_or_not();
	}

	@Given("if DIM_PRODUCTS data model is present then click on Delete icon from Actions section")
	public void if_dim_products_data_model_is_present_then_click_on_delete_icon_from_actions_section() {
		deleting_The_Model_Action.if_dim_products_data_model_is_present_then_click_on_delete_icon_from_actions_section();
	}

	@Then("verify DIM_PRODUCTS data model is Deleted successfully")
	public void verify_dim_products_data_model_is_deleted_successfully() {
		deleting_The_Model_Action.verify_dim_products_data_model_is_deleted_successfully();
	}


	
	
	


}