Feature: Editor Test
  Scenario: Verify test content after editing
    Given I am on Home Page
    When I click on Editor link
    And I enter text
    Then I see the text