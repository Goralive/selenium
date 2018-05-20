package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage extends AbstractPage {
    By linkLocator = By.cssSelector(".srg > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)");
    public GoogleResultPage(WebDriver driver) {
        super(driver);

    }
    public WebElement getLink(){
        WebElement link = driver.findElement(linkLocator);
        return link;
    }
}
