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
    And Navigate to Govern Page
    And Click on Models under Data Assets and Select XIL_DIM_PRODUCTS
    And Click on Data Quality tab and Click on Plus Add button
    And Enter the input to Name, Description and Select Major Button
    And Select Column level from the Pop up and Select ProductID field
    And Select Completeness as Rule Category
    And Select Verify Unique Values in Column
    And Click on Apply and Click on Save and Run the Data Quality check
