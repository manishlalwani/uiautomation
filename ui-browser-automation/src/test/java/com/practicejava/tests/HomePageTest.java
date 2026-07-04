package com.practicejava.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practicejava.framework.FrameworkConstants;
import com.practicejava.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitleTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        String title = homePage.getTitle();
        Assert.assertEquals(title, FrameworkConstants.HOME_PAGE_TITLE);

    }

    @Test
    public void verifySearchButtonTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        String title = homePage.getAccountButtonText();
        Assert.assertEquals(title, "Account");

    }

}
