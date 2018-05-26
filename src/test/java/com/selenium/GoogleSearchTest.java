package com.selenium;

import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends WebDriverTestBase {

    //TODO 1. Verify google page 2. Add search text and verify search text. 3. Redirect to the page and verify searched text
    //TODO make test all run, add Strings to properties, try to add URL strings to pages, cssSelector

    public GoogleSearchPage googleSearchPage;
    public GoogleResultPage googleResultPage;

    @BeforeClass
    public void setup() {
        googleSearchPage = new GoogleSearchPage(driver);
    }

    @Test
    public void verifyGooglePage() {
        googleSearchPage.openGooglePage();
        assertTrue(googleSearchPage.isAt(), "Locator is wrong, TimeOut exception");
    }

    @Test
    public void searchFunctional() {
        googleSearchPage.openGooglePage();
        googleSearchPage.submitSearchField();
    }

    @Test
    public void verifySearchedText() {
        googleResultPage = new GoogleResultPage(driver);
        googleSearchPage.openGooglePage();
        googleSearchPage.submitSearchField();
        assertTrue(googleResultPage.checkIsElementIsPresent());
        googleResultPage.clickOnSearchElement();
        assertTrue(googleResultPage.getTitleSearchedElement(googleResultPage.getTextFromSearchedItem));
    }
}
