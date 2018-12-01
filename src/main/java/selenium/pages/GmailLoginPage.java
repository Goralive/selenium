package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static selenium.core.PropertiesCache.getProperty;



public class GmailLoginPage extends AbstractPage {

    @FindBy(css = "a[data-g-label='Sign in']")
    WebElement googleComSingIn;

//    By loginEmailLocator = By.xpath(".//input[@id='identifierId']");
//    By nextButtonEmailLocator = By.xpath(".//div[@id='identifierNext']");
//    By passwordLocator = By.xpath(".//div[@id='password']//input");
//    By nextButtonPasswordLocator = By.xpath(".//div[@id='passwordNext']/content");
//    By waitUntilPageLoadedLocator = By.xpath("//div[@id='gbq1']");
//
//
//    private WebElement emailField;
//    private WebElement nextButtonEmail;
//    private WebElement passwordField;
//    private WebElement nextButtonPasword;
//    private WebElement waitUntilPageLoaded;


    public GmailLoginPage(WebDriver driver) {
        super(driver);

    }

    public WebDriver openGmailPage (){
        driver.get(getProperty("urlMail"));
        return driver;
    }

    public boolean isAtLoginPage() {
        if (googleComSingIn.isDisplayed()) {
            googleComSingIn.click();
        }
        return driver.getTitle().toLowerCase().contains("Gmail");
    }
}

