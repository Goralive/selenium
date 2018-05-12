package com.selenium.stylus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StylusFindSony {

    private WebDriver driver;
    private WebDriverWait wait;

    public StylusFindSony(WebDriver driver) {
        this.driver = driver;
    }

    public StylusFindSony(WebDriverWait wait) {
        this.wait = wait;
    }

    private By searchField = By.xpath(".//div[@id='head-search']//input[@type='text']");
    private By itemFromList = By.xpath(".//div[@id='search-list']/ul/li[3]");

    public StylusFindSony addText(String search) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(searchField).submit();

        return this;
    }
}

