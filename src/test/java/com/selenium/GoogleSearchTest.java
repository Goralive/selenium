package com.selenium;
//TODO make test all run, add Strings to properties, try to add URL strings to pages
import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;
import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends WebDriverTestBase {

  private String getGoogle = "https://www.google.com/";
  private String searchText = "Selenium";

    @Test
    public void searchSelenium() {

        driver.get(getGoogle);
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.search(searchText);
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertTrue(googleResultPage.getLink().getText().contains(searchText));

    }
}
