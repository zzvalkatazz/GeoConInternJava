package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Practice_Form_PO;



public class Practice_form_Steps extends Base_PO {


    private Practice_Form_PO practice_form_po;
    public Practice_form_Steps(Practice_Form_PO practice_form_po)
    {
        this.practice_form_po=practice_form_po;
    }
    //private WebDriver driver = getDriver();



    @Given("I go to practice form page")
    public void i_go_to_practice_form_page() {
       // driver.get("https://demoqa.com/automation-practice-form");
        practice_form_po.navigate_To_URL_Practice_Form_Page();
    }
    @When("I add my first Name {word}")
    public void i_add_my_first_name(String firstName) {
        //driver.findElement(By.xpath("/html//input[@id='firstName']")).sendKeys(firstName);
        practice_form_po.set_First_Name(firstName);
    }
    @And("I add my last Name {word}")
    public void i_add_my_last_name(String lastName) {
        practice_form_po.set_Last_Name(lastName);
    }
    @And("I add my email {string}")
    public void i_add_my_email(String email) {
        practice_form_po.set_Email(email);
    }
    @And("I add my mobile number {string}")
    public void i_add_my_mobile_number(String number) {
      practice_form_po.set_Mobile(number);
    }
    @And("I add my date of birth")
    public void i_add_my_date_of_birth() {
//        driver.findElement(By.xpath("/html//input[@id='dateOfBirthInput']")).sendKeys(birth);
       // driver.findElement(By.xpath("/html//input[@id='dateOfBirthInput']")).click();
        //driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[@class='react-datepicker__tab-loop']/div[@class='react-datepicker-popper']//div[@role='listbox']/div[1]/div[1]")).click();
        practice_form_po.set_Birth_Date();
    }
    @And("I add my subject")
    public void i_add_my_subject() {
     //   try {
    //        Thread.sleep(3000);
     //   } catch (InterruptedException e) {
     //       Thread.currentThread().interrupt();
    //    }
    //    WebElement webElement = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div[1]"));
    //    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    //    wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    //    new Actions(driver)
     //           .sendKeys(webElement, "Maths" + Keys.ENTER)
    //            .perform();
    //    WebElement webElement1 = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div[2]"));
     //   wait.until(ExpectedConditions.elementToBeClickable(webElement1)).click();
        practice_form_po.set_Subject();

    }
      @When("I click to choose picture")
    public void i_click_to_choose_picture() {
         // practice_form_po.set_Picture();
    }
    @Then("I must see picture file")
    public void i_must_see_picture_file() {
        // Locate the file upload input field
       practice_form_po.set_Picture_Second();
    }


    @When("I add my address {string}")
    public void i_add_my_address(String currentAddress){
      // driver.findElement(By.xpath("/html//textarea[@id='currentAddress']")).sendKeys(currentAddress);
        practice_form_po.set_Adress(currentAddress);

    }
    @And("I click to add state")
    public void i_click_to_add_state() {
       practice_form_po.set_State();
    }
    @And("I click to add city")
    public void i_click_to_add_city() {
       // driver.findElement(By.xpath("//div[@id='city']/div/div[1]/div[.='Select City']")).sendKeys("Delhi");
        practice_form_po.set_City();
    }
    @When("I select the gender male")
    public void i_select_the_gender_male() {
       // driver.findElement(By.xpath("//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[1]/label")).click();
        practice_form_po.click_Male_Button();
    }
    @And("I select hobbies for him")
    public void i_select_hobbies_for_him() {
       // driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[1]/label")).click();
        practice_form_po.click_Male_Hobbies_Button();
    }
    @When("I select the gender female")
    public void i_select_the_gender_female() {
       // driver.findElement(By.xpath("//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[2]/label")).click();
        practice_form_po.click_Female_Button();
    }

    @And("I select hobbies for her")
    public void i_select_hobbies_for_her() {
        //driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[2]/label")).click();
        practice_form_po.click_Female_Hobbies_Button();
    }
    @When("I select the gender other")
    public void i_select_the_gender_other() {
        //driver.findElement(By.xpath("//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[3]")).click();
        practice_form_po.click_Other_Button();
    }
    @And("I select hobbies for it")
    public void i_select_hobbies_for_it() {
        //driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']/div[3]/label")).click();
        practice_form_po.click_Other_Hobbies_Button();
    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {

       // driver.findElement(By.xpath("/html//button[@id='submit']")).click();
        practice_form_po.click_submit_Button();
    }
    @Then("I should receive success with male")
    public void i_should_receive_success_with_male() {
       practice_form_po.wait_For_Alert_For_Male_And_Validate();

    }
    @Then("I should receive success with female")
    public void i_should_receive_success_with_female() {
        practice_form_po.wait_For_Alert_For_Female_And_Validate();
    }
    @Then("I should receive success with other")
    public void i_should_receive_success_with_other() {
       practice_form_po.wait_For_Alert_For_Other_And_Validate();
    }
}
