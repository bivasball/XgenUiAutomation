@Story006
Feature: The Govern page and its functionality

  @TC_6000
  Scenario: To Create PRODID_UNIQ_VAL Data Quality rule
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    
    And Navigate to Govern Page
    And Click on Models under Data Assets and Select XIL_DIM_PRODUCTS
    And Click on Data Quality tab and Click on Plus Add button
    And Enter the input to Name, Description and Select Major Button
    And Select Column level from the Pop up and Select ProductID field
    
    And Select Completeness as Rule Category
    And Select Verify Unique Values in Column
    And Click on Apply and Click on Save and Run the Data Quality check
    

  

  
