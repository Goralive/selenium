package selenium.pages.com.equerest.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.pages.com.equerest.pages.RegisterPage;

public class EnterpreneurSteps {

    public static final String REGISTER_PAGE = "https://dev.equerest.com/register#/entrepreneur";

    private WebDriver webDriver;
    private RegisterPage registerPage;

    @Given("^I am on new project registration page")
    public void openRegisterPage() {
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.get(REGISTER_PAGE);
    }

    @When("^I fill my first name \"([^\"]*)\" and last name \"([^\"]*)\"")
    public void fillFirstAndLastName(String firstName, String lastName){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillFIO(firstName, lastName);
    }
    @When("^I fill my city \"([^\"]*)\"")
    public void fillCity (String city){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillCity(city);
    }

    @When("^I fill my phone \"([^\"]*)\"")
    public void fillPhone(String phone){

        registerPage = new RegisterPage(webDriver);
        registerPage.fillNumber(phone);
    }

    @When("^I fill my email \"([^\"]*)\"")
    public void fillEmail(String email){

        registerPage =  new RegisterPage(webDriver);
        registerPage.fillEmail(email);
    }

    @When("^I fill my password \"([^\"]*)\"")
    public void fillPassword (String password){
        registerPage = new RegisterPage(webDriver);
        registerPage.fillPassword(password);
    }
    @After
    public void tearDown (){
        webDriver.quit();
    }
}
