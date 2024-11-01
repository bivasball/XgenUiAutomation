@Story004
Feature: Creating the Connections for CATEGORY_FORECAST

  @TC_013 @CreateConnectionCategoryForecastData
  Scenario Outline: Creating the Connections for CATEGORY_FORECAST, Sync Data flow and verification from Job logs
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
    And the user Select MuiSwitch checkbox for Entity Value "CATEGORY_FORECAST"
    And Sync Mode "Full Fresh/Overwrite" from the Dropdown and Select Primary Key from the Dropdown
    When the user Click on Create icon button
    Then verify the Connection for "<CONNECTION_NAME>" is created successfully
    And Click on Sync Data flow button from the Action section for "<SELECT_SOURCE>"
    Then verify from the Job Logs button that the Sync is succeeded

    Examples: 
      | CONNECTION_NAME  | DESCRIPTION       | SELECT_SOURCE          | SELECT_DESTINATION     |
      | CATEGORY_FORECAS | Category Forecast | Category Forecast Data | DW for Test Automation |
