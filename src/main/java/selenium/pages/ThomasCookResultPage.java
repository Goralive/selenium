package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThomasCookResultPage extends AbstractPage {

    @FindBy(css = "div > a.BtnPrimary.detailsBtn")
    WebElement detailsButton;

    public ThomasCookResultPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnDetailsButton (){
        detailsButton.click();
    }
}
