package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

public class US14_SD extends CommonPage {
    @Then("die Page Contact Us angelickt werden und die Daten sollten eingetippt werden")
    public void diePageContactUsAngelicktWerdenUndDieDatenSolltenEingetipptWerden() {
        getHomePage().fülleDasKontaktFormularaufundKlickeAufSubmit();
    }

    @And("Verifiziere ob das Kontaktformular gespeichert wurde")
    public void verifiziereObDasKontaktformularGespeichertWurde() {
        getHomePage().verifiziereKontaktFormularGespeichertWurde();
    }
}
