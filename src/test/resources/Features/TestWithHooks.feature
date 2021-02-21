@HookScenarios
Feature: feature to test hooks functionality

  @forbefore
  Scenario: Positive scenario
    Given user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results

  Scenario: Negative scenario
    Given user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
    And number of search result is "200"
