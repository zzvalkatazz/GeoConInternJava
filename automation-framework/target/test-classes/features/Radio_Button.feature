@RadioButtonPage @PassedTests

  Feature:Testing Radio Button
    Background:
      Given I go to radio button page

    Scenario: Select "Yes" option on radio button
      When I select the Yes radio button
      Then I should receive confirm
       @RadioOtherButtonPage
      Scenario: Select "Impressive" option on radio button
        When I select the other radio button
        Then I should receive impressive confirm