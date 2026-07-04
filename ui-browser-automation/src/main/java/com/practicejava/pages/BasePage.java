package com.practicejava.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.practicejava.framework.FrameworkConstants;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.DURATION_TIME));
    }

    

    protected void write(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
        logger.info("Writing Data on Element ",element);
    }

    protected void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        logger.info("Clicking on Element ",element);
    }

   

    protected WebElement find(By locator) {
        logger.debug("Finding element: {}", locator);
    
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }
    
    protected String getText(By locator) {
        logger.info("Getting text from: {}", locator);
        return find(locator).getText();
    }

}
