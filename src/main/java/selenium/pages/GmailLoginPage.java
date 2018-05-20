package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class GmailLoginPage extends AbstractPage {

    By loginEmailLocator = By.xpath(".//input[@id='identifierId']");
    By nextButtonEmailLocator = By.xpath(".//div[@id='identifierNext']");
    By passwordLocator = By.xpath(".//div[@id='password']//input");
    By nextButtonPasswordLocator = By.xpath(".//div[@id='passwordNext']/content");
    By waitUntilPageLoadedLocator = By.xpath("//div[@id='gbq1']");


    private WebElement emailField;
    private WebElement nextButtonEmail;
    private WebElement passwordField;
    private WebElement nextButtonPasword;
    private WebElement waitUntilPageLoaded;


    public GmailLoginPage(WebDriver driver) {
            super(driver);
    }

    public boolean userEmailPassword(String email, String password) {
         String urlGmail = "http://gmail.com";
         driver.get(urlGmail);
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
            wait.until(ExpectedConditions.visibilityOf(waitUntilPageLoaded));
            System.out.println("This url is GMAIL");
            return true;
        } else {
            System.out.println("This url not GMAIL!");
           return false;
        }
    }
}
