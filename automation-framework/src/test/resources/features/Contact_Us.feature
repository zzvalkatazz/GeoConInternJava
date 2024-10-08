@ContactUsPage @PassedTests
Feature: Testing contact us page
    Background:
      Given I go to Contact us page
  Scenario: Successful submission
    When I enter first name
    And I enter last name
    And I enter email address
    And I enter comment
    When I click submit button
    Then I should receive succseful message

  @SpecificData
  Scenario: Specific data
    When I enter specific first name Valentin
    And I enter specific last name Kolev
    And I enter specific email address vk.300401@abv.bg
    And I enter specific comment "testing assurance"
    When I click submit button
    Then I should receive succseful message
