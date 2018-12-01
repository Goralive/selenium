package com.selenium;

import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.GmailLoginPage;
import selenium.pages.GmailUserPage;

import static org.testng.Assert.assertTrue;

//TODO 1. Login to the mail 2. Login to the gmail. 3. Login to the gmail and verify your creds

public class LoginToGmailTest extends WebDriverTestBase {

    public GmailLoginPage gmailLoginPage;
    public GmailUserPage gmailUserPage;

  @BeforeClass
  public void setupObjects(){
       gmailUserPage = new GmailUserPage(driver);
       gmailLoginPage = new GmailLoginPage(driver);
  }


    @Test
    public void verifyGmailLogInPage() {
        gmailLoginPage.openGmailPage();
        assertTrue(gmailLoginPage.isAtLoginPage());
    }


    @Test
    public void verifyLoginGmail() {
         assertTrue(gmailUserPage.checkPage());

    }
}





