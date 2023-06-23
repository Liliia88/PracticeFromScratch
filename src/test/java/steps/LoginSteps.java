package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginButton);
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
