package pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
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


        ReusableMethods.scrollToWebElement(featuresList.get(0));
        System.out.println(featuresList.get(0).getCssValue("transition").toString());
        ReusableMethods.waitFor(5);
        ReusableMethods.hoverWebElement(featuresList.get(0));
        System.out.println(featuresList.get(0).getCssValue("transition").toString());
        ReusableMethods.waitFor(5);
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
}


