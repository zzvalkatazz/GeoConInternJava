package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Web_Tables_PO;

public class Web_Tables_Steps extends Base_PO {

     private Web_Tables_PO web_tables_po;

     public Web_Tables_Steps(Web_Tables_PO web_tables_po)
     {
         this.web_tables_po=web_tables_po;
     }
    @Given("I go to web tables page")
    public void i_go_to_web_tables_page() {
      web_tables_po.Navigate_To_Web_Tables_URL_Page();
    }
    @When("I click on adding button")
    public void i_click_on_adding_button() {
        web_tables_po.Click_On_Adding_Button();
    }
    @Then("I should see Registration Form")
    public void i_should_see_registration_form() {
        web_tables_po.Opening_Registration_Form();
    }
    @When("I enter  first name on the form")
    public void i_enter_first_name_on_the_form() {
        web_tables_po.set_first_name("Valentin");
    }
    @And("I enter  last name on the form")
    public void i_enter_last_name_on_the_form() {
        web_tables_po.set_last_name("Kolev");
    }
    @And("I enter  email on the form")
    public void i_enter_email_on_the_form() {
      web_tables_po.set_email("valyo300047@gmail.com");
    }
    @And("I enter  age on the form")
    public void i_enter_age_on_the_form() {
       web_tables_po.set_age("23");
    }
    @And("I enter salary on the form")
    public void i_enter_salary_on_the_form() {
       web_tables_po.set_salary("2700");
    }
    @And("I enter department on the form")
    public void i_enter_department_on_the_form() {
        web_tables_po.set_department("GeoCon");
    }
    @When("I click submit button on the form")
    public void i_click_submit_button_on_the_form() {
        web_tables_po.click_On_Submission_Button();
    }
    @Then("I should see the pearson added")
    public void i_should_see_the_pearson_added() {
        web_tables_po.set_new_person();
    }

    @When("I click on deleting button")
    public void i_click_on_deleting_button() {
       web_tables_po.click_on_delete_button();
    }
    @Then("I should have the person deleted")
    public void i_should_have_the_person_deleted() {
      web_tables_po.wait_for_deletion();
    }
    @When("I click on editing button")
    public void i_click_on_editing_button() {
      web_tables_po.wait_for_clicking_editing_button();
    }
    @Then("I should see Registration Form again")
    public void i_should_see_registration_form_again() {
     web_tables_po.wait_for_registration_form();
    }
    @When("I change salary")
    public void i_change_salary() {
         web_tables_po.salary_increasing("3000");
    }
    @When("I click submit button on the form again")
    public void i_click_submit_button_on_the_form_again() {
        web_tables_po.wait_for_submit_again();
    }
    @Then("I should see changed salary")
    public void i_should_see_changed_salary() {
         web_tables_po.wait_for_submiting_salary();
    }
}
