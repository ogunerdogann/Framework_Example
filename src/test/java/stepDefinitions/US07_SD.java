package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US07_SD extends CommonPage{

    @Then("verifiziere, ob das Text angezeigt wird")
    public void verifiziereObDasTextAngezeigtWird() {
        getHomePage().verifiziereMoreAboutUsText();
    }

    @Given("scrolle zum More About Us Taste")
    public void scrolleZumMoreAboutUsText() {
        getHomePage().scrolleZumMoreAboutUs();
        ReusableMethods.waitFor(2);
    }
}
