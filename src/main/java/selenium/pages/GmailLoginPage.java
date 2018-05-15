package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailLoginPage extends AbstractPage {

    private By loginEmailLocator = By.xpath(".//input[@id='identifierId']");
    private By nextButtonEmailLocator = By.xpath(".//div[@id='identifierNext']");
    private By passwordLocator = By.xpath(".//div[@id='password']//input");
    private By nextButtonPasswordLocator = By.xpath(".//div[@id='passwordNext']/content");
    private By waitUntilPageLoadedLocator = By.xpath("//div[@id='gbq1']");

    private WebElement emailField;
    private WebElement nextButtonEmail;
    private WebElement passwordField;
    private WebElement nextButtonPasword;
    private WebElement waitUntilPageLoaded;


    public GmailLoginPage(WebDriver driver) {
            super(driver);
    }

    public boolean userEmailPassword(String email, String password) {

            WebDriverWait webDriverWait = new WebDriverWait(driver,10);

        if (driver.getTitle().toLowerCase().contains("Gmail".toLowerCase())) {
            emailField = driver.findElement(loginEmailLocator);
            nextButtonEmail = driver.findElement(nextButtonEmailLocator);
            emailField.sendKeys(email);
            nextButtonEmail.click();
            passwordField = driver.findElement(passwordLocator);
            nextButtonPasword = driver.findElement(nextButtonPasswordLocator);
            passwordField.sendKeys(password);
            nextButtonPasword.click();
            waitUntilPageLoaded = driver.findElement(waitUntilPageLoadedLocator);
            webDriverWait.until(ExpectedConditions.visibilityOf(waitUntilPageLoaded));
            System.out.println("This url is GMAIL");
            return true;
        } else {
            System.out.println("This url not GMAIL!");
           return false;
        }
    }
}
