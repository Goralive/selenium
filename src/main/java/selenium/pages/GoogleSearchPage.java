package selenium.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static selenium.core.PropertiesCache.getProperty;


public class GoogleSearchPage extends AbstractPage {


    @FindBy(xpath = ".//*[@id='lst-ib']")
     WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public GoogleSearchPage openGooglePage() {
        driver.get(getProperty("urlGoogle"));
        return new GoogleSearchPage(driver);
    }

    public boolean isAt() {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchField));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public GoogleResultPage submitSearchField() {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys("Mini CountyMan");
        searchField.submit();
        return new GoogleResultPage(driver);
    }
}
