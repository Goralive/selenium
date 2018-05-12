package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.GmailLoginPage;
import selenium.pages.GmailUserPage;


public class LoginToGmailTest extends WebDriverTestBase {
    private String urlGmail = "http://gmail.com";
    private String emailForTest = "jacksonford292@gmail.com";
    private String passwordForTest = "SuperSecret123";



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





