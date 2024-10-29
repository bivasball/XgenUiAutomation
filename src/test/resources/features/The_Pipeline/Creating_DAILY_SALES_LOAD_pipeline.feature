@Story005
Feature: Creating DAILY_SALES_LOAD pipeline

  @TC_5000
  Scenario: To Create the DAILY_SALES_LOAD pipeline
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
   
   	And Click on Pipeline icon to navigate to Pipeline section
    And Click on Add Button
    And Enter the input xx to Pipe Name
    And Enter the input xx to Pipe Description
    And Enter the input xx to Run With User Id
    