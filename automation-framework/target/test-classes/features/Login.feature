@LoginPage
Feature: Testing Login page

  Background:
    Given I go to login page

  Scenario: Successful login
    When I enter username webdriver
    And I enter password webdriver123
    When I click login button
    Then I receive successful message

  @UnsuccessfuLogin
  Scenario: Unsuccessful login
    When I enter username webdriver1
    And I enter password webdriver1234
    When I click login button
    Then I receive unsuccessful message

  Scenario: Unsuccessful login
    When I enter username webdriver1
    And I enter password webdriver1234
    When I click login button
    Then I receive unsuccessful message

  Scenario: Unsuccessful login
    When I enter username webdriver1
    And I enter password webdriver1234
    When I click login button
    Then I receive unsuccessful message

@LoginOutline
  Scenario Outline: Validate login
    When I enter username <username>
    And I enter password <password>
    When I click login button
    Then I receive validation message <validationMessage>
    Examples:
      | username  | password     | validationMessage    |
      | webdriver | webdriver123 | "validation succeeded" |
      | web       | 123          | "validation failed"    |
      | web33     | 12345        | "validation failed"    |