package selenium.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleResultPage extends AbstractPage {

    @FindBy(css = "#rso div:nth-child(3) .rc a[href*='mini']")
    WebElement miniCouperLink;

    public String getTextFromSearchedItem;
    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIsElementIsPresent() {
        try {
            wait.until(ExpectedConditions.visibilityOf(miniCouperLink));
        } catch (TimeoutException e) {
            System.out.println("Element isn't visible or wrong locator");
            return false;
        }
        return true;
    }

    public String clickOnSearchElement() {
        getTextFromSearchedItem = miniCouperLink.getText().substring(0, 4);
        miniCouperLink.click();
        return getTextFromSearchedItem;
    }

    public boolean getTitleSearchedElement(String SearchItemText) {
        if (driver.getTitle().toLowerCase().contains(SearchItemText.toLowerCase())) {
            return true;
        }
        return false;
    }
}
