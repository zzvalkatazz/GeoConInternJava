package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;

import java.time.Duration;

public class Practice_Form_PO extends Base_PO{

    private @FindBy(xpath = "/html//input[@id='firstName']")
    WebElement first_Name_TextField;
    private @FindBy(xpath = "/html//input[@id='lastName']")
    WebElement last_Name_TextField;
    private @FindBy(xpath = "/html//input[@id='userEmail']")
    WebElement user_Email_TextField;
    private @FindBy(xpath = "/html//input[@id='userNumber']")
    WebElement user_Number_TextField;
    private @FindBy(xpath = "/html//input[@id='dateOfBirthInput']")
    WebElement birth_Date_TextField;
    private @FindBy(xpath = "/html//input[@id='dateOfBirthInput']")
    WebElement click_birth_Date1_TextField;

    private @FindBy(xpath = "//div[@id='dateOfBirth']/div[@class='react-datepicker__tab-loop']/div[@class='react-datepicker-popper']//div[@role='listbox']/div[1]/div[1]")
    WebElement click_birth_Date2_TextField;
    private @FindBy(xpath = "//div[@id='subjectsContainer']/div/div[1])")
    WebElement add_Subject1_TextField;
    private @FindBy(xpath = "//div[@id='subjectsContainer']/div[2]")
    WebElement add_Subject2_TextField;
    private @FindBy(xpath = "/html//input[@id='uploadPicture']")
    WebElement choose_picture_Button;
    private @FindBy(xpath = "/html//textarea[@id='currentAddress']")
    WebElement address_TextField;
    private @FindBy(xpath = "//div[@id='state']/div/div[1]")
    WebElement add_State1_TextField;
    private @FindBy(xpath = "//div[@id='state']/div/div[2]")
    WebElement add_State2_TextField;

    private @FindBy(xpath ="//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[1]/label")
    WebElement click_male_button;
    private @FindBy(xpath = "//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[1]/label")
    WebElement click_male_hobbies;
    private @FindBy(xpath = "//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[2]/label")
    WebElement click_female_button;
    private @FindBy(xpath ="//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[2]/label")
    WebElement click_female_hobbies;
    private @FindBy(xpath = "//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[3]")
    WebElement click_other_button;
    private @FindBy(xpath = "//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[3]/label")
    WebElement click_other_hobbies;

    private @FindBy(xpath = "/html//button[@id='submit']")
    WebElement click_submit_button;

    private @FindBy(xpath = "/html//div[@id='example-modal-sizes-title-lg']")
    WebElement submission_Thanks_Text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Label']")
    WebElement submission_lalel_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Values']")
    WebElement submission_value_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Name']")
    WebElement submission_name_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Email']")
    WebElement submission_email_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Gender']")
    WebElement submission_gender_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Mobile']")
    WebElement submission_mobile_text;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Date of Birth']")
    WebElement submission_date_text;;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Subjects']")
    WebElement submission_subject_text;;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Hobbies']")
    WebElement submission_hobbies_text;;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Picture']")
    WebElement submission_picture_text;;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Address']")
    WebElement submission_address_text;;

    private @FindBy(xpath ="//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='State and City']")
    WebElement submission_state_and_city_text;;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Valentin Kolev']")
    WebElement submission_name_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='valyo300047@gmail.com']")
    WebElement submission_email_answer;
    private @FindBy(xpath ="//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Male']")
    WebElement submission_gender_male_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Female']")
    WebElement submission_gender_female_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Other']")
    WebElement submission_gender_other_answer;


    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='0893531524']")
    WebElement submission_mobile_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='01 September,2024']")
    WebElement submission_date_answer;
    private @FindBy(xpath ="//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Maths']")
    WebElement submission_subject_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Sports']")
    WebElement submission_hobbie_male_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Reading']")
    WebElement submission_hobbie_female_answer;

    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Music']")
    WebElement submission_hobbie_other_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='20240916_121800.jpg']")
    WebElement submission_picture_answer;
    private @FindBy(xpath ="//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Burgas']")
    WebElement submission_address_answer;
    private @FindBy(xpath = "//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='NCR Delhi']")
    WebElement submission_state_and_city_answer;

    //WebDriver driver = getDriver();


   public Practice_Form_PO()
    {
        super();
    }
    public void navigate_To_URL_Practice_Form_Page()
    {
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL + "/automation-practice-form");
    }
    public void set_First_Name(String firstName)
    {
        sendKeys(first_Name_TextField,firstName);
    }
    public void set_Last_Name(String lastName)
    {
        sendKeys(last_Name_TextField,lastName);
    }
    public void set_Email(String email)
    {
        sendKeys(user_Email_TextField,email);
    }
    public void set_Mobile(String mobile)
    {
        sendKeys(user_Number_TextField,mobile);
    }
    public void set_Birth_Date()
    {
        waitForElementAndClick(click_birth_Date1_TextField);
        waitForElementAndClick(click_birth_Date2_TextField);
    }
    public void set_Subject()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        WebElement webElement = getDriver().findElement(By.xpath("//div[@id='subjectsContainer']/div/div[1]"));
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        new Actions(getDriver())
                .sendKeys(webElement, "Maths")
                .perform();
        WebElement webElement1 = getDriver().findElement(By.xpath("//div[@id='subjectsContainer']/div[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(webElement1)).click();
    }
//      public void set_Picture()
//      {
//          WebElement uploadButton = getDriver().findElement(By.xpath("/html//input[@id='uploadPicture']"));
//          ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", uploadButton);
//      }
    public void set_Picture_Second()
    {
        WebElement uploadInput = getDriver().findElement(By.xpath("/html//input[@id='uploadPicture']"));

        // Provide the full path to the file you want to upload
        String filePath = "C:\\Users\\VAlenTin\\Desktop\\javaInstructionTranslated\\20240916_121800.jpg"; // Replace with the actual path to your image

        // Upload the file directly by sending the file path to the input element
        uploadInput.sendKeys(filePath);
    }
    public void set_Adress(String address)
    {
        sendKeys(address_TextField,address);
    }
    public void set_State()
    {
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        WebElement webElement = getDriver().findElement(By.xpath("//div[@id='state']/div/div[1]"));
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        new Actions(getDriver()).sendKeys(webElement,"NCR"+ Keys.ENTER).perform();
        WebElement webElement1 = getDriver().findElement(By.xpath("//div[@id='state']/div/div[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(webElement1)).click();
    }
    public void set_City()
    {
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        WebElement webElement = getDriver().findElement(By.xpath("//div[@id='city']/div/div[1]/div[.='Select City']"));
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        new Actions(getDriver()).sendKeys(webElement,"Delhi"+Keys.ENTER).perform();
    }
    public void click_Male_Button()
    {
        waitForElementAndClick(click_male_button);
    }
    public void click_Female_Button()
    {
        waitForElementAndClick(click_female_button);
    }
    public void click_Other_Button()
    {
      waitForElementAndClick(click_other_button);
    }
    public void click_Male_Hobbies_Button()
    {
      waitForElementAndClick(click_male_hobbies);
    }
    public void click_Female_Hobbies_Button()
    {
        waitForElementAndClick(click_female_hobbies);
    }
    public void click_Other_Hobbies_Button()
    {
       waitForElementAndClick(click_other_hobbies);
    }
    public void click_submit_Button()
    {
     waitForElementAndClick(click_submit_button);
    }
    public void wait_For_Alert_For_Male_And_Validate()
    {
       // WebElement practice_form_submission_message_name = driver.findElement(By.xpath("/html//div[@id='example-modal-sizes-title-lg']"));
        waitFor(submission_Thanks_Text);
        Assert.assertEquals(submission_Thanks_Text.getText(), "Thanks for submitting the form");
       // WebElement practice_form_submission_label_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Label']"));
        waitFor(submission_lalel_text);
        Assert.assertEquals(submission_lalel_text.getText(), "Label");
        //WebElement practice_form_submission_value_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Values']"));
        waitFor(submission_value_text);
        Assert.assertEquals(submission_value_text.getText(), "Values");
        //WebElement practice_form_submission_st_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Name']"));
        waitFor(submission_name_text);
        Assert.assertEquals(submission_name_text.getText(), "Student Name");
       // WebElement practice_form_submission_st_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Email']"));
        waitFor(submission_email_text);
        Assert.assertEquals(submission_email_text.getText(), "Student Email");
        //WebElement practice_form_submission_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Gender']"));
        waitFor(submission_gender_text);
        Assert.assertEquals( submission_gender_text.getText(), "Gender");
        //WebElement practice_form_submission_mobile = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Mobile']"));
        waitFor(submission_mobile_text);
        Assert.assertEquals( submission_mobile_text.getText(), "Mobile");
        //WebElement practice_form_submission_Date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Date of Birth']"));
        waitFor(submission_date_text);
        Assert.assertEquals( submission_date_text.getText(), "Date of Birth");
        //WebElement practice_form_submission_Subjects = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Subjects']"));
        waitFor(submission_subject_text);
        Assert.assertEquals(submission_subject_text.getText(), "Subjects");
        //WebElement practice_form_submission_Hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Hobbies']"));
        waitFor(submission_hobbies_text);
        Assert.assertEquals(submission_hobbies_text.getText(), "Hobbies");
        //WebElement practice_form_submission_Picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Picture']"));
        waitFor(submission_picture_text);
        Assert.assertEquals(submission_picture_text.getText(), "Picture");
        //WebElement practice_form_submission_Address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Address']"));
        waitFor(submission_address_text);
        Assert.assertEquals(submission_address_text.getText(), "Address");
        //WebElement practice_form_submission_State_and_City = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='State and City']"));
        waitFor(submission_state_and_city_text);
        Assert.assertEquals(submission_state_and_city_text.getText(), "State and City");
        //WebElement practice_form_submission_Add_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Valentin Kolev']"));
        waitFor(submission_name_answer);
        Assert.assertEquals( submission_name_answer.getText(),"Valentin Kolev" );
        //WebElement practice_form_submission_Add_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='valyo300047@gmail.com']"));
        waitFor(submission_email_answer);
        Assert.assertEquals(submission_email_answer.getText(),"valyo300047@gmail.com" );
        //WebElement practice_form_submission_Add_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Male']"));
        waitFor(submission_gender_male_answer);
        Assert.assertEquals(submission_gender_male_answer.getText(),"Male");
        //WebElement practice_form_submission_Add_phone = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='0893531524']"));
        waitFor(submission_mobile_answer);
        Assert.assertEquals(submission_mobile_answer.getText(),"0893531524");
       // WebElement practice_form_submission_Add_date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='01 September,2024']"));
        waitFor(submission_date_answer);
        Assert.assertEquals(submission_date_answer.getText(),"01 September,2024");
        //WebElement practice_form_submission_Add_subject = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Maths']"));
        waitFor(submission_subject_answer);
        Assert.assertEquals(submission_subject_answer.getText(),"Maths");
       // WebElement practice_form_submission_Add_hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Sports']"));
        waitFor(submission_hobbie_male_answer);
        Assert.assertEquals(submission_hobbie_male_answer.getText(),"Sports");
        //WebElement practice_form_submission_Add_picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='20240916_121800.jpg']"));
        waitFor(submission_picture_answer);
        Assert.assertEquals( submission_picture_answer.getText(),"20240916_121800.jpg");
        //WebElement practice_form_submission_Add_address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Burgas']"));
        waitFor(submission_address_answer);
        Assert.assertEquals( submission_address_answer.getText(),"Burgas");
        //WebElement practice_form_submission_Add_state = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='NCR Delhi']"));
        waitFor(submission_state_and_city_answer);
        Assert.assertEquals(submission_state_and_city_answer.getText(),"NCR Delhi");
    }
    public void wait_For_Alert_For_Female_And_Validate()
    {
// WebElement practice_form_submission_message_name = driver.findElement(By.xpath("/html//div[@id='example-modal-sizes-title-lg']"));
        waitFor(submission_Thanks_Text);
        Assert.assertEquals(submission_Thanks_Text.getText(), "Thanks for submitting the form");
        // WebElement practice_form_submission_label_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Label']"));
        waitFor(submission_lalel_text);
        Assert.assertEquals(submission_lalel_text.getText(), "Label");
        //WebElement practice_form_submission_value_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Values']"));
        waitFor(submission_value_text);
        Assert.assertEquals(submission_value_text.getText(), "Values");
        //WebElement practice_form_submission_st_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Name']"));
        waitFor(submission_name_text);
        Assert.assertEquals(submission_name_text.getText(), "Student Name");
        // WebElement practice_form_submission_st_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Email']"));
        waitFor(submission_email_text);
        Assert.assertEquals(submission_email_text.getText(), "Student Email");
        //WebElement practice_form_submission_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Gender']"));
        waitFor(submission_gender_text);
        Assert.assertEquals( submission_gender_text.getText(), "Gender");
        //WebElement practice_form_submission_mobile = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Mobile']"));
        waitFor(submission_mobile_text);
        Assert.assertEquals( submission_mobile_text.getText(), "Mobile");
        //WebElement practice_form_submission_Date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Date of Birth']"));
        waitFor(submission_date_text);
        Assert.assertEquals( submission_date_text.getText(), "Date of Birth");
        //WebElement practice_form_submission_Subjects = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Subjects']"));
        waitFor(submission_subject_text);
        Assert.assertEquals(submission_subject_text.getText(), "Subjects");
        //WebElement practice_form_submission_Hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Hobbies']"));
        waitFor(submission_hobbies_text);
        Assert.assertEquals(submission_hobbies_text.getText(), "Hobbies");
        //WebElement practice_form_submission_Picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Picture']"));
        waitFor(submission_picture_text);
        Assert.assertEquals(submission_picture_text.getText(), "Picture");
        //WebElement practice_form_submission_Address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Address']"));
        waitFor(submission_address_text);
        Assert.assertEquals(submission_address_text.getText(), "Address");
        //WebElement practice_form_submission_State_and_City = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='State and City']"));
        waitFor(submission_state_and_city_text);
        Assert.assertEquals(submission_state_and_city_text.getText(), "State and City");
        //WebElement practice_form_submission_Add_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Valentin Kolev']"));
        waitFor(submission_name_answer);
        Assert.assertEquals( submission_name_answer.getText(),"Valentin Kolev" );
        //WebElement practice_form_submission_Add_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='valyo300047@gmail.com']"));
        waitFor(submission_email_answer);
        Assert.assertEquals(submission_email_answer.getText(),"valyo300047@gmail.com" );
        //WebElement practice_form_submission_Add_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Male']"));
        waitFor(submission_gender_female_answer);
        Assert.assertEquals(submission_gender_female_answer.getText(),"Female");
        //WebElement practice_form_submission_Add_phone = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='0893531524']"));
        waitFor(submission_mobile_answer);
        Assert.assertEquals(submission_mobile_answer.getText(),"0893531524");
        // WebElement practice_form_submission_Add_date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='01 September,2024']"));
        waitFor(submission_date_answer);
        Assert.assertEquals(submission_date_answer.getText(),"01 September,2024");
        //WebElement practice_form_submission_Add_subject = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Maths']"));
        waitFor(submission_subject_answer);
        Assert.assertEquals(submission_subject_answer.getText(),"Maths");
        // WebElement practice_form_submission_Add_hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Sports']"));
        waitFor(submission_hobbie_female_answer);
        Assert.assertEquals(submission_hobbie_female_answer.getText(),"Reading");
        //WebElement practice_form_submission_Add_picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='20240916_121800.jpg']"));
        waitFor(submission_picture_answer);
        Assert.assertEquals( submission_picture_answer.getText(),"20240916_121800.jpg");
        //WebElement practice_form_submission_Add_address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Burgas']"));
        waitFor(submission_address_answer);
        Assert.assertEquals( submission_address_answer.getText(),"Burgas");
        //WebElement practice_form_submission_Add_state = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='NCR Delhi']"));
        waitFor(submission_state_and_city_answer);
        Assert.assertEquals(submission_state_and_city_answer.getText(),"NCR Delhi");
    }
    public void wait_For_Alert_For_Other_And_Validate()
    {
// WebElement practice_form_submission_message_name = driver.findElement(By.xpath("/html//div[@id='example-modal-sizes-title-lg']"));
        waitFor(submission_Thanks_Text);
        Assert.assertEquals(submission_Thanks_Text.getText(), "Thanks for submitting the form");
        // WebElement practice_form_submission_label_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Label']"));
        waitFor(submission_lalel_text);
        Assert.assertEquals(submission_lalel_text.getText(), "Label");
        //WebElement practice_form_submission_value_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//th[.='Values']"));
        waitFor(submission_value_text);
        Assert.assertEquals(submission_value_text.getText(), "Values");
        //WebElement practice_form_submission_st_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Name']"));
        waitFor(submission_name_text);
        Assert.assertEquals(submission_name_text.getText(), "Student Name");
        // WebElement practice_form_submission_st_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Student Email']"));
        waitFor(submission_email_text);
        Assert.assertEquals(submission_email_text.getText(), "Student Email");
        //WebElement practice_form_submission_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Gender']"));
        waitFor(submission_gender_text);
        Assert.assertEquals( submission_gender_text.getText(), "Gender");
        //WebElement practice_form_submission_mobile = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Mobile']"));
        waitFor(submission_mobile_text);
        Assert.assertEquals( submission_mobile_text.getText(), "Mobile");
        //WebElement practice_form_submission_Date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Date of Birth']"));
        waitFor(submission_date_text);
        Assert.assertEquals( submission_date_text.getText(), "Date of Birth");
        //WebElement practice_form_submission_Subjects = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Subjects']"));
        waitFor(submission_subject_text);
        Assert.assertEquals(submission_subject_text.getText(), "Subjects");
        //WebElement practice_form_submission_Hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Hobbies']"));
        waitFor(submission_hobbies_text);
        Assert.assertEquals(submission_hobbies_text.getText(), "Hobbies");
        //WebElement practice_form_submission_Picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Picture']"));
        waitFor(submission_picture_text);
        Assert.assertEquals(submission_picture_text.getText(), "Picture");
        //WebElement practice_form_submission_Address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Address']"));
        waitFor(submission_address_text);
        Assert.assertEquals(submission_address_text.getText(), "Address");
        //WebElement practice_form_submission_State_and_City = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='State and City']"));
        waitFor(submission_state_and_city_text);
        Assert.assertEquals(submission_state_and_city_text.getText(), "State and City");
        //WebElement practice_form_submission_Add_name = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Valentin Kolev']"));
        waitFor(submission_name_answer);
        Assert.assertEquals( submission_name_answer.getText(),"Valentin Kolev" );
        //WebElement practice_form_submission_Add_email = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='valyo300047@gmail.com']"));
        waitFor(submission_email_answer);
        Assert.assertEquals(submission_email_answer.getText(),"valyo300047@gmail.com" );
        //WebElement practice_form_submission_Add_gender = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Male']"));
        waitFor(submission_gender_other_answer);
        Assert.assertEquals(submission_gender_other_answer.getText(),"Other");
        //WebElement practice_form_submission_Add_phone = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='0893531524']"));
        waitFor(submission_mobile_answer);
        Assert.assertEquals(submission_mobile_answer.getText(),"0893531524");
        // WebElement practice_form_submission_Add_date = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='01 September,2024']"));
        waitFor(submission_date_answer);
        Assert.assertEquals(submission_date_answer.getText(),"01 September,2024");
        //WebElement practice_form_submission_Add_subject = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Maths']"));
        waitFor(submission_subject_answer);
        Assert.assertEquals(submission_subject_answer.getText(),"Maths");
        // WebElement practice_form_submission_Add_hobbies = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Sports']"));
        waitFor(submission_hobbie_other_answer);
        Assert.assertEquals(submission_hobbie_other_answer.getText(),"Music");
        //WebElement practice_form_submission_Add_picture = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='20240916_121800.jpg']"));
        waitFor(submission_picture_answer);
        Assert.assertEquals( submission_picture_answer.getText(),"20240916_121800.jpg");
        //WebElement practice_form_submission_Add_address = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='Burgas']"));
        waitFor(submission_address_answer);
        Assert.assertEquals( submission_address_answer.getText(),"Burgas");
        //WebElement practice_form_submission_Add_state = driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//table//td[.='NCR Delhi']"));
        waitFor(submission_state_and_city_answer);
        Assert.assertEquals(submission_state_and_city_answer.getText(),"NCR Delhi");
    }

}
