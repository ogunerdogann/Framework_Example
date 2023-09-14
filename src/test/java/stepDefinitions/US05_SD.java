package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.CommonPage;

public class US05_SD extends CommonPage {
    @Given("verifiziere, ob das Suchfeld angezeigt wird")
    public void verifiziereObDasSuchfeldAngezeigtWird() {
        getHomePage().verifiziereSuchFeldHomePage();
    }
}
