package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;

import java.time.Duration;

public class Alert_PO extends Base_PO{

    private @FindBy(xpath="/html//button[@id='alertButton']")
    WebElement click_first_button;

    private @FindBy(xpath="/html//button[@id='timerAlertButton']")
    WebElement click_second_button;

    private @FindBy(xpath="/html//button[@id='confirmButton']")
    WebElement click_third_button;

    private @FindBy(xpath="/html//span[@id='confirmResult']")
    WebElement ok_chosen;

    private @FindBy(xpath="/html//span[@id='confirmResult']")
    WebElement cancel_chosen;

    private @FindBy(xpath="/html//button[@id='promtButton']")
    WebElement click_forth_button;

    private @FindBy(xpath="/html//span[@id='promptResult']")
    WebElement name_choosen;

    public Alert_PO()
    {
        super();
    }
    public void navigate_to_alert_URL_page()
    {
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL+"/alerts");
    }
    public void wait_for_click_first_button()
    {
       waitForElementAndClick(click_first_button);
    }
    public void wait_For_Alert_And_Validate()
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_message = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_message,"You clicked a button");
    }
    public void wait_for_click_second_button()
    {
        waitForElementAndClick(click_second_button);
    }
    public void wait_For_Alert_And_Validate_next_five_Seconds()
    {
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_message = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_message,"This alert appeared after 5 seconds");
    }
    public void wait_for_click_third_button()
    {
        waitForElementAndClick(click_third_button);
    }
    public void wait_for_Alert_and_Validate_before_choosing_ok_or_cancel()
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_message = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_message,"Do you confirm action?");
    }
    public void wait_for_clicking_on_Ok()
    {
      Alert alert = getDriver().switchTo().alert();
      alert.accept();
    }
    public void wait_for_clicking_on_cancel()
    {
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }
    public void submission_ok_choosing()
    {
        waitFor(ok_chosen);
        String actualText = ok_chosen.getText();
        Assert.assertEquals(actualText, "You selected Ok");
    }
    public void submission_cancel_choosing()
    {
        waitFor(cancel_chosen);
        String actualText = cancel_chosen.getText();
        Assert.assertEquals(actualText, "You selected Cancel");
    }
    public void wait_for_click_forth_button()
    {
        waitForElementAndClick(click_forth_button);
    }
   public void wait_for_validate_before_entering_name(String name)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert promptAlert=getDriver().switchTo().alert();
        String alert_message=promptAlert.getText();
        Assert.assertEquals(alert_message,"Please enter your name");

        promptAlert.sendKeys("Valentin");
        promptAlert.accept();
    }
    public void wait_for_clicking_on_Ok_on_name_bubble()
    {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
    public void submission_name_entering(String name)
    {
        waitFor(name_choosen);
        String actualText = name_choosen.getText();
        Assert.assertEquals(actualText, "You entered " + name);
    }

}
