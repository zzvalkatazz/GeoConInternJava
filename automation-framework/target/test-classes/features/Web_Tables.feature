@WebTablesPage
  Feature: Web Tables page
           Background:
           Given I go to web tables page


         Scenario: Successful adding
           When I click on adding button
           Then I should see Registration Form
           When I enter  first name on the form
           And I enter  last name on the form
           And I enter  email on the form
           And I enter  age on the form
           And I enter salary on the form
           And I enter department on the form
           When I click submit button on the form
           Then I should see the pearson added
        Scenario: Successful deleting
          When I click on deleting button
          Then I should have the person deleted
        Scenario: Increasing salary
          When I click on editing button
          Then I should see Registration Form again
          When I change salary
          When I click submit button on the form again
          Then I should see changed salary
