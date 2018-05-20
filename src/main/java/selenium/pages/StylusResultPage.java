package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylusResultPage extends AbstractPage {

    private By productDisplayedLocator = By.xpath(".//div[@id='search-list']//li[2]/a[@class='product-link']");
    private WebElement productDisplayed;

    public StylusResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyModel (String product){
        productDisplayed = driver.findElement(productDisplayedLocator);
        if (productDisplayed.getAttribute("title").toLowerCase().contains(product.toLowerCase())){
            productDisplayed.click();
            return true;
        }
      return false;
    }
}
