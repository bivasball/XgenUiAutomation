@Story002
Feature: Create PG DB source

  @Testcase_0022 @Both
  Scenario Outline: Create DB source and save
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user Click on Connect Icon
    Then verify Sources page or tab is present
    When user click on Add button
    Then verify several DB Sources are present
    When user click on PostgreSQL
    Then verify a pop up appears with various input fields
    And the user enter the source name "<Source_name>" and source description "<Source_decription>"
    And the user enter Host, port, Db name, schema, username, password
    When the user click on Validate button
    Then verify a success pop appears
    When the user click on Create button
    Then verify a success message
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed

    Examples: 
      | Source_name | Source_decription       |
      | PG_SALES_DB | pg sales db for testing |

  @Testcase_0033 @Both
  Scenario Outline: Create DB source and delete the created one.
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user Click on Connect Icon
    Then verify Sources page or tab is present
    When the user Click on delete button of "<Source_name>" from the displayed list
    Then verify that it will ask for confirmation pop up
    When the user click on delete button of the pop up
    Then verify the db "PG_SALES_DB" is deleted from the list of Sources tab
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed

    Examples: 
      | Source_name | Source_decription       |
      | PG_SALES_DB | pg sales db for testing |
