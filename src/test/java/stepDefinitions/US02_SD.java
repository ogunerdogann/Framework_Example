package stepDefinitions;

import enums.NAVBAR;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPage;
import pages.HomePage;

import java.util.List;

import static hooks.Hooks.driver;

public class US02_SD extends CommonPage {

    @Given("Der Nutzer klickt auf taps und verifiziert die entsprechende URL")
    public void derNutzerKlicktAufTapsUndVerifiziertDieEntsprechendeURL(DataTable dataTable) {
        getHomePage().klickeUndVerifiziereUrl(dataTable);

    }

    @Given("Der Nutzer klickt auf die Registerkarten und überprüft den Seitentitel")
    public void derNutzerKlicktAufDieRegisterkartenUndÜberprüftDenSeitentitel(DataTable dataTable) {
        getHomePage().klickeUndVerifiziereTitle(dataTable);
    }

    @Given("ENUM CLASS")
    public void enumCLASS() {
        NAVBAR.HOME_PAGE.verifiziereUrl();
        NAVBAR.HOME_PAGE.verifiziereTitle();

        NAVBAR.ABOUT_US_PAGE.clickPage();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        NAVBAR.ABOUT_US_PAGE.verifiziereUrl();
        NAVBAR.ABOUT_US_PAGE.verifiziereTitle();

        NAVBAR.CONTACT_US_PAGE.clickPage();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        NAVBAR.CONTACT_US_PAGE.verifiziereUrl();
        NAVBAR.CONTACT_US_PAGE.verifiziereTitle();

        NAVBAR.CONSULTING_PAGE.clickPage();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        NAVBAR.CONSULTING_PAGE.verifiziereUrl();
        NAVBAR.CONSULTING_PAGE.verifiziereTitle();

        NAVBAR.ACCOUNT_PAGE.clickPage();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        NAVBAR.ACCOUNT_PAGE.verifiziereUrl();
        NAVBAR.ACCOUNT_PAGE.verifiziereTitle();
    }
}
