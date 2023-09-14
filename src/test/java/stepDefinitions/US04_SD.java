package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.CommonPage;

public class US04_SD extends CommonPage {
    @Then("Verifiziere ob Our Solutions sichbar und anklickbar sind")
    public void verifiziereObOurSolutionsSichbarUndAnklickbarSind() {
        getHomePage().sindOurSolutionsSichbarAndAnklickbar();
    }
}
