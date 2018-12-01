package selenium.pages.com.equerest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private WebDriver webDriver;



    public RegisterPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void fillFIO(String firstName, String lastName){
        WebElement fio = webDriver.findElement(By.id("fio"));
        fio.sendKeys(firstName + " " + lastName);
    }
    public void fillNumber(String phone){
        WebElement phoneNumber = webDriver.findElement(By.id("tel"));
        phoneNumber.sendKeys(phone);
    }

    public void fillCity(String city) {
        WebElement cityName = webDriver.findElement(By.id("city"));
        cityName.sendKeys(city);
    }

    public void fillEmail(String email) {
        WebElement emailName = webDriver.findElement(By.xpath("//input[@id='mail']"));
        emailName.sendKeys(email);
    }

    public void fillPassword(String password) {
        WebElement passwordFill = webDriver.findElement(By.id("pass"));
        passwordFill.sendKeys(password);
    }
}
