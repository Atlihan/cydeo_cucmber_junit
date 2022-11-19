package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn_StepDefinitions {
    @When("user enters Librarian user name")
    public void user_enters_librarian_user_name() {
        System.out.println("User enters Librarian user name");
    }
    @When("user enters Librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters Librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");

        //TODO:
    }

}