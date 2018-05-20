package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GoogleSearchPage extends AbstractPage {

    By searchLocator = By.xpath(".//*[@id='lst-ib']");

    private WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void search (String searchText){
        searchField = wait.until(ExpectedConditions.elementToBeClickable(searchLocator));
        searchField.sendKeys(searchText);
        searchField.submit();
    }
}
