package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.core.TestListener;
import selenium.core.WebDriverTestBase;

import java.io.File;
import java.io.IOException;

public class Wc3practice extends WebDriverTestBase {

    private String searchString = "OK!" ;
    By javaScriptButtonLocator = By.xpath("//body/button");
    WebElement javaScriptButton;

    By textLocator = By.cssSelector("#demo");
    WebElement text;


    @Test
    public void testToAlert (){

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframeResult");
        javaScriptButton = driver.findElement(javaScriptButtonLocator);
        text = driver.findElement(textLocator);
        javaScriptButton.click();
        Alert jsAlert = driver.switchTo().alert();
        jsAlert.accept();
        Assert.assertTrue(text.getText().contains(searchString));
    }

    @Test //TODO Доделать тест на JavaScript
    public void TestToDecline (){

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        String js = "document.querySelector(\"h2+button\").click()";
        WebElement element;
        element = (WebElement) ((JavascriptExecutor) driver).executeScript(js);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Assert.assertTrue(text.getText().equals("You pressed Cancel!"));
    }
}
