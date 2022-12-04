package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUserName;

    @FindBy(name = "password")
    public WebElement inputUserPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * NO parameters
     * When we call this method it will directly login using
     * Username: Test
     * Password: Tester
:      */
    public void login (){
        this.inputUserName.sendKeys("Test");
        this.inputUserPassword.sendKeys("Tester");
        this.loginButton.click();

    }

    /**
     * This method will accept two arguments and log in
     * @param username
     * @param password
     */
    public void login(String username, String password){
        inputUserName.sendKeys(username);
        inputUserPassword.sendKeys(password);
        loginButton.click();
    }

    public void loginWithConfig(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputUserPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }
}
