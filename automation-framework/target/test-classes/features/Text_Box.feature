@TextBoxPage @PassedTests
  Feature: Testing text box page
    Scenario: successful submission
      Given I go to text box page
      When I enter full name
      And I write email address
      And I write current address
      And I enter permanent address
      When I click submit option
      Then I should receive successful message
