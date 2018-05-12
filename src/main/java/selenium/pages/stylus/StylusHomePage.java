package selenium.pages.stylus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylusHomePage {
    private WebDriver driver;

    private By searchFieldLocator = By.xpath(".//div[@id='head-search']//input[@type='text']");
    private By searchButtonLocator = By.xpath(".//div[@id='head-search']//input[@type='submit']");

    private WebElement searchField;
    private WebElement searchButton;

    public StylusHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public StylusHomePage openMainPage (String url, String searchItem){
        driver.get(url);
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchItem);
        searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
        return this;
    }
}
