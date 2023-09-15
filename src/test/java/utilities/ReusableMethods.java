package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static hooks.Hooks.actions;
import static hooks.Hooks.driver;

public class ReusableMethods {

    public static void waitFor(int sec) {


        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebElement waitforVisibility(WebElement webElement, int timeout) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void scrollToWebElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public static void hoverWebElement(WebElement webElement) {
        actions.moveToElement(webElement).build().perform();
    }


}
