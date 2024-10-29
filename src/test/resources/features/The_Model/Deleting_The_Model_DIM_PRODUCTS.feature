@Story004
Feature: Deleting the Model

 
  @TC_1002
  Scenario: To Delete the DIM_PRODUCTS data model
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    And Navigate to Data Modeller
    
    And verify if DIM_PRODUCTS data model is present or not
    And if DIM_PRODUCTS data model is present then click on Delete icon from Actions section
    Then verify DIM_PRODUCTS data model is Deleted successfully
    
