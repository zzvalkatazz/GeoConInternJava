package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Radio_Button_PO;

public class Radio_Button_Steps extends Base_PO {
    private Radio_Button_PO radio_button_po;

    public Radio_Button_Steps(Radio_Button_PO radio_button_po)
    {
        this.radio_button_po=radio_button_po;
    }

    //private WebDriver driver = getDriver();

    @Given("I go to radio button page")
    public void i_go_to_radio_button_page() {
        radio_button_po.navigate_To_URL_Radio_Button_Page();
    }
    @When("I select the Yes radio button")
    public void i_select_the_yes_radio_button() {
       // driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[2]/div[2]/div[2]/label[@class='custom-control-label']")).click();
        radio_button_po.click_on_Yes_Radio_Button();

    }
    @Then("I should receive confirm")
    public void i_should_receive_confirm() {
        //WebElement contact_us_submission_message= driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//p[@class='mt-3']"));
        //Assert.assertEquals(contact_us_submission_message.getText(),"You have selected Yes");
        radio_button_po.wait_For_Alert_For_Yes_Radio_Button_And_Validate();
    }
    @When("I select the other radio button")
    public void i_select_the_other_radio_button() {
        //driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[2]/div[2]/div[3]/label[@class='custom-control-label']")).click();
        radio_button_po.click_on_Impressive_Radio_Button();
    }
    @Then("I should receive impressive confirm")
    public void i_should_receive_impressive_confirm() {
        //WebElement radio_button_submission_message= driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//p[@class='mt-3']"));
        //Assert.assertEquals(radio_button_submission_message.getText(),"You have selected Impressive");
        radio_button_po.wait_For_Alert_For_Impressive_Radio_Button_And_Validate();
    }
}
