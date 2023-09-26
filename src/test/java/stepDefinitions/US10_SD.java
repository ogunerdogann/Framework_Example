package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US10_SD extends CommonPage {



    @And("Facebook button sollte angezeigt und geklickt werden")
    public void facebookButtonSollteAngezeigtUndGeklicktWerden() {
        getHomePage().istFacebookButtonSichtbarUndKlickbar();
    }

    @Then("Wenn der Facebook button angeklickt wird, muss an die Facebook-Seite weitergeleitet werden")
    public void wennDerFacebookButtonAngeklicktWirdMussAnDieFacebookSeiteWeitergeleitetWerden() {
    }

    @And("Twitter button sollte angezeigt und geklickt werden")
    public void twitterButtonSollteAngezeigtUndGeklicktWerden() {
        getHomePage().istTwitterButtonSichtbarUndKlickbar();
    }

    @Then("Wenn der Twitter button angeklickt wird, muss an die Twitter-Seite weitergeleitet werden")
    public void wennDerTwitterButtonAngeklicktWirdMussAnDieTwitterSeiteWeitergeleitetWerden() {
    }

    @And("Linkedin button sollte angezeigt geklickt werden")
    public void linkedinButtonSollteAngezeigtGeklicktWerden() {
        getHomePage().istLinkedInButtonSichtbarUndKlickbar();
    }

    @Then("Wenn der Linkedin button angeklickt wird, muss an die Linkedin-Seite weitergeleitet werden")
    public void wennDerLinkedinButtonAngeklicktWirdMussAnDieLinkedinSeiteWeitergeleitetWerden() {
    }

    @And("Pinterest button sollte angezeigt geklickt werden")
    public void pinterestButtonSollteAngezeigtGeklicktWerden() {
        getHomePage().istPinterestButtonSichtbarUndKlickbar();
    }

    @Then("Wenn der Pinterest button angeklickt wird, muss an die Pinterest-Seite weitergeleitet werden")
    public void wennDerPinterestButtonAngeklicktWirdMussAnDiePinterestSeiteWeitergeleitetWerden() {
    }
}
