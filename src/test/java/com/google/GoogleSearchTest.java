package com.google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    private String getGoogle = "https://www.google.com/";
    private String searchText = "Selenium";
    private String searchField = ".//*[@id='lst-ib']";
    private WebDriver webDriver;

    @BeforeClass
    public void setupGoogleDrive() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (webDriver != null) {
            webDriver.close();
        }
    }

    @Test
    public void searchSelenium() {
        webDriver.get(getGoogle);
        webDriver.findElement(By.xpath(searchField)).sendKeys(searchText);
        webDriver.findElement(By.xpath(searchField)).submit();

        Assert.assertTrue(webDriver.getTitle().contains(searchText));
    }


}
