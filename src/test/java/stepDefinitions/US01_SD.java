package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static hooks.Hooks.driver;

public class US01_SD {

    @Given("Navigiere zu {string}")
    public void navigiereZu(String url) {
        driver.get(url);
    }




    @Then("Der Seitentitel sollte {string} enthalten.")
    public void derSeitentitelSollteEnthalten(String seitenTitel) {
        Assert.assertEquals(seitenTitel,driver.getTitle());
    }

    /*
    @And("Der Titel sollte auf verschiedenen Betriebssystemen korrekt angezeigt werden. \\(Windows | Mac)")
    public void derTitelSollteAufVerschiedenenBetriebssystemenKorrektAngezeigtWerdenWindowsMac() {
    }
    */

    @And("Der Titel sollte auf verschiedenen Browsern richtig angezeigt werden \\(Chrome | Firefox|Safari)")
    public void derTitelSollteAufVerschiedenenBrowsernRichtigAngezeigtWerdenChromeFirefoxSafari() {

    }


}