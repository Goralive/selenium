package selenium.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage {

    By searchLocator = By.xpath(".//*[@id='lst-ib']");

    private WebElement searchField;
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search (String searchText){
        searchField = driver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
    }
}
