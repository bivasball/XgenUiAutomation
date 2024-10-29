package com.xgen.automation.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;

import io.cucumber.java.en.Given;

public class Creating_The_Govern_PRODID_UNIQ_VAL_Action extends CommonAction implements Creating_The_Model_Locator {

	public static Logger log;

	public Creating_The_Govern_PRODID_UNIQ_VAL_Action() {
		log = LogManager.getLogger(Creating_The_Govern_PRODID_UNIQ_VAL_Action.class);

	}

	public void navigate_to_govern_page() {
		
		By governIcon = By.xpath("//span[text()='Govern']");
		click(governIcon);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		sleep(1000);
	    
	}

	public void click_on_models_under_data_assets_and_select_xil_dim_products() {
		
		
		By modelsOfDataAssets = By.xpath("//span[text()='Models']");
		click(modelsOfDataAssets);
		loadingWebPage();
		
	    
	}

	public void click_on_data_quality_tab_and_click_on_plus_add_button() {
		
		
		
		By xil_Dim_products_link = By.xpath("//a[text()='XIL_DIM_PRODUCTS']");
		click(xil_Dim_products_link);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		
		//button[text()='Data Quality']
		By data_quality_button = By.xpath("//button[text()='Data Quality']");
		click(data_quality_button);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		
		
		By add_plus_icon = By.xpath("//p[text()='Add']");
		click(add_plus_icon);
		loadingWebPage();
		
		
	    
	}

	
	public void enter_the_input_to_name_description_and_select_major_button() {
		
		
		By input_Name = By.xpath("//label[text()='Name']/parent::div//input");
		enterText(input_Name,"PRODID_UNIQ_VAL");
		
		
		By input_Description = By.xpath("//label[text()='Description']/parent::div//input");
		enterText(input_Description,"Creating a Data quality Rule");
		
		
		By button_major = By.xpath("//button[@value='major']");
		click(button_major);
		
		
	}
	
	
	
	
	
	
	public void select_column_level_from_the_pop_up_and_select_product_id_field() {
		
		By column_level_button = By.xpath("//button[text()='column']");
		click(column_level_button);
		loadingWebPage();
	  
		
		
		By fields_dropdown = By.xpath("//button[@title='Open']");
		click(fields_dropdown);		
		
		By Action_ProductID = By.xpath("//*[text()='ProductID']");
		click(Action_ProductID);
		
		loadingWebPage();
		
		
		
	}

	public void select_completeness_as_rule_category() {
		
		By fields_rule_category_dropdown = By.xpath("//label[text()='Rule Category']/parent::div//button[@title='Open']");		
		
		click(fields_rule_category_dropdown);
		
		By select_RuleCategory_completeness = By.xpath("//*[text()='completeness']");
		click(select_RuleCategory_completeness);
		
		loadingWebPage();
		
		
	}

	public void select_verify_unique_values_in_column() {
		
		
		By fields_rule_Name_dropdown = By.xpath("//label[text()='Rule Name']/parent::div//button[@title='Open']");			
		click(fields_rule_Name_dropdown);		
		
		
		By select_RuleName_Unique= By.xpath("//*[text()='Verify Unique Values in Column']");				
		click(select_RuleName_Unique);
		
		loadingWebPage();
		
		
		
	}

	public void click_on_apply_and_click_on_save_and_run_the_data_quality_check() {
		
		
		
		By button_Apply = By.xpath("//p[text()='Apply']/ancestor::button");		
		
		click(button_Apply);		
		
		loadingWebPage();
		loadingWebPage();
		
		By button_Save = By.xpath("//p[text()='Save']/ancestor::button");	
		
		click(button_Save);
		waitTillalertToastifyDisappears();	
		
		
		By button_Run = By.xpath("//p[text()='Run']/ancestor::button");		
		
		click(button_Run);	
		waitTillalertToastifyDisappears();	
		
		
		
	}
	

}