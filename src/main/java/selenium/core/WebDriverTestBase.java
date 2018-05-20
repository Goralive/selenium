package selenium.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;


public class WebDriverTestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private String browser = System.getProperty("browser", CHROME );
    private long implicitWait = Long.parseLong(PropertiesCache.getProperty("wait.implicity"));
    private long timeOutInSec = Long.parseLong(PropertiesCache.getProperty("timeOutInSec"));

    @BeforeTest
    public void setUp() {

        switch (browser.toLowerCase()){
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX: //TODO -Dbrowser=firefox
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
        wait = new WebDriverWait(driver, timeOutInSec);
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}

