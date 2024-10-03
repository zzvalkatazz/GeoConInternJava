package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;

import java.time.Duration;

public class Login_PO extends Base_PO{
    private @FindBy(xpath = "/html//input[@id='text']")
    WebElement username_textField;
    private @FindBy(css="[placeholder='Password']")
    WebElement password_textField;
    private @FindBy(xpath = "/html//button[@id='login-button']")
    WebElement log_in_Button;
    public Login_PO()
    {
        super();
    }
    public void navigateTo_URL_LoginPage()
    {
       // navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        navigateTo_URL(Global_Variables.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html?");
    }
    public void setUsername(String username)
    {
        sendKeys(username_textField,username);
    }
    public void setPassword(String password)
    {
        sendKeys(password_textField,password);
    }
    public void click_Log_In_Button()
    {
        waitForElementAndClick(log_in_Button);
    }
    public void wait_For_Alert_And_Validate(String text)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_message = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_message,text);
    }
}
