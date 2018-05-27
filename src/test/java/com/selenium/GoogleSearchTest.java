package com.selenium;

import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends WebDriverTestBase {

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
        assertTrue(googleSearchPage.isAt());
    }

    @Test
    public void searchFunctional() {
        googleSearchPage.openGooglePage();
        googleSearchPage.sendKeysSearchField();
    }

    @Test
    public void verifySearchedText() {
        googleResultPage = new GoogleResultPage(driver);
        googleSearchPage.openGooglePage();
        googleSearchPage.sendKeysSearchField();
        googleSearchPage.submitSearchfield();
        assertTrue(googleResultPage.checkIsElementIsPresent());
        googleResultPage.clickOnSearchElement();
        assertTrue(googleResultPage.getTitleSearchedElement(googleResultPage.getTextFromSearchedItem));
    }
}
