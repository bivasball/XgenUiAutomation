@Story004
Feature: Creating the Model

  @TC_1000
  Scenario: To Create the Model
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    And Navigate to Data Modeller
    And Click on plus MODEL icon to create a Data Table
    And Click on View Radio button
    And Select PRODUCTS source node from the source node icon
    And Select appropriate columns from the source node for the PRODUCTS
    And Select CATEGORIES lookup node from the lookup node icon
    And Select appropriate columns from the lookup node for CATEGORIES
    And Select Join Node and join the source node and lookup node on it

  @TC_1001
  Scenario: To Create the DIM_PRODUCTS data model
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    And Navigate to Data Modeller
    And Click on plus MODEL icon to create a Data Table
    And Click on View Radio button to select the view
    
    And Enter the input DIM PRODUCTS to Model Name
    And Enter the input Dim products to Model Desc
    And Select edw from the drop down Model Schema
    
    And Click on Source Node and Choose PRODUCTS
		And Click on Join Node and Map PRODUCTS to Join Node JOIN1
		And Click on PRODUCTS Node and choose the Check box of Columns tab 
		
		And Click on Source Node and Choose CATEGORIES
		And Click on Join Node and Map CATEGORIES to Join Node JOIN1
		And Click on CATEGORIES Node and choose the Check box of Columns tab
		
		And Click on JOIN1 Node and Map JOIN1 to DIM PRODUCTS Node
		And Click on JOIN1 Node and choose the Check box of Columns tab
		
		And Click on Join tab on JOIN1
		And Click on Edit join of JOIN1
		And Click on Join Type LEFT OUTER JOIN and click on plus icon Add 
		And Create a left outer join with s_products.CATEGORYID = l_categories.CATEGORYID
		And Click Apply button 
		And Create Button and Select Save the DIM PRODUCTS model
    
