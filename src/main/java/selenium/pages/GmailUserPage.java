package selenium.pages;


import org.openqa.selenium.WebDriver;


public class GmailUserPage {

    private WebDriver webDriver;


    public GmailUserPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }


    public boolean checkPage(String email) {

        webDriver.getTitle();
        return webDriver.getTitle().contains(email);
    }

}
