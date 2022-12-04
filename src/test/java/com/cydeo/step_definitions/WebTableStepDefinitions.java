package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTableStepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters user name {string}")
    public void user_enters_user_name(String string) {
        webTableLoginPage.inputUserName.sendKeys(string);
    }

    @When("user enters user password {string}")
    public void user_enters_user_password(String string) {
        webTableLoginPage.inputUserPassword.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");

    }

    @When("user enters user name {string} password {string} and logins")
    public void userEntersUserNamePasswordAndLogins(String username, String pw) {
    /*
        webTableLoginPage.inputUserName.sendKeys(userName);
         webTableLoginPage.inputUserPassword.sendKeys(password);
        webTableLoginPage.loginButton.click();
     */
        webTableLoginPage.login(username, pw);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

     //   webTableLoginPage.inputUserName.sendKeys(credentials.get("username"));
     //   webTableLoginPage.inputUserPassword.sendKeys(credentials.get("password"));
     //   webTableLoginPage.loginButton.click();

        //Instead of three methods above, we can call our login utility and pass values from Map
        webTableLoginPage.login(credentials.get("username"), credentials.get("password") );
    }

}
