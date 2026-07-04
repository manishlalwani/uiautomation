package com.practicejava.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    // Private constructor to prevent unnecessary instantiation
    private DriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            // Setup logging suppression
            System.setProperty("webdriver.chrome.silentOutput", "true");
            
            // Configure Options
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            
            // Initialize Driver
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Important: reset to null so it can be re-initialized if needed
        }
    }
}
