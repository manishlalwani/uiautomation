package com.practicejava.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practicejava.drivers.DriverFactory;
import com.practicejava.framework.FrameworkConstants;

public class BaseTest {

    protected static WebDriver driver;
    // private static DriverFactory factory;

    @BeforeMethod
    public static void setUpDriver() {
        driver = DriverFactory.getDriver();
        if (driver != null) {
            driver.get(FrameworkConstants.APP_URL);
        } else {
            throw new RuntimeException("Driver failed to initialize!");
        }

    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
        System.out.println("Test Case Completed");
    }
}
