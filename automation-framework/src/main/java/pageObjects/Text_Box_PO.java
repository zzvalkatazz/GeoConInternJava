package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Variables;

public class Text_Box_PO extends Base_PO{

    private @FindBy(xpath = "/html//input[@id='userName']")
    WebElement fullName_textField;

    private @FindBy(xpath = "/html//input[@id='userEmail']")
    WebElement email_textField;

    private @FindBy(xpath = "/html//textarea[@id='currentAddress']")
    WebElement current_Address_textField;

    private @FindBy(xpath = "/html//textarea[@id='permanentAddress']")
    WebElement permanent_Address_textField;

    private @FindBy(xpath = "/html//p[@id='name']")
    WebElement validation_name_text;

    private @FindBy(xpath = "/html//p[@id='email']")
    WebElement validation_email_text;

    private @FindBy(xpath = "//div[@id='output']//p[@id='currentAddress']")
    WebElement validation_current_address_text;

    private @FindBy(xpath = "//div[@id='output']//p[@id='permanentAddress']")
    WebElement validation_permanent_address_text;


    private @FindBy(xpath = "/html//button[@id='submit']")
    WebElement text_Box_Button;
    public Text_Box_PO()
    {
        super();
    }
    public void navigate_To_URL_TextBox_Page()
    {

        //navigateTo_URL("https://demoqa.com/text-box");
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL + "/text-box");
    }
    public void set_Full_Name(String fullName)
    {
        sendKeys(fullName_textField,fullName);
    }

    public void set_Email(String email)
    {
        sendKeys(email_textField,email);
    }

    public void set_current_address(String currentAddress)
    {
        sendKeys(current_Address_textField,currentAddress);
    }
    public void set_permanent_address(String permanentAddress)
    {
        sendKeys(permanent_Address_textField,permanentAddress);
    }

    public void click_On_Text_Box_Button()
    {
        waitForElementAndClick(text_Box_Button);
    }
    public void wait_For_Alert_For_Text_Box_And_Validate()
    {
        waitFor(validation_name_text);
        Assert.assertEquals(validation_name_text.getText(), "Name:Valentin");
        waitFor(validation_email_text);
        Assert.assertEquals(validation_email_text.getText(), "Email:val@124.com");
        waitFor(validation_current_address_text);
        Assert.assertEquals(validation_current_address_text.getText(), "Current Address :Burgas");
        waitFor(validation_permanent_address_text);
        Assert.assertEquals(validation_permanent_address_text.getText(), "Permananet Address :Sofia");
    }


}
