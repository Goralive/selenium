package selenium.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import selenium.core.PropertiesCache;


public class GmailUserPage extends AbstractPage {

    public GmailUserPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open gmail")
    public boolean checkPage() {
        driver.getTitle();
        return driver.getTitle().contains(PropertiesCache.getProperty("email.User"));
    }

}
