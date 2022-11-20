package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In the class will be able to pass pre- and post- conditions to each scenario/
 */
public class Hooks {
    @Before(order = 1)
    public void setUpScenario() {
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 2)
    public void setUpScenarioForLogins() {
        System.out.println("===this will only apply to scenarios with @login tag");
    }

    @Before(value = "@db", order = 0)
    public void setUpForDataBaseScenarios() {
        System.out.println("===this will only apply to scenarios with @db tag");
    }

    @After
    public void tearDownScenario(){
        System.out.println("===closing browser using cucumber @After");
        System.out.println("===scenario ended / Take screenshot if failed!");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("------>applying setup using @BeforeStep");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("------>applying tearDown using @AfterStep");
    }
}
