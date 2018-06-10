package com.selenium;

import io.qameta.allure.Step;
import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;

import static org.testng.Assert.assertTrue;
//TODO Desirable Push -> GitHub -> Hook -> Jenkins Build Deploy Hook -> Job UI -> HUB
//TODO make test all run, add Strings to properties, try to add URL strings to pages, cssSelector, BBD, method coverage 100% :-)

public class GoogleSearchTest extends WebDriverTestBase {

    public GoogleSearchPage googleSearchPage;
    public GoogleResultPage googleResultPage;

    @BeforeClass
    public void setupObjects() {
        googleSearchPage = new GoogleSearchPage(driver);
        googleResultPage = new GoogleResultPage(driver);
    }
    @Step("Verify google")
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

        googleSearchPage.openGooglePage();
        googleSearchPage.sendKeysSearchField();
        googleSearchPage.submitSearchfield();
        assertTrue(googleResultPage.checkIsElementIsPresent());
        googleResultPage.clickOnSearchElement();
        assertTrue(googleResultPage.getTitleSearchedElement(googleResultPage.getTextFromSearchedItem));
    }
}
