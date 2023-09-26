package pages;

import enums.CONTACT;
import enums.NAVBAR;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

import static hooks.Hooks.actions;
import static hooks.Hooks.driver;

public class HomePage extends CommonPage {

    @FindBy(css = "li [href^='/']")
    private List<WebElement> navBarList;

    // Kesif Plus Logo oben links
    @FindBy(css = "img[src$='c1.png']")
    private WebElement kesifPlusLogo;

    @FindBy(css = "h1 [href^='/consulting']")
    private WebElement ourSolutionsButton;

    // das Suchfeld oben rechts auf HomePage
    @FindBy(id = "header-search-bar")
    private WebElement suchFeldHomePage;

    @FindBy(css = ".Features div")
    private List<WebElement> featuresList;

    @FindBy(xpath = "//*[text()='More About Us']")
    private WebElement moreAboutUsButton;

    @FindBy(css = "h3[class$='f_size_18']")
    private List<WebElement> footerTitel;

    @FindBy(css = "div.package1 button")
    private WebElement silverGetStartedButton;

    @FindBy(css = "div.package2 button")
    private WebElement goldGetStartedButton;

    @FindBy(css = "div.package3 button")
    private WebElement platinGetStartedButton;

    @FindBy(css = "h4.pricing-h4")
    private WebElement planAndPricingText;

    @FindBy(css = "#col-4 h3")
    private WebElement teamSolutionsText;

    @FindBy(css = "[class$='icon']>a")
    private List<WebElement> sozialeMedienButtonsList;

    @FindBy(css = "#PageInfo-title")
    private WebElement aboutUsText;

    @FindBy(css = "[placeholder*='F']")
    private WebElement contactUsFirstNameBox;

    @FindBy(css = "[class*='body']")
    private WebElement contactUsSuccessfullyMessage;


    public void klickeUndVerifiziereUrl(DataTable dataTable) {

        List<String> tabs = dataTable.column(0);
        List<String> urls = dataTable.column(1);

        for (int i = 0; i < tabs.size(); i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            navBarList.get(i).click();

            Assert.assertEquals(urls.get(i), driver.getCurrentUrl());
        }

    }

    public void klickeUndVerifiziereTitle(DataTable dataTable) {
        List<String> tabs = dataTable.column(0);
        List<String> titleNames = dataTable.column(1);


        for (int i = 0; i < tabs.size(); i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            navBarList.get(i).click();

            Assert.assertEquals(titleNames.get(i), driver.getTitle());
        }

    }

    public void verifiziereKesifPlusLogo() {
        Assert.assertTrue(kesifPlusLogo.isDisplayed());
    }

    public void clickPage(int index) {

        navBarList.get(index).click();
    }

    public void sindOurSolutionsSichbarAndAnklickbar() {
        Assert.assertTrue(ourSolutionsButton.isDisplayed());
        Assert.assertTrue(ourSolutionsButton.isEnabled());

    }

    public void verifiziereSuchFeldHomePage() {
        Assert.assertTrue(suchFeldHomePage.isDisplayed());
    }

    public void verifiziereFeatures() {
        ReusableMethods.waitforVisibility(featuresList.get(0), 10);
        ReusableMethods.waitforVisibility(featuresList.get(1), 10);
        ReusableMethods.waitforVisibility(featuresList.get(2), 10);
    }

    public void hoverToFeatures() {
        int beforeHoverY;
        int afterHoverY;

        int beforeHoverX;
        int afterHoverX;

        beforeHoverX = featuresList.get(0).getLocation().getX();
        beforeHoverY = featuresList.get(0).getLocation().getY();
        System.out.println(beforeHoverY);
        ReusableMethods.scrollToWebElement(featuresList.get(0));
        ReusableMethods.waitFor(5);
        ReusableMethods.hoverWebElement(featuresList.get(0));
        ReusableMethods.waitFor(5);
        afterHoverX = featuresList.get(0).getLocation().getX();
        afterHoverY = featuresList.get(0).getLocation().getY();
        System.out.println(afterHoverY);

        Assert.assertTrue(afterHoverY<beforeHoverY);
        Assert.assertEquals(beforeHoverX,afterHoverX);



        ReusableMethods.scrollToWebElement(featuresList.get(1));
        ReusableMethods.hoverWebElement(featuresList.get(1));
        ReusableMethods.waitFor(5);


        System.out.println("featuresList.get(2).getLocation().getX() = " + featuresList.get(2).getLocation().getX());
        System.out.println("featuresList.get(2).getLocation().getY() = " + featuresList.get(2).getLocation().getY());
        beforeHoverY = featuresList.get(2).getLocation().getY();
        beforeHoverX = featuresList.get(2).getLocation().getX();
        ReusableMethods.scrollToWebElement(featuresList.get(2));
        ReusableMethods.hoverWebElement(featuresList.get(2));
        ReusableMethods.waitFor(5);
        System.out.println("featuresList.get(2).getLocation().getX() = " + featuresList.get(2).getLocation().getX());
        System.out.println("featuresList.get(2).getLocation().getY() = " + featuresList.get(2).getLocation().getY());
        afterHoverY = featuresList.get(2).getLocation().getY();
        afterHoverX = featuresList.get(2).getLocation().getX();

        // web element yukari dogru hareket ettigi icin y koordinati daha da kuculuyor bende onceside 700 iken sonrasinda 680 oluyordu bu rakamlar sizde farkli olabilir
        Assert.assertTrue(afterHoverY<beforeHoverY);
        // x coordinatinda bir degisiklik olmayacaktir
        Assert.assertEquals(beforeHoverX, afterHoverX);
    }

    public void scrolleZumMoreAboutUs(){
        ReusableMethods.scrollToWebElement(moreAboutUsButton);
    }

    public void verifiziereMoreAboutUsText(){
        String expectedText = "More About Us";
        String actualText = moreAboutUsButton.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    public void scrolleZumGetInTouchWithUs(){
        ReusableMethods.scrollToWebElement(footerTitel.get(0));
        ReusableMethods.waitFor(2);
    }

    public void verifiziereFooterTitel(){

        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(footerTitel.get(i).isDisplayed());
        }
    }

    public void sindPlanPricingButtonsSichtbar(){
        ReusableMethods.scrollToWebElement(planAndPricingText);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(silverGetStartedButton.isDisplayed());
        Assert.assertTrue(goldGetStartedButton.isDisplayed());
        Assert.assertTrue(platinGetStartedButton.isDisplayed());
    }

    public void sindPlanPricingButtonsKlickbar(){
        Assert.assertTrue(silverGetStartedButton.isEnabled());
        Assert.assertTrue(goldGetStartedButton.isEnabled());
        Assert.assertTrue(platinGetStartedButton.isEnabled());
    }

    public void istFacebookButtonSichtbarUndKlickbar(){

        ReusableMethods.waitforVisibility(teamSolutionsText,3);

        Assert.assertTrue(sozialeMedienButtonsList.get(0).isDisplayed());
        Assert.assertTrue(sozialeMedienButtonsList.get(0).isEnabled());

    } public void istTwitterButtonSichtbarUndKlickbar(){

        ReusableMethods.waitforVisibility(teamSolutionsText,3);

        Assert.assertTrue(sozialeMedienButtonsList.get(1).isDisplayed());
        Assert.assertTrue(sozialeMedienButtonsList.get(1).isEnabled());

    } public void istLinkedInButtonSichtbarUndKlickbar(){

        ReusableMethods.waitforVisibility(teamSolutionsText,3);

        Assert.assertTrue(sozialeMedienButtonsList.get(2).isDisplayed());
        Assert.assertTrue(sozialeMedienButtonsList.get(2).isEnabled());

    } public void istPinterestButtonSichtbarUndKlickbar(){

        ReusableMethods.waitforVisibility(teamSolutionsText,3);

        Assert.assertTrue(sozialeMedienButtonsList.get(3).isDisplayed());
        Assert.assertTrue(sozialeMedienButtonsList.get(3).isEnabled());

    }

    public void klickeAufAboutUsUndVerifiziereDieUrl(DataTable dataTable){

        Assert.assertEquals("https://test.kesifplus.com/about-us",driver.getCurrentUrl());

        Assert.assertEquals(dataTable.column(0).get(0),driver.getCurrentUrl());

        NAVBAR.ABOUT_US_PAGE.verifiziereUrl();

        Assert.assertTrue(aboutUsText.isDisplayed());
    }

    public void fülleDasKontaktFormularaufundKlickeAufSubmit(){
        NAVBAR.CONTACT_US_PAGE.clickPage();

     //  actions.sendKeys(contactUsFirstNameBox,"Burkay")
     //          .sendKeys(Keys.TAB)
     //          .sendKeys("Gül")
     //          .sendKeys(Keys.TAB)
     //          .sendKeys("burkaygul96@gmail.com")
     //          .sendKeys(Keys.TAB)
     //          .sendKeys("017682285995")
     //          .sendKeys(Keys.TAB)
     //          .sendKeys("naber")
     //          .sendKeys(Keys.TAB)
     //          .sendKeys(Keys.ENTER).build().perform();

        ReusableMethods.waitFor(1);

        actions.sendKeys(contactUsFirstNameBox, CONTACT.BURKAY.getFirstName())
                .sendKeys(Keys.TAB)
                .sendKeys(CONTACT.BURKAY.getSurname())
                .sendKeys(Keys.TAB)
                .sendKeys(CONTACT.BURKAY.getEmail())
                .sendKeys(Keys.TAB)
                .sendKeys(CONTACT.BURKAY.getNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(CONTACT.BURKAY.getYourMessage())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .build().perform();

        ReusableMethods.waitFor(3);

    }

    public void verifiziereKontaktFormularGespeichertWurde(){
        Assert.assertTrue(contactUsSuccessfullyMessage.toString().contains("successfully"));
    }
}




