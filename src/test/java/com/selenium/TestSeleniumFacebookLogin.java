package com.selenium;

import org.testng.annotations.*;
import selenium.core.WebDriverTestBase;
import selenium.pages.SeleniumFacebookLogInPage;
import static org.testng.Assert.assertTrue;

public class TestSeleniumFacebookLogin extends WebDriverTestBase {

    public SeleniumFacebookLogInPage seleniumFacebookLogin;

    @BeforeClass
    public void setupObjects (){
        seleniumFacebookLogin = new SeleniumFacebookLogInPage(driver);
    }

    @Test (priority = 1)
    public void verifyFacebookPageIsOpened (){
      seleniumFacebookLogin.openFacebookPage();
      assertTrue(seleniumFacebookLogin.isAtLoginPage());
    }

    @Test (priority = 2)
    public void logToProfile () {
        seleniumFacebookLogin.enterEmailToInputField();
        seleniumFacebookLogin.enterPassToPassField();
        seleniumFacebookLogin.clickOnLogInButton();
    }
    @Test (priority = 3) //Change creds to pass test for facebook in the recources/ test.properties
    public void verifyProfileIsOpened (){
        assertTrue(seleniumFacebookLogin.checkLogInToDisabledProfile());
    }
}
