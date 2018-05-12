package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylusProductPage {

    private WebDriver driver;
    private WebElement nameOfProduct;

    private By nameOfProductLocator = By.xpath("//meta[@name='title']");

    public StylusProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkProduct (String productName){
        nameOfProduct = driver.findElement(nameOfProductLocator);
        if (nameOfProduct.getAttribute("content").toLowerCase().contains(productName.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
