package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.StylusHomePage;
import selenium.pages.StylusProductPage;
import selenium.pages.StylusResultPage;


public class StylusFindProductTest extends WebDriverTestBase {


    private String searchItem = "iPhone X";
    private String chromeUrlStylus = "https://stylus.ua/";


    @Test (priority = 1)
    public void openUrlStylus() {
        driver.get(chromeUrlStylus);
        StylusHomePage stylusHomePage = new StylusHomePage(driver);
        stylusHomePage.openMainPage(searchItem);

    }

    @Test (priority = 2)
    public void verifyCorrectMobile() {
        StylusResultPage stylusResultPage = new StylusResultPage(driver);
        Assert.assertTrue(stylusResultPage.verifyModel(searchItem));

    }

    @Test (priority = 3)
    public void redirectToProductPageAndCheck() {
        StylusProductPage stylusProductPage = new StylusProductPage(driver);
        Assert.assertTrue(stylusProductPage.checkProduct(searchItem));

    }

}
