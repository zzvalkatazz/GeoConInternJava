package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Variables;

public class Double_Click_PO extends Base_PO {
    private @FindBy(xpath ="/html//button[@id='doubleClickBtn']" )
    WebElement click_double;

    private @FindBy(xpath ="//*[@id=\"rightClickBtn\"]")
    WebElement click_right;

    private @FindBy(css ="[class] [class='mt-4']:nth-child(4) .btn-primary" )
    WebElement click_dynamic;

    private @FindBy(xpath = "/html//p[@id='doubleClickMessage']")
    WebElement double_click_submission_message;

    private @FindBy(xpath = "/html//p[@id='rightClickMessage']")
    WebElement right_click_submission_message;

    private @FindBy(xpath = "/html//p[@id='dynamicClickMessage']")
    WebElement dynamic_click_submission_message;

    public Double_Click_PO()
    {
        super();
    }
    public void Navigate_To_Buttons_URL_Page()
    {
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL + "/buttons" );
    }
    public void click_double_click_button()
    {
        waitForElementAndDoubleClick(click_double);
    }
    public void click_right_click_button()
    {
        waitForElementAndRightClick(click_right);
    }
    public void click_dynamic_click_button()
    {
        waitForElementAndClick(click_dynamic);
    }
    public void double_click_submission() {
        waitFor(double_click_submission_message);
         Assert.assertEquals(double_click_submission_message.getText(), "You have done a double click");
    }
    public void right_click_submission()
    {
        waitFor(right_click_submission_message);
         Assert.assertEquals(right_click_submission_message.getText(), "You have done a right click");
    }
    public void dynamic_click_submission()
    {
        waitFor(dynamic_click_submission_message);
         Assert.assertEquals(dynamic_click_submission_message.getText(), "You have done a dynamic click");
    }
}
