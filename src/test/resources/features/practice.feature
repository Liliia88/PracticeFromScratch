Feature: login functionality

  @sprint
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    When user click on creat new account button
    And user enters credentials to register
    And user clicks on login button
    Then user is successfully logged
