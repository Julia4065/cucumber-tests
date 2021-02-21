Feature: Feature to test google search functionality

  @first
  Scenario: Validate google search is working
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
