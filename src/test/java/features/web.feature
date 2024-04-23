Feature: Test Automation Web

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user is on login page
    And user see error massage