@Story004
Feature: Creating the Connections

  Scenario Outline: Creating the Connections for PG_SALES_DATA
  	When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
  
    Given user navigate to Data Sync by clicking on Sync Icon
    Then verify that the current url is "http://xgendemo.uxli.com/connection"
    When user click on Add icon button
    Then verify that ther current url is "http://xgendemo.uxli.com/connection/details"
    And the user enter input values "<CONNECTION_NAME>" to Connection Name input box
    And the user enter input values "<DESCRIPTION>" to Description input box
    And the user Select "<SELECT_SOURCE>" from the Select Source Dropdown
    And the user Select "<SELECT_DESTINATION>" from the Select Destination Dropdown
    Then verify a web table with the following Headers are displayed
      | Fields               |
      | Entity               |
      | Sync Mode (Src/Dest) |
      | Cursor Field         |
      | Primary Key          |
      | Target Schema        |
    And the user Select MuiSwitch checkbox for Entity Value "categories" and Sync Mode "Full Fresh/Overwrite" from the Dropdown and Primary Key "" from the Dropdown
    When the user Click on Create icon button
    Then verify the Connection for "<CONNECTION_NAME>" is created successfully

    Examples: 
      | CONNECTION_NAME | DESCRIPTION | SELECT_SOURCE | SELECT_DESTINATION     |
      | PG_SALES_DATA   | Sales Data  | Pg sales db   | DW for Test Automation |
