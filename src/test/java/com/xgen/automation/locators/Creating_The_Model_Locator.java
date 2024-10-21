package com.xgen.automation.locators;

import org.openqa.selenium.By;

public interface Creating_The_Model_Locator {
	By xx = By.xpath("");
	
	By radiobuttonView = By.xpath("//span[text()='View']/parent::label/span/input");
	By inputModelName = By.xpath("//input[@id='modelName']");
	By inputModelDescrip = By.xpath("//input[@id='modelDesc']");
	By modelSchemaDropdown = By.xpath("//div[@id='select-schema-label']");
	By selectEDW = By.xpath("//p[text()='edw']");
	
	
	
	By buttonSourceNode = By.xpath("//span[@aria-label='Source Node']/button");
	By sourceObject = By.xpath("//div[text()='TESTAUTOMATE']");
	By source_Products = By.xpath("//p[text()='PRODUCTS']");
	
	By buttonJoinNode = By.xpath("//span[@aria-label='Join Node']/button");
	By join_1_leftSideNode = By.xpath("//div[@data-id='JON_2-JON-target']");
	By join_1_RightSideNode = By.xpath("//div[@data-id='JON_2-JON-source']");
	
	By productNode = By.xpath("//div[@data-nodeid='SRN_1']");
	
	By openArea = By.xpath("//div[@class='react-flow__viewport react-flow__container']");
	By productLabel = By.xpath("//span[text()='S_PRODUCTS']/parent::div[contains(@class,'MuiBox-root')]");
	By source_Categories = By.xpath("//p[text()='CATEGORIES']");
	By categoriesNode = By.xpath("//div[@data-nodeid='SRN_3']");
	
	By categoriesLabel = By.xpath("//span[text()='S_CATEGORIES']/parent::div[contains(@class,'MuiBox-root')]");
	
	By ModelNameNode = By.xpath("//div[@data-nodeid='SEN_NODE']");
	By label_join_1 = By.xpath("//p[text()='JOIN_1']");
	
	By button_Join_1_join_tab = By.xpath("//button[text()='Join']");
	By button_Join_1_join_tab_editJoin = By.xpath("//button[text()='Edit Join']");
	By button_left_outer_join = By.xpath("//button[@value='LEFT OUTER JOIN']");
	By icon_add = By.xpath("//div[contains(@class,'MuiBox-root css-z6iby2')]//button");
	By input_s_categories = By.xpath("//div[contains(@class,'css-1a1stbe')]/div[1]//input");
	By input_s_products = By.xpath("//div[contains(@class,'css-1a1stbe')]/div[3]//input");
	
	By button_apply = By.xpath("//p[text()='Apply']/parent::button");
	By button_create = By.xpath("//p[text()='Create']");
	
	By button_save_icon = By.xpath("//ul[@role='menu']/li[1]");
	
}
