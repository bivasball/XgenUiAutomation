#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
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
      | PG_SALES_DATA   | Sales Data  | PG_SALES_DB   | DW for Test Automation |