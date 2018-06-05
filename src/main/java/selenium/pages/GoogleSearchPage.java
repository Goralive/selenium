package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static selenium.core.PropertiesCache.getProperty;


public class GoogleSearchPage extends AbstractPage {


    @FindBy(css = "#lst-ib")
    WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);

    }
    @Step("Get Google Url")
    public WebDriver openGooglePage() {
        driver.get(getProperty("urlGoogle"));
        return driver;
    }

    public boolean isAt() {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchField));
        } catch (TimeoutException e) {
            System.out.println("Timeout Exception");
            return false;
        }
        return true;
    }

    public void sendKeysSearchField() {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(getProperty("google.search"));
    }
    public GoogleResultPage submitSearchfield (){
        searchField.submit();
        return new GoogleResultPage(driver);
    }
}
