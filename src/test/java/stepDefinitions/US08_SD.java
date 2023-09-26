package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US08_SD extends CommonPage {
    @Given("Butttons für verwandte Optionen müssen angezeigt werden")
    public void butttonsFürVerwandteOptionenMüssenAngezeigtWerden() {
        getHomePage().sindPlanPricingButtonsSichtbar();
    }

    @When("Buttons für verwandte Optionen müssen angeklickt werden")
    public void buttonsFürVerwandteOptionenMüssenAngeklicktWerden() {
        getHomePage().sindPlanPricingButtonsKlickbar();

    }
}
