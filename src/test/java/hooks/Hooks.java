package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import utilities.Driver;

public class Hooks {

    public static WebDriver driver;
    public static String browserType = "chrome";
    public static CommonPage commonPage;
    public static Actions actions;

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }

    @Before(value = "@edge", order = 0)
    public void setIsEdge() {
        browserType = "edge";
    }

    @Before(value = "@UI", order = 1)
    public void setup() {
        driver = Driver.getDriver();
        commonPage = new CommonPage() {
        };
        actions = new Actions(driver);
    }

    @After(value = "@UI")
    public void closeDriver() {
        Driver.closeDriver();
    }

    /*
    @After(value = "@UI")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }

        Driver.closeDriver();
    }
     */
}
