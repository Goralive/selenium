package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage extends AbstractPage {
    By linkLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/h3/a");
    public GoogleResultPage(WebDriver driver) {
        super(driver);

    }
    public WebElement getLink(){
        WebElement link = driver.findElement(linkLocator);
        return link;
    }
}
