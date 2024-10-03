package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Double_Click_PO;

public class Double_Click_Steps extends Base_PO {

    private Double_Click_PO doubleClickPo;


   public Double_Click_Steps(Double_Click_PO doubleClickPo)
    {
        this.doubleClickPo=doubleClickPo;
    }

    @Given("I go to double click page")
    public void i_go_to_double_click_page() {

        doubleClickPo.Navigate_To_Buttons_URL_Page();
    }
    @When("I click twice to double click button")
    public void i_click_twice_to_double_click_button() {
        doubleClickPo.click_double_click_button();
    }
    @Then("I should receive successful double-click message")
    public void i_should_receive_successful_double_click_message() {
        doubleClickPo.double_click_submission();
    }


    @When("I click the right button")
    public void i_click_the_right_button() {
       doubleClickPo.click_right_click_button();
    }
    @Then("I should receive successful right click message")
    public void i_should_receive_successful_right_click_message() {
        doubleClickPo.right_click_submission();
    }

    @When("I click the dynamic button")
    public void i_click_the_dynamic_button() {
       doubleClickPo.click_dynamic_click_button();
    }
    @Then("I should receive successful dynamic click message")
    public void i_should_receive_successful_dynamic_click_message() {
      doubleClickPo.dynamic_click_submission();
    }

}
