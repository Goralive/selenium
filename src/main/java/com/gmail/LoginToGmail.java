package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToGmail {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginToGmail(WebDriver driver) {
        this.driver = driver;
    }

    private By loginEmail = By.xpath(".//input[@id='identifierId']");
    private By loginPassword = By.xpath(".//div[@id='password']//input");
    private By nextButtonEmail = By.xpath(".//div[@id='identifierNext']");
    private By nextButtonPassword = By.xpath(".//div[@id='passwordNext']/content");



    public LoginToGmail typeEmail(String email) {

        driver.findElement(loginEmail).clear();
        driver.findElement(loginEmail).sendKeys(email);
        return this;
    }

    public LoginToGmail typePassword(String password) {
            if (driver.findElement(loginPassword).isEnabled()) {
                driver.findElement(loginPassword).clear();
                driver.findElement(loginPassword).sendKeys(password);
            } else {
                wait.until(ExpectedConditions.elementToBeClickable(loginPassword));
            }
        return this;
    }

    public LoginToGmail emailPage(String email, String password) {
        this.typeEmail(email);
        driver.findElement(nextButtonEmail).click();
        this.typePassword(password);
        driver.findElement(nextButtonPassword).click();
        return new LoginToGmail(driver);
    }
}
