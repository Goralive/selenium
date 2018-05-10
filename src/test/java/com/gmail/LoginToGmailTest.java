package com.gmail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginToGmailTest {
    private String urlGmail = "http://gmail.com";
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginToGmail loginToGmail = new LoginToGmail(driver);
    private String emailForTest = "jacksonford292@gmail.com";
    private String passwordForTest = "SuperSecret123";
    private String verifyTitle = "Gmail";


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(urlGmail);
        loginToGmail = new LoginToGmail(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void verifyGmail() {
        Assert.assertEquals(driver.getTitle(), verifyTitle);
    }

    @Test
    public void logInWithAccount() {
        loginToGmail.emailPage(emailForTest, passwordForTest);
    }

    @Test
    public void verifyMailAccount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@id=':i']")));
        Assert.assertTrue(driver.getTitle().contains(emailForTest));
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}

