package selenium.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {
    By linkLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/h3/a");

    private WebDriver webDriver;

    public GoogleResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement getLink(){
        WebElement link = webDriver.findElement(linkLocator);
        return link;
    }
}
