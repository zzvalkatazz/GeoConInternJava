@DroppablePage
  Feature: Droppable click page
    Scenario: I drag the box to dropped
      Given I go to droppable page
      When I click and hold on drag me box
      And I start moving the box
      And I insert the box in drop here
      Then I should see drop here box in blue

