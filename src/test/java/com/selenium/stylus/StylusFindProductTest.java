package com.selenium.stylus;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.stylus.StylusHomePage;
import selenium.pages.stylus.StylusProductPage;
import selenium.pages.stylus.StylusResultPage;


public class StylusFindProductTest extends WebDriverTestBase {


    private String searchItem = "iPhone X";
    private String chromeUrlStylus = "https://stylus.ua/";


    @Test(priority = 1)
    public void openUrlStylus() {
        StylusHomePage stylusHomePage = new StylusHomePage(driver);
        stylusHomePage.openMainPage(chromeUrlStylus, searchItem);

    }


    @Test(priority = 2)
    public void verifyCorrectMobile() {
        StylusResultPage stylusResultPage = new StylusResultPage(driver);
        Assert.assertTrue(stylusResultPage.verifyModel(searchItem));

    }

    @Test(priority = 3)
    public void redirectToProductPageAndCheck() {
        StylusProductPage stylusProductPage = new StylusProductPage(driver);
        Assert.assertTrue(stylusProductPage.checkProduct(searchItem));

    }

}
