package com.xgen.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.DeletingtheConnectionsLocator;

public class DeletingConnectionAction extends CommonAction implements DeletingtheConnectionsLocator {

	public boolean verifySourceNameDisplayedInSYNCSourcesTabList(String sourceName) {
		boolean flag = false;
		int numberOfRowsDisplayed = driver
				.findElements(By.xpath("//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div")).size();
		System.out.println("ROWS :- " + numberOfRowsDisplayed);
		for (int row = 1; row <= numberOfRowsDisplayed; row++) {
			String sourceNamefromUI = driver.findElement(By.xpath(
					"//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone')]/div[" + row + "]/div[5]//p"))
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

	public void deletetheconnectionifpresent(String sourceName) {
		boolean sourcePresentorNot = verifySourceNameDisplayedInSYNCSourcesTabList(sourceName);

		if (sourcePresentorNot == true) {
			loadingWebPage();
			deleteSourceFromSyncSourcesTabList(sourceName);
			loadingWebPage();
			driver.findElement(popupDeleteButton).click();
			loadingWebPage();
		} else {
			System.out.println("The source name is not present in the UI");
		}

		loadingWebPage();

		click(popupCancelButton);
		loadingWebPage();

	}

	public void deleteSourceFromSyncSourcesTabList(String sourceName) {

		driver.findElement(By.xpath("//p[text()='Refresh']")).click();
		loadingWebPage();
		/*
		 * By sourceToDelete = By.xpath(
		 * "//div//p[text()='Pg sales db']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Delete Connection']/button"
		 * );
		 */
		By sourceToDelete = By.xpath(
				"//div//p[text()='"+sourceName+"']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Delete Connection']/button");

		/*
		 * WebElement sourceDeleteicon = driver.findElement(By.xpath(
		 * "//div//p[text()='Pg sales db']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Delete Connection']/button"
		 * ));
		 */
		WebElement sourceDeleteicon = driver.findElement(By.xpath(
				"//div//p[text()='"+sourceName+"']/parent::div/parent::div/following-sibling::div[3]//span[@aria-label='Delete Connection']/button"));


		hoverOverWebelementByAction(sourceDeleteicon);
		loadingWebPage();
		click(sourceToDelete);
		System.out.println("The delete icon ****************** is clicked.");
		loadingWebPage();
	}

	public void if_is_present_the_click_on_delete_icon_from_actions_section(String sourceName) {
		deletetheconnectionifpresent(sourceName);
	}

	public void verify_is_deleted_successfully(String sourceName) {
		boolean sourcePresentorNot = verifySourceNameDisplayedInSYNCSourcesTabList(sourceName);
		System.out.println("Is The Source Name present ? Answer:"+sourcePresentorNot);
		Assert.assertFalse(sourcePresentorNot);
		
	}

}