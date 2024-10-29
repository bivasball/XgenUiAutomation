package com.xgen.automation.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;

public class Deleting_The_Model_Action extends CommonAction implements Creating_The_Model_Locator {
	
	
	public static Logger log;

	public Deleting_The_Model_Action() {
		log = LogManager.getLogger(Deleting_The_Model_Action.class);

	}

	
	public void verify_if_dim_products_data_model_is_present_or_not() {
		boolean sourcePresentorNot = verifySourceNameDisplayedInSYNCSourcesTabList("XIL_DIM_PRODUCTS");
		log.info("The query model is present-"+sourcePresentorNot);
		
	    
	}

	
	public void if_dim_products_data_model_is_present_then_click_on_delete_icon_from_actions_section() {
		deletetheconnectionifpresent("XIL_DIM_PRODUCTS");
		
	}

	
	public void verify_dim_products_data_model_is_deleted_successfully() {
	    
	}


	
	
	public boolean verifySourceNameDisplayedInSYNCSourcesTabList(String sourceName) {
		boolean flag = false;
		int numberOfRowsDisplayed = driver
				.findElements(By.xpath("//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div")).size();
		log.info("ROWS :- " + numberOfRowsDisplayed);
		for (int row = 1; row <= numberOfRowsDisplayed; row++) {
			String sourceNamefromUI = driver.findElement(By.xpath(
					"//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div[" + row + "]/div[2]//p"))
					.getText();
			log.info("Source List diplayed in UI are :- " + sourceNamefromUI);
			if (sourceNamefromUI.equalsIgnoreCase(sourceName)) {
				log.info("The Model is present - This is true");
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public void deletetheconnectionifpresent(String sourceName) {
		boolean sourcePresentorNot = verifySourceNameDisplayedInSYNCSourcesTabList(sourceName);

		if (sourcePresentorNot == true) {
			loadingWebPage();
			deleteSourceFromSyncSourcesTabList(sourceName);
			loadingWebPage();
			driver.findElement(popupDeleteButton).click();
			loadingWebPage();
		} else {
			//System.out.println("The Model name is not present in the UI");
			log.info("The Model name is not present in the UI");
		}

		loadingWebPage();

		click(popupCancelButton);
		loadingWebPage();

	}
	
	public void deleteSourceFromSyncSourcesTabList(String sourceName) {

		driver.findElement(By.xpath("//p[text()='Refresh']")).click();
		loadingWebPage();
		//div//p[text()='XIL_DIM_PRODUCTS']/parent::div/parent::div/following-sibling::div[4]//span[@aria-label='Delete Model']/button
		By sourceToDelete = By.xpath(
				"//div//p[text()='"+sourceName+"']/parent::div/parent::div/following-sibling::div[4]//span[@aria-label='Delete Model']/button");

		

		hoverOverWebelementByAction(driver.findElement(sourceToDelete));
		loadingWebPage();
		click(sourceToDelete);
		//System.out.println("The delete icon ****************** is clicked.");
		log.info("The delete icon ****************** is clicked.");
		loadingWebPage();
	}
	
	

}