@Regression @login
Feature: Library App login feature
  User story:
  As a user, I should be able to login with correct credentials to different accounts. And
  dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: Fir the scenarios in the feature file user is expected to be on login page
    Given user is on the library login pag

  @Librarian
  Scenario: Login as Librarian
    When user enters Librarian user name
    And user enters Librarian password
    Then user should see the dashboard

  @Student
  Scenario: Login as student
    When user enters student user name
    And user enters student user password
    Then user should see the dashboard

  @Admin
  Scenario: Login as admin
    When user enters admin user name
    And user enters admin password
    Then user should see the dashboard



