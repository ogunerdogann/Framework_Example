package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;

public class US09_SD extends CommonPage {
    @Given("scrolle zum Get In Touch With Us Text")
    public void scrolleZumGetInTouchWithUsText() {
        getHomePage().scrolleZumGetInTouchWithUs();
    }

    @Then("verifiziere, ob die Titel angezeigt werden")
    public void verifiziereObDieTitelAngezeigtWerden() {
        getHomePage().verifiziereFooterTitel();
    }
}
