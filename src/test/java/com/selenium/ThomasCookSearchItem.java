package com.selenium;

import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.ThomasCookHomePage;
import selenium.pages.ThomasCookResultPage;

public class ThomasCookSearchItem extends WebDriverTestBase {

    @Test
    public void findResultsThomasCook (){
        ThomasCookHomePage tchp = new  ThomasCookHomePage(driver);
        driver.get("https://www.thomascook.com/");
        tchp.clickSearchButton();
        ThomasCookResultPage tcrp = new ThomasCookResultPage(driver);
        tcrp.clickOnDetailsButton();

    }
}
