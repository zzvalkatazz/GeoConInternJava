package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Login {
    private WebDriver driver;

    @Before("@LoginPage")
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After("@LoginPage")
    public void Teardown() {
        driver.quit();

    }

    @Given("I go to login page")
    public void i_go_to_login_page() {
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }
    @When("I enter username {word}")
    public void i_enter_username(String username) {
     driver.findElement(By.xpath("/html//input[@id='text']")).sendKeys(username);
    }
    @And("I enter password {word}")
    public void i_enter_password(String password) {
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys(password);
    }
    @When("I click login button")
    public void i_click_login_button() {
      driver.findElement(By.xpath("/html//button[@id='login-button']")).click();
    }
    @Then("I receive successful message")
    public void i_receive_successful_message() {
        String successfulPopUpMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(successfulPopUpMessage,"validation succeeded");
    }
    @Then("I receive unsuccessful message")
    public void i_receive_unsuccessful_message() {
        String successfulPopUpMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(successfulPopUpMessage,"validation failed");
    }
    @Then("I receive validation message {string}")
    public void i_receive_validation_message(String validationMessage) {
        String successfulPopUpMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(successfulPopUpMessage,validationMessage);
    }
}
