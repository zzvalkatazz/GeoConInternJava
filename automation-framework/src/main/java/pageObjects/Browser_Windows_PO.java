package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;

public class Browser_Windows_PO extends Base_PO{

    private @FindBy(xpath = "/html//button[@id='tabButton']")
    WebElement click_new_tab_button;

    private @FindBy(xpath = "/html//button[@id='windowButton']")
    WebElement click_new_window_button;

    private @FindBy(xpath = "/html//button[@id='messageWindowButton']")
    WebElement click_new_window__message_button;
    private @FindBy(xpath = "/html/body")
    WebElement new_window__message_submit;

    public Browser_Windows_PO()
    {
        super();
    }
    public void navigate_to_browser_windows_page_URL()
    {
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL+ "/browser-windows");
    }
    public void wait_for_click_for_new_tab_page()
    {
        waitForElementAndClick(click_new_tab_button);
    }
    public void wait_for_new_tab()
    {
      String originalWindows= getDriver().getWindowHandle();
      new WebDriverWait(getDriver(),10).until(ExpectedConditions.numberOfWindowsToBe(2));

      for(String windowHandle : getDriver().getWindowHandles())
      {
          if(!windowHandle.equals(originalWindows))
          {
              getDriver().switchTo().window(windowHandle);
              break;
          }
      }
      String expectedURL="https://demoqa.com/sample";
      new WebDriverWait(getDriver(),10).until(ExpectedConditions.urlToBe(expectedURL));
    }
    public void wait_for_click_for_new_window_page()
    {
        waitForElementAndClick(click_new_window_button);
    }
    public void closeCurrentWindowAndSwitchBack()
    {
    getDriver().close();
    getDriver().switchTo().window(getDriver().getWindowHandle());
   }
    public void wait_for_new_window()
    {
        String originalWindows= getDriver().getWindowHandle();
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.numberOfWindowsToBe(2));

        for(String windowHandle : getDriver().getWindowHandles())
        {
            if(!windowHandle.equals(originalWindows))
            {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        String expectedURL="https://demoqa.com/sample";
        new WebDriverWait(getDriver(),10).until(ExpectedConditions.urlToBe(expectedURL));
    }
    public void wait_for_click_for_new_window_message_page()
    {
        waitForElementAndClick(click_new_window__message_button);
    }
    public void wait_for_new_window_message()
    {
        getDriver().get("about:blank");
        waitFor(new_window__message_submit);
        Assert.assertEquals(new_window__message_submit.getText(),"");

    }





        //waitFor(new_window__message_submit);
      //Assert.assertEquals(new_window__message_submit.getText(),"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
}

