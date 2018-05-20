package selenium.pages;


import org.openqa.selenium.WebDriver;


public class GmailUserPage extends AbstractPage {

    public GmailUserPage(WebDriver driver) {
        super(driver);
    }


    public boolean checkPage(String email) {
        driver.getTitle();
        return driver.getTitle().contains(email);
    }

}
