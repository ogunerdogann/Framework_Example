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

    public void verifiziereKesifPlusLogo(){
        Assert.assertTrue(kesifPlusLogo.isDisplayed());
    }

    public void clickPage(int index){

            navBarList.get(index).click();
    }

    public void sindOurSolutionsSichbarAndAnklickbar(){
        Assert.assertTrue(ourSolutionsButton.isDisplayed());
        Assert.assertTrue(ourSolutionsButton.isEnabled());

    }

    public void verifiziereSuchFeldHomePage(){
        Assert.assertTrue(suchFeldHomePage.isDisplayed());
    }

    public void verifiziereFeatures(){
       ReusableMethods.waitforVisibility(featuresList.get(0),10);
       ReusableMethods.waitforVisibility(featuresList.get(1),10);
       ReusableMethods.waitforVisibility(featuresList.get(2),10);
    }

    public void hoverToFeatures(){
        ReusableMethods.scrollToWebElement(featuresList.get(0));
        System.out.println(featuresList.get(0).getCssValue("transition").toString());
        ReusableMethods.waitFor(5);
        ReusableMethods.hoverWebElement(featuresList.get(0));
        System.out.println(featuresList.get(0).getCssValue("transition").toString());
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollToWebElement(featuresList.get(1));
        ReusableMethods.hoverWebElement(featuresList.get(1));
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollToWebElement(featuresList.get(2));
        ReusableMethods.hoverWebElement(featuresList.get(2));
        ReusableMethods.waitFor(5);
    }

}


