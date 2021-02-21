@AllScenarios @LoginFeature
Feature: feature to test login functionality

  @third
  Scenario: First test
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page


  @second
  Scenario: Second test
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
