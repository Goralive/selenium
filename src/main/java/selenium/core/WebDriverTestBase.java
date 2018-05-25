package selenium.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

/**
 * General properties for test.
 */

@Listeners(selenium.core.TestListener.class)
public class WebDriverTestBase {

    // Properties
    private String browser = System.getProperty("browser", CHROME);
    private long implicitWait = Long.parseLong(PropertiesCache.getProperty("wait.implicity"));
    private long timeOutInSec = Long.parseLong(PropertiesCache.getProperty("timeOutInSec"));

    // WebDriver
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeClass
    public void setUp() {
        switch (browser.toLowerCase()) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            /**
             *  For test firefox add VM option -Dbrowser=firefox
             */
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
        wait = new WebDriverWait(driver, timeOutInSec);
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.get(PropertiesCache.getProperty("urlGoogle"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


