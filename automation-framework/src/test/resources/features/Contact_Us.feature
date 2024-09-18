@ContactUsPage
Feature: Testing contact us page
  Scenario: Successful submission
    Given I go to Contact us page
    When I enter first name
    And I enter last name
    And I enter email address
    And I enter comment
    When I click submit button
    Then I should receive succseful message