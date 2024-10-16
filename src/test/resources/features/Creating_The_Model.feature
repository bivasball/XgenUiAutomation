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
