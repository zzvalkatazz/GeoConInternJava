package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Alert_PO;
import pageObjects.Base_PO;

public class Alert_Steps extends Base_PO {

    private Alert_PO alertPo;

    public Alert_Steps(Alert_PO alertPo)
    {
        this.alertPo=alertPo;
    }
    @Given("I go to Alert page")
    public void i_go_to_alert_page() {
      alertPo.navigate_to_alert_URL_page();
    }
    @When("I click on the first button")
    public void i_click_on_the_first_button() {
        alertPo.wait_for_click_first_button();
    }
    @Then("I should see bubble message")
    public void i_should_see_bubble_message() {
       alertPo.wait_For_Alert_And_Validate();
    }
    @When("I click on the second button")
    public void i_click_on_the_second_button() {
      alertPo.wait_for_click_second_button();
    }
    @Then("I should see bubble message next five seconds")
    public void i_should_see_bubble_message_next_five_seconds() {
     alertPo.wait_For_Alert_And_Validate_next_five_Seconds();
    }

    @When("I click on the third button")
    public void i_click_on_the_third_button() {
     alertPo.wait_for_click_third_button();
    }
    @Then("I should see bubble with multiple choice")
    public void i_should_see_bubble_with_multiple_choice() {
     alertPo.wait_for_Alert_and_Validate_before_choosing_ok_or_cancel();
    }
    @When("I click on OK")
    public void i_click_on_ok() {
     alertPo.wait_for_clicking_on_Ok();
    }
    @Then("I should see successful message with Ok")
    public void i_should_see_successful_message_with_ok() {
     alertPo.submission_ok_choosing();
    }
    @When("I click on Cancel")
    public void i_click_on_cancel()
    {
    alertPo.wait_for_clicking_on_cancel();
    }
    @Then("I should see successful message with Cancel")
    public void i_should_see_successful_message_with_cancel() {
     alertPo.submission_cancel_choosing();
    }
    @When("I click on the forth button")
    public void i_click_on_the_forth_button() {
       alertPo.wait_for_click_forth_button();
    }
    @And("I see bubble for adding name and enter the name")
    public void i_should_see_bubble_for_adding_name_and_enter_the_name() {
    alertPo.wait_for_validate_before_entering_name("Valentin");
    }


    @Then("I should see my name")
    public void i_should_see_my_name() {
    alertPo.submission_name_entering("Valentin");
    }

}
