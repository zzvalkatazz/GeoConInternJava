@DoubleClickTag
Feature:Test click page
    Background:
      Given I go to double click page
  @DoubleTag
  Scenario: successful double click
        When I click twice to double click button
        Then I should receive successful double-click message
  @RightClickTag
  Scenario: successful right click
         When I click the right button
         Then I should receive successful right click message
    @DynamicClickTag
  Scenario: successful dynamic click
       When I click the dynamic button
       Then I should receive successful dynamic click message