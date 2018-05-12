package com.selenium.gmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.WebDriverTestBase;
import selenium.pages.gmail.GmailLoginPage;
import selenium.pages.gmail.GmailUserPage;


public class LoginToGmailTest extends WebDriverTestBase {
    private String urlGmail = "http://gmail.com";
    private String emailForTest = "jacksonford292@gmail.com";
    private String passwordForTest = "SuperSecret123";
    private String verifyTitle = "Gmail";


    @Test
    public void gmailLogIn() {

        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);
        gmailLoginPage.userEmailPassword(emailForTest, passwordForTest,urlGmail);
    }

    @Test()
    public void verifyGmail() {
        Assert.assertEquals(driver.getTitle(), verifyTitle);
    }

    @Test
    public void verifyLoginGmail() {

        GmailUserPage gmailUserPage = new GmailUserPage(driver);
        Assert.assertTrue(gmailUserPage.checkPage(emailForTest));

    }
}





