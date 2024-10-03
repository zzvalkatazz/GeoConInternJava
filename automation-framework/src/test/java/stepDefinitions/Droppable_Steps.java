package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Droppable_PO;

public class Droppable_Steps extends Base_PO {
   private Droppable_PO droppable_po;

   public Droppable_Steps(Droppable_PO droppable_po)
   {
       this.droppable_po=droppable_po;
   }
    @Given("I go to droppable page")
    public void i_go_to_droppable_page() {
       droppable_po.Navigate_To_Droppable_URL_Page();
    }
    @When("I click and hold on drag me box")
    public void i_click_and_hold_on_drag_me_box() {

      droppable_po.click_and_hold_drag_me_box();
    }
    @And("I start moving the box")
    public void i_start_moving_the_box() {
        droppable_po.move_drag_me_box_to_drop();
    }
    @And("I insert the box in drop here")
    public void i_insert_the_box_in_drop_here() {
     droppable_po.release_drag_me_box();
    }
    @Then("I should see drop here box in blue")
    public void i_should_see_drop_here_box_in_blue() {
       droppable_po.is_drop_here_box_blue();
    }
}
