package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

import static hooks.Hooks.driver;

public class US12_SD extends CommonPage {


    @When("About us sollte angezeigt und angeklickt werden")
    public void aboutUsSollteAngezeigtUndAngeklicktWerden() {
        getHomePage().clickPage(1);
    }

    @Then("Beim Anklicken auf About Us sollte sich die Url entsprechend ändern")
    public void beimAnklickenAufAboutUsSollteSichDieUrlEntsprechendÄndern(DataTable dataTable) {

        getHomePage().klickeAufAboutUsUndVerifiziereDieUrl(dataTable);
    }
}
