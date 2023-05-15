Feature: Login Test Scenario

  @Tag1
  Scenario: Verify login test on Keycloak
    Given I am on Keycloak
    When I insert username
    And I insert password
    And I click on Sign In button
    Then I see Home Page