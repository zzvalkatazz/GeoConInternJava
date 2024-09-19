package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Contact_Us {
    private WebDriver driver;

    @Before("@ContactUsPage")
    public void Setup(){
        System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @After("@ContactUsPage")
    public void Teardown(){
        driver.quit();
    }

    public String GenerateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }
    public String GenerateRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }


    @Given("I go to Contact us page")
    public void i_go_to_contact_us_page() {
       driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I enter first name")
    public void i_enter_first_name() {
      driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='first_name']")).sendKeys(GenerateRandomString(2)+GenerateRandomNumber(3));
    }
    @And("I enter last name")
    public void i_enter_last_name() {
        driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='last_name']")).sendKeys("Kolev");
    }
    @And("I enter email address")
    public void i_enter_email_address() {
        driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys("val@123.com");
    }
    @And("I enter comment")
    public void i_enter_comment() {
        driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']")).sendKeys("test");
    }
    @When("I click submit button")
    public void i_click_submit_button() {
        driver.findElement(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']")).click();

    }
    @Then("I should receive succseful message")
    public void i_should_receive_succseful_message() {
        WebElement contact_us_submission_message= driver.findElement(By.xpath("//div[@id='contact_reply']/h1[.='Thank You for your Message!']"));
        Assert.assertEquals(contact_us_submission_message.getText(),"Thank You for your Message!");
    }


    @When("I enter specific first name {}")
    public void i_enter_specific_first_name(String specific_name) {
        driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='first_name']")).sendKeys(specific_name);
    }
    @When("I enter specific last name {}")
    public void i_enter_specific_last_name(String specificLastName) {
        driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='last_name']")).sendKeys(specificLastName);
    }
    @When("I enter specific email address {}")
    public void i_enter_specific_email_address(String specificEmail) {
        driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys(specificEmail);
    }
    @When("I enter specific comment {string}")
    public void i_enter_specific_comment(String specificComment) {
        driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']")).sendKeys(specificComment);
    }
}

