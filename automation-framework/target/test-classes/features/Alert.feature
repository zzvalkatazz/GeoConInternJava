@AlertPage

  Feature: Testing Alert page
    Background:
      Given I go to Alert page
       @FirstButtonTag
      Scenario: clicking on the first button
        When I click on the first button
        Then I should see bubble message

    @SecondButtonTag
      Scenario: clicking on the second button
        When I click on the second button
        Then I should see bubble message next five seconds

    @ThirdButtonTagOk
      Scenario:clicking on the third button Ok
        When I click on the third button
        Then I should see bubble with multiple choice
        When I click on OK
        Then I should see successful message with Ok
    @ThirdButtonTagCancel
    Scenario:clicking on the third button Ok Cancel
      When I click on the third button
      Then I should see bubble with multiple choice
      When I click on Cancel
      Then I should see successful message with Cancel
    @ForthButtonTag
     Scenario: clicking on the forth button
       When I click on the forth button
       And I see bubble for adding name and enter the name
       Then I should see my name