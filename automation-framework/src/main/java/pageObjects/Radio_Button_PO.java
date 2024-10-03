package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Variables;

public class Radio_Button_PO extends Base_PO{
    private @FindBy(xpath="//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[2]/div[2]/div[2]/label[@class='custom-control-label']")
    WebElement click_on_Yes_Radio_Button;

    private @FindBy(xpath="//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[2]/div[2]/div[3]/label[@class='custom-control-label']")
    WebElement click_on_Impressive_Radio_Button;

    private @FindBy(xpath="//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//p[@class='mt-3']")
    WebElement validation_Yes_Text;

    private @FindBy(xpath="//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//p[@class='mt-3']")
    WebElement validation_Impressive_Text;
    public Radio_Button_PO()
    {
        super();
    }
    public void navigate_To_URL_Radio_Button_Page()
    {
       // navigateTo_URL("https://demoqa.com/radio-button");
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL + "/radio-button" );
    }
    public void click_on_Yes_Radio_Button()
    {
        waitForElementAndClick(click_on_Yes_Radio_Button);
    }

    public void click_on_Impressive_Radio_Button()
    {
        waitForElementAndClick(click_on_Impressive_Radio_Button);
    }

    public void wait_For_Alert_For_Yes_Radio_Button_And_Validate()
    {
        waitFor(validation_Yes_Text);
        Assert.assertEquals(validation_Yes_Text.getText(),"You have selected Yes");
    }
    public void wait_For_Alert_For_Impressive_Radio_Button_And_Validate()
    {
        waitFor(validation_Impressive_Text);
        Assert.assertEquals(validation_Impressive_Text.getText(),"You have selected Impressive555");
    }
}
