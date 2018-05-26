package selenium.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static selenium.core.PropertiesCache.getProperty;


public class GoogleSearchPage extends AbstractPage {


    @FindBy(css = "#lst-ib")
     WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);

    }

    public WebDriver openGooglePage() {
        driver.get(getProperty("urlGoogle"));
        return driver;
    }

    public boolean isAt() {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchField));
        } catch (TimeoutException e) {
            System.out.println("There is no locator for google search");
            return false;
        }
        return true;
    }

    public GoogleResultPage submitSearchField() {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(getProperty("google.search"));
        searchField.submit();
        return new GoogleResultPage(driver);
    }
}
