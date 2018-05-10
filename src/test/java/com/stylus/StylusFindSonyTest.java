package com.stylus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StylusFindSonyTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private String searchItem = "Sony Z2";
    private String chromeUrlStylus = "https://stylus.ua/";

    @BeforeTest
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(chromeUrlStylus);
    }
    @Test
    public void openUrlStylus (){
        Assert.assertEquals(driver.getCurrentUrl(),chromeUrlStylus);
    }
    @AfterTest
    public void tearDown (){
        driver.quit();
    }
}
