package selenium.pages.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLoginPage {

    private By loginEmailLocator = By.xpath(".//input[@id='identifierId']");
    private By nextButtonEmailLocator = By.xpath(".//div[@id='identifierNext']");
    private By passwordLocator = By.xpath(".//div[@id='password']//input");
    private By nextButtonPasswordLocator = By.xpath(".//div[@id='passwordNext']/content");

    private WebDriver webDriver;
    private WebElement emailField;
    private WebElement nextButtonEmail;
    private WebElement passwordField;
    private WebElement nextButtonPasword;

    public GmailLoginPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public GmailLoginPage userEmailPassword(String email, String password, String url) {
        webDriver.get(url);
        emailField = webDriver.findElement(loginEmailLocator);
        nextButtonEmail = webDriver.findElement(nextButtonEmailLocator);
        emailField.sendKeys(email);
        nextButtonEmail.click();
        passwordField = webDriver.findElement(passwordLocator);
        nextButtonPasword = webDriver.findElement(nextButtonPasswordLocator);

        passwordField.sendKeys(password);
        nextButtonPasword.click();
        return this;
    }
}
