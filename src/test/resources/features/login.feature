Feature: Library App login feature
  User story:
  As a user, I should be able to login with correct credentials to different accounts. And
  dashboard should be displayed.
  Accounts are: librarian, student, admin

  Scenario: Log in as Librarian
    When user enters Librarian user name
    And user enters Librarian password
    Then user should see the dashboard

    Scenario: Log in as student
      When user enters student user name
      And user enters student user password
      Then user should see the dashboard



