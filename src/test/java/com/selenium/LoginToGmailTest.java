package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.GmailLoginPage;
import selenium.pages.GmailUserPage;


//TODO 1. Login to the mail 2. Login to the gmail. 3. Login to the gmail and verify your creds

public class LoginToGmailTest extends WebDriverTestBase {

    private String emailForTest = "jacksonford292@gmail.com";
    private String passwordForTest = "SuperSecret123";
    private String urlGmail = "http://gmail.com";


    @Test
    public void gmailLogIn() {

        driver.get(urlGmail);
        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);
        Assert.assertTrue(gmailLoginPage.userEmailPassword(emailForTest, passwordForTest));
    }


    @Test
    public void verifyLoginGmail() {
        GmailUserPage gmailUserPage = new GmailUserPage(driver);
        Assert.assertTrue(gmailUserPage.checkPage(emailForTest));

    }
}





