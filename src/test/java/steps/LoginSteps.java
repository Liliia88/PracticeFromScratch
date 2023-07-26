package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        //sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
       // sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));
    }
    @When("user click on creat new account button")
    public void user_click_on_creat_new_account_button() {
      click(login.create_account);
    }

    @When("user enters credentials to register")
    public void user_enters_credentials_to_register() {
        sendText(login.firstname, ConfigReader.getPropertyValue("firstname"));
        sendText(login.lastname, ConfigReader.getPropertyValue("lastname"));
        sendText(login.reg_email, ConfigReader.getPropertyValue("email"));
        sendText(login.reg_email_confirmation, ConfigReader.getPropertyValue("email"));
        sendText(login.password_step, ConfigReader.getPropertyValue("password"));
        selectDropdown(login.month, "Jan");
        selectDropdown(login.birthday_day, "4");
        selectDropdown(login.birthday_year, "1988");
        click(login.gender_button);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.sign_up);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        if(dashboard.welcomeMessage.isDisplayed()){
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test is failed");
        }
    }


}
