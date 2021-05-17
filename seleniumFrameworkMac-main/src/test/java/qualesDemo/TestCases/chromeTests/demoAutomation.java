package qualesDemo.TestCases.chromeTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import qualesDemo.DriverFactory.chrome;


public class demoAutomation {
    public WebDriver driver;
    public String baseURL = "";


    @Test
    public void login() {
        //Open Browser

        System.out.println("Opening chrome browser");

        //Choose Chrome
        driver = chrome.open();

        driver.manage().window().maximize();


    }


    }


