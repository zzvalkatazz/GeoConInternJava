package pageObjects;

import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Global_Variables;

import java.time.Duration;

public class Base_PO extends Object {
    public Base_PO()
    {
        PageFactory.initElements(getDriver(),this);
    }
    public WebDriver getDriver()
    {
        return DriverFactory.getDriver();
    }
    public void navigateTo_URL(String URL)
    {
        getDriver().get(URL);
    }
    public String GenerateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }
    public String GenerateRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }

    public void sendKeys(By by, String textToType)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }
    public void sendKeys(WebElement element, String textToType)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }
    public void waitForElementAndClick(By by)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public void waitForElementAndClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void waitForElementAndDoubleClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(getDriver()).doubleClick(element).perform();
    }
    public void waitForElementAndClickAndHold(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(getDriver()).clickAndHold(element).perform();
    }
    public void waitForElementAndMove(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(getDriver()).moveToElement(element).perform();
    }
    public void waitForElementAndRightClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(getDriver()).contextClick(element).perform();
    }
    public void waitForRelease(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(getDriver()).release(element).perform();
    }

    public void waitFor(By by)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    public void waitFor(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
