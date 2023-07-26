package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(linkText = "Create new account")
    public WebElement create_account;
    @FindBy(name = "firstname")
    public WebElement firstname;
    @FindBy(name = "lastname")
    public WebElement lastname;
    @FindBy(name = "reg_email__")
    public WebElement reg_email;
    @FindBy(name = "reg_email_confirmation__")
    public WebElement reg_email_confirmation;
    @FindBy(id="password_step_input")
    public WebElement password_step;
    @FindBy(id="month")
    public WebElement month;
    @FindBy(name = "birthday_day")
    public WebElement birthday_day;
    @FindBy(name = "birthday_year")
    public WebElement birthday_year;

    @FindBy(className="_58mt")
    public WebElement gender_button;
    @FindBy(name="websubmit")
    public WebElement sign_up;


    public LoginPage(){
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }
}
