package pages;

import enums.SERVICES;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static hooks.Hooks.driver;

public class ConsultingPage extends CommonPage {

    @FindBy(css = "li [href^='/']")
    private List<WebElement> navBarList;

    @FindBy(css = "section .services")
    private List<WebElement> servicesList;

    @FindBy(css = ".services a")
    private List<WebElement> servicesLearnMoreButtons;

    public void klickeAufServicesUndVerifiziereObDerBrowserAnDieServicesWeitergeleitetWird() {

        navBarList.get(3).click();

        SERVICES.EDUCATION.klickeAufService();
        SERVICES.EDUCATION.verifiziereUrl();

        navBarList.get(3).click();


        SERVICES.CAREER.klickeAufService();
        SERVICES.CAREER.verifiziereUrl();

        navBarList.get(3).click();


        SERVICES.INFORMATION_TECH.klickeAufService();
        SERVICES.INFORMATION_TECH.verifiziereUrl();
    }

    public void clickAufServices(int index) {

        servicesLearnMoreButtons.get(index).click();
    }
}
