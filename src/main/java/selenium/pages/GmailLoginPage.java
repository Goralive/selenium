package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailLoginPage {

    private By loginEmailLocator = By.xpath(".//input[@id='identifierId']");
    private By nextButtonEmailLocator = By.xpath(".//div[@id='identifierNext']");
    private By passwordLocator = By.xpath(".//div[@id='password']//input");
    private By nextButtonPasswordLocator = By.xpath(".//div[@id='passwordNext']/content");
    private By waitUntilPageLoadedLocator = By.xpath("//div[@id='gbq1']");

    private WebDriver webDriver;


    private WebElement emailField;
    private WebElement nextButtonEmail;
    private WebElement passwordField;
    private WebElement nextButtonPasword;
    private WebElement waitUntilPageLoaded;


    public GmailLoginPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public boolean userEmailPassword(String email, String password) {

            WebDriverWait webDriverWait = new WebDriverWait(webDriver,10);

        if (webDriver.getTitle().toLowerCase().contains("Gmail".toLowerCase())) {
            emailField = webDriver.findElement(loginEmailLocator);
            nextButtonEmail = webDriver.findElement(nextButtonEmailLocator);
            emailField.sendKeys(email);
            nextButtonEmail.click();
            passwordField = webDriver.findElement(passwordLocator);
            nextButtonPasword = webDriver.findElement(nextButtonPasswordLocator);
            passwordField.sendKeys(password);
            nextButtonPasword.click();
            waitUntilPageLoaded = webDriver.findElement(waitUntilPageLoadedLocator);
            webDriverWait.until(ExpectedConditions.visibilityOf(waitUntilPageLoaded));
            System.out.println("This url is GMAIL");
            return true;
        } else {
            System.out.println("This url not GMAIL!");
           return false;
        }
    }
}
