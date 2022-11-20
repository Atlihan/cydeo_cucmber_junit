package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    }


    @When("user enters student user name")
    public void userEntersStudentUserName() {
        System.out.println("User enters student user name");
    }

    @And("user enters student user password")
    public void userEntersStudentUserPassword() {
        System.out.println("user enters student user password");
    }

    @When("user enters admin user name")
    public void userEntersAdminUserName() {
        System.out.println("User enters admin user name");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLogInPage() {
        System.out.println("user is on the library login page");
    }
}
