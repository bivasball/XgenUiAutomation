@Story003
Feature: Uploading files

  @Testcase_3.1 @Regression
  Scenario Outline: To Upload CATEGORY_FORECAST xlsx file
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user Click on Connect Icon
    Then verify Sources page or tab is present
    When user click on Upload Files button
    Then verify a Pop up appears for the input values to enter
    And user enter source name "<SOURCE_NAME>" and enter Source Description "<SOURCE_DESCRIPTION>"
    And choose the file format to upload as "<FILE_FORMAT>"
    And user Click on Upload Files "<FILE_NAME>" on the File upload pop up
    Then verify the given file "<FILE_NAME>" is uploaded successfully

    Examples: 
      | SOURCE_NAME       | SOURCE_DESCRIPTION     | FILE_FORMAT | FILE_NAME             |
      | CATEGORY_FORECAST | Category Forecast Data | excel       | CategoryForecast.xlsx |

  @Testcase_3.2 @Regression
  Scenario Outline: To Delete the  CATEGORY_FORECAST xlsx file
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
    Then verify the db "<Source_name>" is deleted from the list of Sources tab
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed

    Examples: 
      | Source_name       |
      | CATEGORY_FORECAST |

  @Testcase_3.3 @Regression
  Scenario Outline: To Upload SURVEY xlsx file
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user Click on Connect Icon
    Then verify Sources page or tab is present
    When user click on Upload Files button
    Then verify a Pop up appears for the input values to enter
    And user enter source name "<SOURCE_NAME>" and enter Source Description "<SOURCE_DESCRIPTION>"
    And choose the file format to upload as "<FILE_FORMAT>"
    And user Click on Upload Files "<FILE_NAME>" on the File upload pop up
    Then verify the given file "<FILE_NAME>" is uploaded successfully

    Examples: 
      | SOURCE_NAME | SOURCE_DESCRIPTION | FILE_FORMAT | FILE_NAME           |
      | SURVEY      | Survey Data        | excel       | Company Survey.xlsx |

  @Testcase_3.4 @Regression
  Scenario Outline: To Delete the  SURVEY xlsx file
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
    Then verify the db "<Source_name>" is deleted from the list of Sources tab
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed

    Examples: 
      | Source_name |
      | SURVEY      |

  @Testcase_3.5 @Regression
  Scenario Outline: To Upload COMPANY csv file
    When the user navigate to "http://xgendemo.uxli.com" url
    Then verify the user should be able to enter username and password
    When the user click on Login button
    Then verify the login should be successful and Select Subscription dropdown should be available
    When the user select a subscription "TEST AUTOMATE" from the dropdown
    Then verify the user land to Welcome page "Welcome, Automation!"
    When the user Click on Connect Icon
    Then verify Sources page or tab is present
    When user click on Upload Files button
    Then verify a Pop up appears for the input values to enter
    And user enter source name "<SOURCE_NAME>" and enter Source Description "<SOURCE_DESCRIPTION>"
    And choose the file format to upload as "<FILE_FORMAT>"
    And user Click on Upload Files "<FILE_NAME>" on the File upload pop up
    Then verify the given file "<FILE_NAME>" is uploaded successfully

    Examples: 
      | SOURCE_NAME | SOURCE_DESCRIPTION | FILE_FORMAT | FILE_NAME        |
      | COMPANY     | Company Data       | csv         | company_data.csv |

  @Testcase_3.6 @Regression
  Scenario Outline: To Delete the  COMPANY csv file
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
    Then verify the db "<Source_name>" is deleted from the list of Sources tab
    When the user click on Logout Button
    Then verify the user successfully logout
    And Login page is displayed

    Examples: 
      | Source_name |
      | COMPANY     |
