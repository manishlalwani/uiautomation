package com.practicejava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomePage extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

    private By xpathAccount = By.xpath("//button[text()='Account']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        logger.info("Getting Page Title");
        return driver.getTitle();
    }

    public String getAccountButtonText() {
        
        return getText(xpathAccount);
    }

}
