@Story004
Feature: Deleting the Connections for PG_SALES_DATA

	@DeleteConnectionPgSalesData
  Scenario Outline: Deleting the Connections for PG_SALES_DATA from the Sync Page
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    Given user navigate to Data Sync by clicking on Sync Icon
    Then verify that the current url is "http://xgendemo.uxli.com/connection"
    And verify if "<SELECT_SOURCE>" is present or not 
    And if "<SELECT_SOURCE>" is present the click on Delete icon from Actions section
    Then verify "<SELECT_SOURCE>" is Deleted successfully

    Examples: 
      | CONNECTION_NAME | DESCRIPTION | SELECT_SOURCE | SELECT_DESTINATION     |
      | PG_SALES_DATA   | Sales Data  | Pg sales db   | DW for Test Automation |
