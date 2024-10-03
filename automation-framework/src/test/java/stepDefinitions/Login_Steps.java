package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps extends Base_PO {
    private Login_PO login_po;
    public Login_Steps(Login_PO login_po)
    {
        this.login_po=login_po;
    }
    //private WebDriver driver = getDriver();



    @Given("I go to login page")
    public void i_go_to_login_page() {
        //driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        //navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        login_po.navigateTo_URL_LoginPage();
    }
    @When("I enter username {}")
    public void i_enter_username(String username) {
    // driver.findElement(By.xpath("/html//input[@id='text']")).sendKeys(username);
        login_po.setUsername(username);
    }
    @And("I enter password {}")
    public void i_enter_password(String password) {
      //  driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys(password);
        login_po.setPassword(password);
    }
    @When("I click login button")
    public void i_click_login_button() {
     // driver.findElement(By.xpath("/html//button[@id='login-button']")).click();
      login_po.click_Log_In_Button();
    }
    @Then("I receive successful message")
    public void i_receive_successful_message() {
        //String successfulPopUpMessage = driver.switchTo().alert().getText();
       // Assert.assertEquals(successfulPopUpMessage,"validation succeeded");
        login_po.wait_For_Alert_And_Validate("validation succeeded");
    }
    @Then("I receive unsuccessful message")
    public void i_receive_unsuccessful_message() {
        //String successfulPopUpMessage = driver.switchTo().alert().getText();
        //Assert.assertEquals(successfulPopUpMessage,"validation failed");
        login_po.wait_For_Alert_And_Validate("validation failed");
    }
    @Then("I receive validation message {string}")
    public void i_receive_validation_message(String validationMessage) {
        //String successfulPopUpMessage = driver.switchTo().alert().getText();
        //Assert.assertEquals(successfulPopUpMessage,validationMessage);
        login_po.wait_For_Alert_And_Validate(validationMessage);
    }
}
