package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThomasCookHomePage extends AbstractPage {

    @FindBy(css = "#SearchbarForm-submitBtn")
    WebElement searchButton;

    @FindBy(css = "#e108742-promo-slider > span")
    WebElement promoSlider;

    public ThomasCookHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton() {
        if (promoSlider.isDisplayed()) {
            promoSlider.click();
            searchButton.click();
        } else
            searchButton.click();
    }
}
