package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Variables;

public class Contact_Us_PO extends  Base_PO{
    private @FindBy(xpath="//div[@id='contact_reply']/h1[.='Thank You for your Message!']")
    WebElement validation_text;
    private @FindBy(xpath="//form[@id='contact_form']/input[@name='first_name']")
    WebElement first_name_textField;
    private @FindBy(xpath="//form[@id='contact_form']/input[@name='last_name']")
    WebElement last_name_textField;

    private @FindBy(xpath="//form[@id='contact_form']/input[@name='email']")
    WebElement email_textField;

    private @FindBy(xpath="//form[@id='contact_form']/textarea[@name='message']")
    WebElement message_textField;

    private @FindBy(xpath = "//div[@id='form_buttons']/input[@value='SUBMIT']")
    WebElement contact_Us_Button;
   public  Contact_Us_PO()
   {
       super();
   }
   public void navigate_To_URL_Contact_Us_Page()
   {
       //navigateTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
       navigateTo_URL(Global_Variables.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
   }
   public void set_First_Name(String firstName)
   {
       sendKeys(first_name_textField,firstName);
   }
    public void set_Last_Name(String lastName)
    {
        sendKeys(last_name_textField,lastName);
    }

    public void set_email(String email)
    {
        sendKeys(email_textField,email);
    }
    public void set_message(String message)
    {
        sendKeys(message_textField,message);
    }
    public void click_On_Contact_Us_Button()
    {
        waitForElementAndClick(contact_Us_Button);
    }
   public void wait_For_Alert_And_Validate()
   {
       waitFor(validation_text);
       Assert.assertEquals(validation_text.getText(),"Thank You for your Message!");
   }
}
