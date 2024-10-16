package com.xgen.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.xgen.automation.base.CommonAction;
import com.xgen.automation.locators.Creating_The_Model_Locator;
import com.xgen.automation.locators.CreatingtheConnectionsLocator;

import io.cucumber.java.en.Given;

public class Creating_The_Model_Action extends CommonAction implements Creating_The_Model_Locator {

	
public void navigate_to_data_modeller() {
	By modelIcon = By.xpath("//span[text()='Model']");	
	click(modelIcon);
	loadingWebPage();	
	
	By plusiconAddButton = By.xpath("//p[text()='Add']/parent::a");
	click(plusiconAddButton);
	loadingWebPage();
	loadingWebPage();
	loadingWebPage();
	loadingWebPage();
	
	By radiobuttonView = By.xpath("//span[text()='View']/parent::label/span/input");	
	click(radiobuttonView);
	loadingWebPage();
	
	By inputModelName = By.xpath("//input[@id='modelName']");
	click(inputModelName);
	enterText(inputModelName,"DIM_PRODUCTS");
	
	
	By inputModelDescrip = By.xpath("//input[@id='modelDesc']");
	click(inputModelDescrip);
	enterText(inputModelDescrip,"DIM_PRODUCTS");
	
	By modelSchemaDropdown = By.xpath("//div[@id='select-schema-label']");
	click(modelSchemaDropdown);
	
	By selectEDW = By.xpath("//p[text()='edw']");
	click(selectEDW);
	
	//-------------------------------//
	By buttonSourceNode = By.xpath("//span[@aria-label='Source Node']/button");
	click(buttonSourceNode);
	loadingWebPage();		
	
	
	By sourceObject = By.xpath("//div[text()='TESTAUTOMATE']");
	click(sourceObject);
	
	By source_Products = By.xpath("//p[text()='PRODUCTS']");
	click(source_Products);
	loadingWebPage();	
	sleep(5000);
	
	By buttonJoinNode = By.xpath("//span[@aria-label='Join Node']/button");
	click(buttonJoinNode);
	loadingWebPage();		
	sleep(3000);
	
	By productNode = By.xpath("//div[@data-nodeid='SRN_1']");
	
	By join_1_leftSideNode = By.xpath("//div[@data-id='JON_2-JON-target']");
	By join_1_RightSideNode = By.xpath("//div[@data-id='JON_2-JON-source']");
	
	
	
			//Actions class method to drag and drop		
			//Actions builder = new Actions(driver);
			//Perform drag and drop
			//builder.dragAndDrop(driver.findElement(productNode), driver.findElement(joinleftSideNode)).perform();
	
			dragAndDropFromSourceToDestination(productNode,join_1_leftSideNode);
			
			
			sleep(3000);
			
			//-----------------------------for categories ----------------//
			click(buttonSourceNode);
			loadingWebPage();
			
			click(sourceObject);
			loadingWebPage();
			
			By source_Categories = By.xpath("//p[text()='CATEGORIES']");
			click(source_Products);
			loadingWebPage();	
			sleep(5000);
			By categoriesNode = By.xpath("//div[@data-nodeid='SRN_3']");
			
			dragAndDropFromSourceToDestination(categoriesNode,join_1_leftSideNode);
			
			sleep(5000);	
			//------------------join -----JOIN_1 to ModelName ---------
			
			
			By ModelNameNode = By.xpath("//div[@data-nodeid='SEN_NODE']");
			dragAndDropFromSourceToDestination(join_1_RightSideNode,ModelNameNode);
			
			sleep(5000);
			
	    
	}		
		
}