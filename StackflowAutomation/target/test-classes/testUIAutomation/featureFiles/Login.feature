Feature: Login into StackFlow Account
  Existing active user should be able to loginwith valid login credentials.

  Scenario: Login into account with valid credentials
    Given User visit to stackflow homepage
    And User clicks on login button on homepage
    And User enter a username
    And User enter a password
    When User clicks on login button
    Then User should be taken successfully to the login page
