package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Browser_Windows_PO;

public class Browser_Windows_Steps extends Base_PO {

    private Browser_Windows_PO browser_windows_po;
    public Browser_Windows_Steps(Browser_Windows_PO browser_windows_po)
    {
        this.browser_windows_po=browser_windows_po;
    }

    @Given("I go to browser windows page")
    public void i_go_to_browser_windows_page() {
       browser_windows_po.navigate_to_browser_windows_page_URL();
    }
    @When("I click on new window button")
    public void i_click_on_new_window_button() {
       browser_windows_po.wait_for_click_for_new_tab_page();
    }
    @Then("I should see new window")
    public void i_should_see_new_window() {
        browser_windows_po.wait_for_new_tab();
    }

    @When("I click on the new tab button")
    public void i_click_on_the_new_tab_button() {
     browser_windows_po.wait_for_click_for_new_window_page();
    }
    @Then("I should see new tab")
    public void i_should_see_new_tab() {
      browser_windows_po.wait_for_new_window();
    }
    @When("I click on new window message button")
    public void i_click_on_new_window_message_button() {
       browser_windows_po.wait_for_click_for_new_window_message_page();
    }
    @Then("I should see new windows message")
    public void i_should_see_new_windows_message() {
      browser_windows_po.wait_for_new_window_message();

    }

}
