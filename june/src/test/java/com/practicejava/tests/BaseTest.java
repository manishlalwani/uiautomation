package com.practicejava.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practicejava.drivers.DriverFactory;

public class BaseTest {

    protected WebDriver driver;
    private DriverFactory factory;

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Test");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.SEVERE);
        factory = new DriverFactory();
        driver = factory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
        System.out.println("Test Case Completed");
    }
}
