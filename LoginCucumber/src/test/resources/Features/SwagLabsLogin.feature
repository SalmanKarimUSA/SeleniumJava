Feature: As a Swag Labs customer, I need to be able to log in so that I can purchase Sauce Labs merch.

  Scenario: 1 Successful Login
    Given browser is open
    And I am on the Sauce Demo Login Page
    When I fill the account information for account StandardUser into the Username field and the Password field
    And I click the Login button
    Then I am redirected to the Sauce Demo Main Page
    And I verify the App Logo exists

  Scenario: 2 Failed Login
    Given browser is open
    And I am on the Sauce Demo Login Page
    When I fill the account information for account LockedOutUser into the Username field and the Password field
    And I click the Login button
    Then I verify the Error Message contains the text "Epic sadface: Sorry, this"
