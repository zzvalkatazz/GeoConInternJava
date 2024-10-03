package stepDefinitions;


import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Text_Box_PO;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanUpDriver;


public class Text_Box_Steps extends Base_PO {
    private Text_Box_PO text_box_po;
    public Text_Box_Steps(Text_Box_PO text_box_po)
    {
        this.text_box_po=text_box_po;
    }

   // private WebDriver driver = getDriver();




    @Given("I go to text box page")
    public void i_go_to_text_box_page() {

        //driver.get("https://demoqa.com/text-box");
        text_box_po.navigate_To_URL_TextBox_Page();
    }
    @When("I enter full name")
    public void i_enter_full_name() {
        //driver.findElement(By.xpath("/html//input[@id='userName']")).sendKeys("Valentin");
        text_box_po.set_Full_Name("Valentin");
    }

    @And("I write email address")
    public void i_write_email_address() {
       // driver.findElement(By.xpath("/html//input[@id='userEmail']")).sendKeys("val@124.com");
        text_box_po.set_Email("val@124.com");
    }

    @And("I write current address")
    public void i_write_current_address() {
       // driver.findElement(By.xpath("/html//textarea[@id='currentAddress']")).sendKeys("Burgas");
        text_box_po.set_current_address("Burgas");
    }

    @And("I enter permanent address")
    public void i_enter_permanent_address() {
       // driver.findElement(By.xpath("/html//textarea[@id='permanentAddress']")).sendKeys("Sofia");
        text_box_po.set_permanent_address("Sofia");
    }

    @When("I click submit option")
    public void i_click_submission_option() {

        //driver.findElement(By.xpath("/html//button[@id='submit']")).click();
        text_box_po.click_On_Text_Box_Button();
    }

    @Then("I should receive successful message")
    public void i_should_receive_successful_message() {
      //  WebElement text_box_submission_message_name = driver.findElement(By.xpath("/html//p[@id='name']"));
      //  Assert.assertEquals(text_box_submission_message_name.getText(), "Name:Valentin");
      //  WebElement text_box_submission_message_email = driver.findElement(By.xpath("/html//p[@id='email']"));
      //  Assert.assertEquals(text_box_submission_message_email.getText(), "Email:val@124.com");
      //  WebElement text_box_submission_message_currentAddress = driver.findElement(By.xpath("//div[@id='output']//p[@id='currentAddress']"));
       // Assert.assertEquals(text_box_submission_message_currentAddress.getText(), "Current Address :Burgas");
       // WebElement text_box_submission_message_permanentAddress = driver.findElement(By.xpath("//div[@id='output']//p[@id='permanentAddress']"));
       // Assert.assertEquals(text_box_submission_message_permanentAddress.getText(), "Permananet Address :Sofia");
        text_box_po.wait_For_Alert_For_Text_Box_And_Validate();

    }


}
