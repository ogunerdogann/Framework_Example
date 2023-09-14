package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.CommonPage;
import pages.HomePage;

public class US03_SD extends CommonPage {
    @Given("verifiziere, ob das KesifPlus Logo angezeigt wird")
    public void verifiziereObDasKesifPlusLogoAngezeigtWird() {
        getHomePage().verifiziereKesifPlusLogo();
    }
}
