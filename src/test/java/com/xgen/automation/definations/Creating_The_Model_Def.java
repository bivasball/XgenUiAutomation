package com.xgen.automation.definations;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;

import com.xgen.automation.actions.CreatingConnectionAction;
import com.xgen.automation.actions.Creating_The_Model_Action;
import com.xgen.automation.base.CommonAction;

public class Creating_The_Model_Def extends CommonAction {
	Creating_The_Model_Action creating_The_Model_Action;
	
	public Creating_The_Model_Def(){
		creating_The_Model_Action = new Creating_The_Model_Action();
	}
	
	@Given("Navigate to Data Modeller")
	public void navigate_to_data_modeller() {
		creating_The_Model_Action.navigate_to_data_modeller();
	    
	}

	@Given("Click on plus MODEL icon to create a Data Table")
	public void click_on_plus_model_icon_to_create_a_data_table() {
	    
	}

	@Given("Click on View Radio button")
	public void click_on_view_radio_button() {
	    
	}

	@Given("Select PRODUCTS source node from the source node icon")
	public void select_products_source_node_from_the_source_node_icon() {
	    
	}

	@Given("Select appropriate columns from the source node for the PRODUCTS")
	public void select_appropriate_columns_from_the_source_node_for_the_products() {
	   
	}

	@Given("Select CATEGORIES lookup node from the lookup node icon")
	public void select_categories_lookup_node_from_the_lookup_node_icon() {
	   
	}

	@Given("Select appropriate columns from the lookup node for CATEGORIES")
	public void select_appropriate_columns_from_the_lookup_node_for_categories() {
	    
	}

	@Given("Select Join Node and join the source node and lookup node on it")
	public void select_join_node_and_join_the_source_node_and_lookup_node_on_it() {
	    
	}




}
