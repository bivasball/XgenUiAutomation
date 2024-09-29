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
    When user click on Upload Files button
    Then verify a Pop up appears for the input values to enter
    And user enter source name "<SOURCE_NAME>" and enter Source Description "<SOURCE_DESCRIPTION>"
    And choose the file format to upload as "<FILE_FORMAT>"
    And user Click on Upload Files "<FILE_NAME>" on the File upload pop up
    Then verify the given file "<FILE_NAME>" is uploaded successfully

    Examples: 
      | SOURCE_NAME       | SOURCE_DESCRIPTION     | FILE_FORMAT | FILE_NAME             |
      | CATEGORY_FORECAST | Category Forecast Data | excel       | CategoryForecast.xlsx |
