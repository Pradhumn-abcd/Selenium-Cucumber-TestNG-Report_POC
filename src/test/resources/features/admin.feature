Feature: Admin User Management

  Scenario: Create a new user
    Given I am logged in as admin
    And I navigate to the Admin module
    When I add a new user with username "testuser9" and employee "t"
    Then I close the browser
