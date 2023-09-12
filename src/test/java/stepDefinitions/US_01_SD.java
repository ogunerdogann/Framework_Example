package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

import static Hooks.Hooks.driver;

public class US_01_SD {

    @Given("Benutzer sollte {string} erreichen")
    public void benutzerSollteErreichen(String url) {
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

    /*
git init
git add .
git commit -m "US01/12092023"
git branch -M main
git remote add origin https://github.com/ogunerdogann/Framework_Example.git
git push -u origin main
     */

}