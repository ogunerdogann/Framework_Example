package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US18_SD extends CommonPage {
    @And("Klicke auf account Button")
    public void klickeAufAccountButton() {
        getLoginPage().klickeAufAccountButton();
    }

    @When("Verifiziere ob Email, Password und Don't have an account? Register Buttons anklickbar sind")
    public void verifiziereObEmailPasswordUndDonTHaveAnAccountRegisterButtonsAnklickbarSind() {
        getLoginPage().verifiziereObButtonsAnklickbarsind();
    }

    @Then("Verifiziere ob Keep Me Signed In checkbox ankreuzbar ist")
    public void verifiziereObKeepMeSignedInCheckboxAnkreuzbarIst() {
        getLoginPage().verifiziereObKeepMeSignedInCheckboxAnkreuzbarIst();
    }

    @And("die ungultige {string} und {string} sollten eingegeben werden und {string} sollte verifiziert werden")
    public void dieUngultigeUndSolltenEingegebenWerdenUndSollteVerifiziertWerden(String email, String password, String message) {

        getLoginPage().loginMitUngultigenAnmeldeInfos(email, password, message);
    }


    @When("Benutzer sollte sich anmelden")
    public void benutzerSollteSichAnmelden() {
        getLoginPage().anmeldung();
    }


    @Then("Verifiziere ob die Message {string} anzegeigt wird")
    public void verifiziereObDieMessageAnzegeigtWird(String message) {
        getLoginPage().verifiziereObDieAnmeldungErfolgreichIst(message);
    }

    @And("Benutzer sollte sich mit angemeldeten Kontoinformationen einloggen")
    public void benutzerSollteSichMitAngemeldetenKontoinformationenEinloggen() {
        getLoginPage().login();
    }
}
