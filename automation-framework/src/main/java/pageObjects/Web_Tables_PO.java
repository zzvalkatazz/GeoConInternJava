package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Variables;

public class Web_Tables_PO extends  Base_PO {

    private @FindBy(xpath = "/html//button[@id='addNewRecordButton']")
    WebElement click_add;

    private @FindBy(xpath = "/html//div[@id='registration-form-modal']")
    WebElement opening_registration_form;

    private @FindBy(xpath = "/html//input[@id='firstName']")
    WebElement submission_first_name;

    private @FindBy(xpath = "/html//input[@id='lastName']")
    WebElement submission_last_name;


    private @FindBy(xpath = "/html//input[@id='userEmail']")
    WebElement submission_email;

    private @FindBy(xpath = "/html//input[@id='age']")
    WebElement submission_age;

    private @FindBy(xpath = "/html//input[@id='salary']")
    WebElement submission_salary;

    private @FindBy(xpath = "/html//input[@id='department']")
    WebElement submission_department;

    private @FindBy(xpath = "/html//button[@id='submit']")
    WebElement click_submit;

    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[1]")
    WebElement first_name_answer;


    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[2]")
    WebElement last_name_answer;

    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[4]")
    WebElement email_answer;

    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[3]")
    WebElement age_answer;

    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[5]")
    WebElement salary_answer;

    private @FindBy(xpath = "//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div[4]/div[@role='row']/div[6]")
    WebElement department_answer;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [d='M864 256H736v-80c0-35\\.3-28\\.7-64-64-64H352c-35\\.3 0-64 28\\.7-64 64v80H160c-17\\.7 0-32 14\\.3-32 32v32c0 4\\.4 3\\.6 8 8 8h60\\.4l24\\.7 523c1\\.6 34\\.1 29\\.8 61 63\\.9 61h454c34\\.2 0 62\\.3-26\\.8 63\\.9-61l24\\.7-523H888c4\\.4 0 8-3\\.6 8-8v-32c0-17\\.7-14\\.3-32-32-32zm-200 0H360v-72h304v72z']")
    WebElement delete_button;


    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(1)")
    WebElement first_name_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(2)")
    WebElement last_name_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(3)")
    WebElement age_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(4)")
    WebElement email_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(5)")
    WebElement salary_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(1) [role] [role='gridcell']:nth-of-type(6)")
    WebElement department_deletion;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(1)")
    WebElement first_name_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(2)")
    WebElement last_name_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(3)")
    WebElement age_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(4)")
    WebElement email_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(5)")
    WebElement salary_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(6)")
    WebElement department_empty;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [data-toggle='tooltip']:nth-of-type(1) [stroke]")
    WebElement click_edit;

    private @FindBy(xpath = "/html//input[@id='salary']")
    WebElement increase_salary;

    private @FindBy(css = ".rt-tbody [role='rowgroup']:nth-of-type(3) [role] [role='gridcell']:nth-of-type(5)")
    WebElement submit_salary;

    private @FindBy(xpath = "/html//div[@id='registration-form-modal']")
    WebElement open_reg_form_again;

    private @FindBy(css = "[class='text-right col-md-2 col-sm-12'] .btn-primary")
    WebElement submit_button_again;

    public Web_Tables_PO() {
        super();
    }

    public void Navigate_To_Web_Tables_URL_Page() {
        navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL + "/webtables");
    }

    public void Click_On_Adding_Button() {
        waitForElementAndClick(click_add);
    }

    public void Opening_Registration_Form() {
        waitFor(opening_registration_form);
        Assert.assertEquals(opening_registration_form.getText(), "Registration Form");
    }

    public void set_first_name(String firstName) {
        sendKeys(submission_first_name, firstName);
    }

    public void set_last_name(String lastName) {
        sendKeys(submission_last_name, lastName);
    }

    public void set_email(String email) {
        sendKeys(submission_email, email);
    }

    public void set_age(String age) {
        sendKeys(submission_age, age);
    }

    public void set_salary(String salary) {
        sendKeys(submission_salary, salary);
    }

    public void set_department(String department) {
        sendKeys(submission_department, department);
    }

    public void click_On_Submission_Button() {
        waitForElementAndClick(click_submit);
    }

    public void set_new_person() {
        waitFor(first_name_answer);
        Assert.assertEquals(first_name_answer.getText(), "Valentin");
        waitFor(last_name_answer);
        Assert.assertEquals(last_name_answer.getText(), "Kolev");
        waitFor(age_answer);
        Assert.assertEquals(age_answer.getText(), "23");
        waitFor(email_answer);
        Assert.assertEquals(email_answer.getText(), "valyo300047@gmail.com");
        waitFor(salary_answer);
        Assert.assertEquals(salary_answer.getText(), "2700");
        waitFor(department_answer);
        Assert.assertEquals(department_answer.getText(), "GeoCon");
    }

    public void click_on_delete_button() {
        waitForElementAndClick(delete_button);
    }

    public void wait_for_deletion() {
        waitFor(first_name_deletion);
        Assert.assertEquals(first_name_deletion.getText(), "Alden");
        waitFor(last_name_deletion);
        Assert.assertEquals(last_name_deletion.getText(), "Cantrell");
        waitFor(age_deletion);
        Assert.assertEquals(age_deletion.getText(), "45");
        waitFor(email_answer);
        Assert.assertEquals(email_deletion.getText(),
                "alden@example.com");
        waitFor(salary_empty);
        Assert.assertEquals(salary_empty.getText(), " ");
        waitFor(department_empty);
        Assert.assertEquals(department_empty.getText(), " ");
        waitFor(first_name_empty);
        Assert.assertEquals(first_name_empty.getText(), " ");
        waitFor(last_name_empty);
        Assert.assertEquals(last_name_empty.getText(), " ");
        waitFor(age_empty);
        Assert.assertEquals(age_empty.getText(), " ");
        waitFor(email_empty);
        Assert.assertEquals(email_empty.getText(),
                " ");
        waitFor(salary_empty);
        Assert.assertEquals(salary_empty.getText(), " ");
        waitFor(department_empty);
        Assert.assertEquals(department_empty.getText(), " ");
    }

    public void wait_for_clicking_editing_button() {
        waitForElementAndClick(click_edit);
    }

    public void salary_increasing(String salary) {
         increase_salary.clear();
        sendKeys(increase_salary,salary);
    }

    public void wait_for_submiting_salary() {
        waitFor(submit_salary);
        Assert.assertEquals(submit_salary.getText(), "3000");
    }

    public void wait_for_registration_form() {
        waitFor(open_reg_form_again);
        Assert.assertEquals(open_reg_form_again.getText(), "Registration Form");
    }

    public void wait_for_submit_again()
    {
        waitForElementAndClick(submit_button_again);
    }


}
