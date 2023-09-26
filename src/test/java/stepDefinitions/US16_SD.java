package stepDefinitions;

import io.cucumber.java.en.When;
import pages.CommonPage;

public class US16_SD extends CommonPage {
    @When("Beim Anklicken auf Consulting sollte sich die Url entsprechend ändern")
    public void beimAnklickenAufConsultingSollteSichDieUrlEntsprechendÄndern() {

        getConsultingPage().klickeAufServicesUndVerifiziereObDerBrowserAnDieServicesWeitergeleitetWird();
    }
}
