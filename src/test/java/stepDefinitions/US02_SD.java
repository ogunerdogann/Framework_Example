package stepDefinitions;

import enums.NAVBAR;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US02_SD extends CommonPage {

    @Given("Die Tabs müssen geklickt werden und die entsprechenden URLs müssen verifiziert werden")
    public void dieTabsMüssenGeklicktWerdenUndDieEntsprechendenURLsMüssenVerifiziertWerden(DataTable dataTable) {
        getHomePage().klickeUndVerifiziereUrl(dataTable);
    }

    @Given("Die Tabs müssen geklickt werden und die entsprechenden Seitentitel müssen verifiziert werden")
    public void dieTabsMüssenGeklicktWerdenUndDieEntsprechendenSeitentitelMüssenVerifiziertWerden(DataTable dataTable) {
        getHomePage().klickeUndVerifiziereTitle(dataTable);
    }


    @Given("ENUM CLASS")
    public void enumCLASS() {
        NAVBAR.HOME_PAGE.verifiziereUrl();
        NAVBAR.HOME_PAGE.verifiziereTitle();

        NAVBAR.ABOUT_US_PAGE.clickPage();

       ReusableMethods.waitFor(1);

        NAVBAR.ABOUT_US_PAGE.verifiziereUrl();
        NAVBAR.ABOUT_US_PAGE.verifiziereTitle();

        NAVBAR.CONTACT_US_PAGE.clickPage();

        ReusableMethods.waitFor(1);


        NAVBAR.CONTACT_US_PAGE.verifiziereUrl();
        NAVBAR.CONTACT_US_PAGE.verifiziereTitle();

        NAVBAR.CONSULTING_PAGE.clickPage();

        ReusableMethods.waitFor(1);


        NAVBAR.CONSULTING_PAGE.verifiziereUrl();
        NAVBAR.CONSULTING_PAGE.verifiziereTitle();

        NAVBAR.ACCOUNT_PAGE.clickPage();

        ReusableMethods.waitFor(1);


        NAVBAR.ACCOUNT_PAGE.verifiziereUrl();
        NAVBAR.ACCOUNT_PAGE.verifiziereTitle();
    }



}
