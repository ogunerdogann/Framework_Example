package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

import static hooks.Hooks.actions;

public class US06_SD extends CommonPage {
    @Then("Die Features müssen angezeigt werden")
    public void dieFeaturesMüssenAngezeigtWerden() {
        getHomePage().verifiziereFeatures();
    }

    @When("Features müssen beim hovering over bewegt werden und verifiziere ob sich die bewegt haben")
    public void featuresMüssenBeimHoveringOverBewegtWerdenUndVerifiziereObSichDieBewegtHaben() {
        getHomePage().hoverToFeatures();
    }
}
