package com.selenium;
//TODO make test all run, add Strings to properties, try to add URL strings to pages, cssSelector
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends WebDriverTestBase {

    //TODO 1. Verify google page 2. Add search text and verify search text. 3. Redirect to the page and verify searched text
   //private GoogleSearchPage googleSearchPage;

    @Test
    public void verifyGooglePage() {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openGooglePage();
        assertTrue(googleSearchPage.isAt(),"Locator is wrong, TimeOut exception");
    }
    @Test
    public void searchFunctional () {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openGooglePage();
        googleSearchPage.submitSearchField();
    }
//    @Test
//    public void
}
