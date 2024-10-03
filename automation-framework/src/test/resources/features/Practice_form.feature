@PracticeFormPage
Feature:Testing Practice form page
 Background:
   Given I go to practice form page
   When I add my first Name Valentin
    And I add my last Name Kolev
    And I add my email "valyo300047@gmail.com"
    And I add my mobile number "0893531524"
   And I add my date of birth
   And I add my subject
   When I click to choose picture
   Then I must see picture file
   When I add my address "Burgas"
   And I click to add state
   And I click to add city
@MaleTag
   Scenario: Successful submission with male gender
     When I select the gender male
     And I select hobbies for him
     And  I click on submit button
     Then I should receive success with male
@FemaleTag
  Scenario: Successful submission with female gender
    When I select the gender female
    And I select hobbies for her
    And  I click on submit button
    Then I should receive success with female
@OtherTag
  Scenario: Successful submission with other gender
    When I select the gender other
    And I select hobbies for it
    And  I click on submit button
    Then I should receive success with other