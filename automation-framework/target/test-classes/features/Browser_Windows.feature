@BrowserWindowsPage
  Feature: Browser windows page
        Background:
          Given I go to browser windows page
      @NewTabTag
      Scenario:opening new tab
        When I click on the new tab button
        Then I should see new tab
    @NewWindowTag
      Scenario:opening new window
          When I click on new window button
          Then I should see new window
    @NewWindowMessageTag
      Scenario:opening new window message
        When I click on new window message button
        Then I should see new windows message