package com.xgen.automation.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;

public class Creating_The_Govern_PRODID_UNIQ_VAL_Action extends CommonAction implements Creating_The_Model_Locator {

	public static Logger log;

	public Creating_The_Govern_PRODID_UNIQ_VAL_Action() {
		log = LogManager.getLogger(Creating_The_Govern_PRODID_UNIQ_VAL_Action.class);

	}

	public void navigate_to_govern_page() {
		
		By governIcon = By.xpath("//span[text()='Govern']");
		log.info("Clicking on Govern Icon");
		click(governIcon);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		sleep(1000);
	    
	}

	public void click_on_models_under_data_assets_and_select_xil_dim_products() {
		
		
		By modelsOfDataAssets = By.xpath("//span[text()='Models']");
		log.info("Click on Models");
		click(modelsOfDataAssets);
		loadingWebPage();
		
		By xil_Dim_products_link = By.xpath("//a[text()='XIL_DIM_PRODUCTS']");
		log.info("Click on XIL_DIM_PRODUCTS");
		click(xil_Dim_products_link);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		
	    
	}

	public void click_on_data_quality_tab_and_click_on_plus_add_button() {		
		
		
		By data_quality_button = By.xpath("//button[text()='Data Quality']");
		log.info("Click on Data Quality");
		click(data_quality_button);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		
		
		By add_plus_icon = By.xpath("//p[text()='Add']");
		log.info("Click on Add icon");
		click(add_plus_icon);
		loadingWebPage();
		
		
	    
	}

	
	public void enter_the_input_to_name_description_and_select_major_button() {
		
		
		By input_Name = By.xpath("//label[text()='Name']/parent::div//input");
		log.info("Enter the text to input Name");
		enterText(input_Name,"PRODID_UNIQ_VAL");
		
		
		By input_Description = By.xpath("//label[text()='Description']/parent::div//input");
		log.info("Enter the text to input Description");
		enterText(input_Description,"Creating a Data quality Rule");
		
		
		By button_major = By.xpath("//button[@value='major']");
		log.info("Click on button Major");
		click(button_major);
		
		
	}
	
public void enter_the_input_to_name_description_and_select_major_button(String inputName,String inputDesc) {
		
		
		By input_Name = By.xpath("//label[text()='Name']/parent::div//input");
		log.info("Enter the text to input Name");
		enterText(input_Name,inputName);
		
		
		By input_Description = By.xpath("//label[text()='Description']/parent::div//input");
		log.info("Enter the text to input Description");
		enterText(input_Description,inputDesc);
		
		
		By button_major = By.xpath("//button[@value='major']");
		log.info("Click on button Major");
		click(button_major);
		
		
	}
	
	
	
	
	public void select_column_level_from_the_pop_up_and_select_product_id_field() {
		
		By column_level_button = By.xpath("//button[text()='column']");
		log.info("Click on Column label button");
		click(column_level_button);
		loadingWebPage();
	  
		
		
		By fields_dropdown = By.xpath("//button[@title='Open']");
		log.info("Click on Fields dropdown");
		click(fields_dropdown);		
		
		By Action_ProductID = By.xpath("//*[text()='ProductID']");
		log.info("Click on ProductID");
		click(Action_ProductID);
		
		loadingWebPage();
		
		
		
	}

	public void select_completeness_as_rule_category() {
		
		By fields_rule_category_dropdown = By.xpath("//label[text()='Rule Category']/parent::div//button[@title='Open']");		
		log.info("Click on Field dropdown");
		
		click(fields_rule_category_dropdown);
		
		By select_RuleCategory_completeness = By.xpath("//*[text()='completeness']");
		log.info("Click on Rule Category Completeness");
		click(select_RuleCategory_completeness);
		
		loadingWebPage();
		
		
	}

	public void select_verify_unique_values_in_column() {
		
		
		By fields_rule_Name_dropdown = By.xpath("//label[text()='Rule Name']/parent::div//button[@title='Open']");		
		log.info("Click on Fields rule name dropdown");
		click(fields_rule_Name_dropdown);		
		
		
		By select_RuleName_Unique= By.xpath("//*[text()='Verify Unique Values in Column']");	
		log.info("Select Rule Name Unique");
		click(select_RuleName_Unique);
		
		loadingWebPage();
		By popup_label= By.xpath("//p[text()='DQ Rules for:']");		
		log.info("Click on Pop Up label");
		click(popup_label);
		loadingWebPage();
		
		//System.out.println(driver.findElement(By.xpath("/html/body")).getText());		
		
	}

	public void click_on_apply_and_click_on_save_and_run_the_data_quality_check() {
		
		
		
		By button_Apply = By.xpath("//p[text()='Apply']/ancestor::button");	
		log.info("Click on Button Apply");
		
		click(button_Apply);			
		
		
		loadingWebPage();
		loadingWebPage();
		
		By button_Save = By.xpath("//p[text()='Save']/ancestor::button");	
		log.info("Click on Button save");
		
		click(button_Save);
		
		explicitWait(PopUpofGovernMessage,5,"VISIBILITY");
		log.info("The pop up or the Alert message is************************* :"+getElementText(PopUpofGovernMessage));
		String expectedText = "DQ Rule saved successfully";
		String actualPopupText = getElementText(PopUpofGovernMessage);
		Assert.assertEquals(actualPopupText,expectedText,"The Alert is not matched with the expected.");
		
		waitTillalertToastifyDisappears();	
		
		
		By button_Run = By.xpath("//p[text()='Run']/ancestor::button");		
		log.info("Click on Run button");
		
		click(button_Run);	
		log.info("Wait till Toastify live icon disappears");
		waitTillalertToastifyDisappears();	
		sleep(5000  );
		
		
		
		
	}
	

	
	public void click_on_data_quality_tab_and_verify_that_is_present_or_not(String inputName) {
		
		By data_quality_button = By.xpath("//button[text()='Data Quality']");
		log.info("Click on Data Quality");
		click(data_quality_button);
		loadingWebPage();
		loadingWebPage();
		loadingWebPage();
		//verifyIfTheGivenNameIsPresentInTheList(inputName);
		log.info("The required input is present which is :"+verifyIfTheGivenNameIsPresentInTheList(inputName));
		
	    
	}

	
	public void verify_that_is_deleted_successfully(String inputName) {
		
		//----------------------Delete Rule ---------------//
		By button_delete_rule = By.xpath("//span[text()='PRODID_UNIQ_VAL']/parent::div/following-sibling::div[7]//span[@aria-label='Delete Rule']/button");
		boolean isexist = verifyIfTheGivenNameIsPresentInTheList(inputName);		
		if(isexist==true) {
			log.info("If the input is present then click on Delete button");
			click(button_delete_rule);
		}
	    
		
		By button_Save = By.xpath("//p[text()='Save']/ancestor::button");	
		log.info("Click on Button save");
		
		click(button_Save);
		
		explicitWait(PopUpofGovernMessage,5,"VISIBILITY");
		log.info("The pop up or the Alert message is************************* :"+getElementText(PopUpofGovernMessage));
		String expectedText = "DQ Rule saved successfully";
		String actualPopupText = getElementText(PopUpofGovernMessage);
		Assert.assertEquals(actualPopupText,expectedText,"The Alert is not matched with the expected.");
		
		waitTillalertToastifyDisappears();	
		
		
		
	}
	
	
	public boolean verifyIfTheGivenNameIsPresentInTheList(String sourceName) {
		boolean flag = false;
		int numberOfRowsDisplayed = driver
				.findElements(By.xpath("//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div[1]/div[2]/span"))
				.size();
		System.out.println("ROWS :- " + numberOfRowsDisplayed);
		for (int row = 1; row <= numberOfRowsDisplayed; row++) {
			String sourceNamefromUI = driver.findElement(By.xpath(
					"//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div["+row+"]/div[2]/span"))
					.getText();
			System.out.println("source name from ui :- " + sourceNamefromUI);
			if (sourceNamefromUI.equalsIgnoreCase(sourceName)) {
				System.out.println("This is true");
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}
	
	
}