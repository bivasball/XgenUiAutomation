package com.xgen.automation.definations;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;

import com.xgen.automation.actions.CreatingConnectionAction;
import com.xgen.automation.actions.Creating_The_Govern_PRODID_UNIQ_VAL_Action;
import com.xgen.automation.actions.Creating_The_Model_Action;
import com.xgen.automation.actions.Creating_The_Model_DIM_PRODUCTS_Action;
import com.xgen.automation.base.CommonAction;

public class Creating_The_Govern_Def extends CommonAction {
	Creating_The_Govern_PRODID_UNIQ_VAL_Action creatGovAction;

	public Creating_The_Govern_Def() {
		creatGovAction = new Creating_The_Govern_PRODID_UNIQ_VAL_Action();
	}

	
	@Given("Navigate to Govern Page")
	public void navigate_to_govern_page() {
		creatGovAction.navigate_to_govern_page();
	    
	}

	@Given("Click on Models under Data Assets and Select XIL_DIM_PRODUCTS")
	public void click_on_models_under_data_assets_and_select_xil_dim_products() {
		creatGovAction.click_on_models_under_data_assets_and_select_xil_dim_products();
	}

	@Given("Click on Data Quality tab and Click on Plus Add button")
	public void click_on_data_quality_tab_and_click_on_plus_add_button() {
		creatGovAction.click_on_data_quality_tab_and_click_on_plus_add_button();
	}

	@Given("Select Column level from the Pop up and Select ProductID field")
	public void select_column_level_from_the_pop_up_and_select_product_id_field() {
		creatGovAction.select_column_level_from_the_pop_up_and_select_product_id_field();
	}

	@Given("Select Completeness as Rule Category")
	public void select_completeness_as_rule_category() {
		creatGovAction.select_completeness_as_rule_category();
	}

	@Given("Select Verify Unique Values in Column")
	public void select_verify_unique_values_in_column() {
		creatGovAction.select_verify_unique_values_in_column();
	}

	@Given("Click on Apply and Click on Save and Run the Data Quality check")
	public void click_on_apply_and_click_on_save_and_run_the_data_quality_check() {
		creatGovAction.select_verify_unique_values_in_column();
	}



	
	
	
}