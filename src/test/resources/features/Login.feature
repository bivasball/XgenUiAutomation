@Story001
Feature: Getting Started

  @TC_001 @Testcase_01.1 @Regression
  Scenario: The login functionality of xGENBI user interface
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"

  @TC_002  @Testcase_01.2 @Regression
  Scenario: The Logout functionality of xGENBI user interface
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed
