package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;




public class Contact_Us_Steps extends Base_PO {
    private Contact_Us_PO contact_us_po;
    public Contact_Us_Steps(Contact_Us_PO contact_us_po)
    {
        this.contact_us_po=contact_us_po;
    }
    //private WebDriver driver = getDriver();



    @Given("I go to Contact us page")
    public void i_go_to_contact_us_page() {
       //driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
       //navigateTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
       contact_us_po.navigate_To_URL_Contact_Us_Page();
    }
    @When("I enter first name")
    public void i_enter_first_name() {
     // driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='first_name']")).sendKeys(GenerateRandomString(2)+GenerateRandomNumber(3));
      //sendKeys(By.xpath("//form[@id='contact_form']/input[@name='first_name']"),GenerateRandomString(2)+GenerateRandomNumber(3));
      contact_us_po.set_First_Name(GenerateRandomString(2)+GenerateRandomNumber(3));
    }
    @And("I enter last name")
    public void i_enter_last_name() {
       // driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='last_name']")).sendKeys("Kolev");
        //sendKeys(By.xpath("//form[@id='contact_form']/input[@name='last_name']"),"Kolev");
        contact_us_po.set_Last_Name("Kolev");
    }
    @And("I enter email address")
    public void i_enter_email_address() {
       // driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys("val@123.com");
        //sendKeys(By.xpath("//form[@id='contact_form']/input[@name='email']"),"val@123.com");
        contact_us_po.set_email("val@123.com");
    }
    @And("I enter comment")
    public void i_enter_comment() {
        //driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']")).sendKeys("test");
        //sendKeys(By.xpath("//form[@id='contact_form']/textarea[@name='message']"),"test");
        contact_us_po.set_message("test");
    }
    @When("I click submit button")
    public void i_click_submit_button() {
       // driver.findElement(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']")).click();
        //waitForElementAndClick(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']"));
        contact_us_po.click_On_Contact_Us_Button();

    }
    @Then("I should receive succseful message")
    public void i_should_receive_succseful_message() {
        //WebElement contact_us_submission_message= driver.findElement(By.xpath("//div[@id='contact_reply']/h1[.='Thank You for your Message!']"));
        contact_us_po.wait_For_Alert_And_Validate();
       // Assert.assertEquals(contact_us_submission_message.getText(),"Thank You for your Message!");
    }


    @When("I enter specific first name {}")
    public void i_enter_specific_first_name(String specific_name) {
        //driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='first_name']")).sendKeys(specific_name);
        contact_us_po.set_First_Name(specific_name);
    }
    @When("I enter specific last name {}")
    public void i_enter_specific_last_name(String specificLastName) {
      //  driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='last_name']")).sendKeys(specificLastName);
        contact_us_po.set_Last_Name(specificLastName);
    }
    @When("I enter specific email address {}")
    public void i_enter_specific_email_address(String specificEmail) {
       // driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys(specificEmail);
        contact_us_po.set_email(specificEmail);
    }
    @When("I enter specific comment {string}")
    public void i_enter_specific_comment(String specificComment) {
        //driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']")).sendKeys(specificComment);
        contact_us_po.set_message(specificComment);
    }
}

