Feature: Wikipedia search functionality and verifications

  #WSF-45234
  Scenario: Wikipedia search functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia search functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then user sees Steve Jobs in the main header