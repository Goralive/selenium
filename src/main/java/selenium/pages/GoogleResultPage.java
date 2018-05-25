package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleResultPage extends AbstractPage {
    By linkLocator = By.cssSelector(".srg > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)");
        //#search,.r

    @FindBy(css = "h3.r > a")
    WebElement firstLink;


    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIsElementIsPresent (){
            try {
                wait.until(ExpectedConditions.visibilityOf(firstLink));
            } catch (TimeoutException e) {
                return false;
            }
            return true;
        }

    public void clickOnSearchElement (){
        firstLink.click();
    }

    public String getTitleSearchedElement (){
        return driver.getTitle();
    }
}
