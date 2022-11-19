package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

  /*  Creating a private constructor, so we are closing
   access to the object if the class from outside class */
    private Driver() {
    }
    /*
    We make webDriver private because we want to close access from outside the class.
    We make it static because we will use it in  static method
     */
    private static WebDriver driver;

    /*
    Create a reusable utility method which will return same driver instance
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        return driver;
    }
    /*
    This method will make sure that our driver value is always "null" after using quit() method
     */
    public static void closeDriver(){

        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}
