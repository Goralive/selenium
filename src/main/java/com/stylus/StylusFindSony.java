package com.stylus;

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

    private By searchField = By.xpath("//div[@id='head-search']//input[@type='text']");
}

