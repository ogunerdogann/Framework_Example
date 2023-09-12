package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

import static Hooks.Hooks.browserType;
import static Hooks.Hooks.driver;

public class Driver {

    // With this private Constructor, a Driver Object can not be created from another classes.
    private Driver() {

    }

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (browserType) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
