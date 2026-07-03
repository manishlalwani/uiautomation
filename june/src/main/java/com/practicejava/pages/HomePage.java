package com.practicejava.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        // this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
