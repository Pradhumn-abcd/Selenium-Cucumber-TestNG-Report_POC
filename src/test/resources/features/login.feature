Feature: OrangeHRM Login Functionality

  Scenario: Valid login with admin credentials
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "admin123"
    Then I should see the OrangeHRM dashboard
