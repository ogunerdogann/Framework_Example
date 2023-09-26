package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

import static hooks.Hooks.driver;
import static hooks.Hooks.faker;

public class LoginPage extends CommonPage{

    String email;
    String password= "Burkay1996-";
    @FindBy(css = "li [href^='/']")
    private List<WebElement> navBarList;

    @FindBy(id = "email-uniq") private WebElement email_box;

    @FindBy(id = "password-uniq") private WebElement password_box;

    @FindBy(xpath = "//*[@type='checkbox']") private WebElement checkbox_keepMeSignedIn;

    @FindBy(xpath = "//*[text()='Login']") private WebElement login_button1;

    @FindBy(xpath = "//*[@href='/register']") private WebElement dontHaveAnAccount_link;

    @FindBy(id = "register-email-input") private WebElement registerEmail_box;

    @FindBy(id = "register-password-input") private WebElement registerPassword_box;

    @FindBy(id = "register-password-input-2") private WebElement registerPassword2_box;
    @FindBy(css = ".register-button button") private WebElement register_button;

    public void klickeAufAccountButton(){
        navBarList.get(4).click();
    }

    public void verifiziereObButtonsAnklickbarsind(){
        email_box.isEnabled();
        email_box.isDisplayed();

        password_box.isEnabled();
        password_box.isDisplayed();

        dontHaveAnAccount_link.isDisplayed();
        dontHaveAnAccount_link.isEnabled();
    }

    public void verifiziereObKeepMeSignedInCheckboxAnkreuzbarIst(){
        checkbox_keepMeSignedIn.isEnabled();
    }

    public void loginMitUngultigenAnmeldeInfos(String email,String password,String message){

        email_box.sendKeys(email);
        password_box.sendKeys(password);
        login_button1.click();

        ReusableMethods.waitFor(2);

        assertMessage(email_box,message);
    }

    public void assertMessage(WebElement webElement,String message){
        Assert.assertEquals(message,webElement.getAttribute("validationMessage"));
    }

    public void anmeldung(){
        dontHaveAnAccount_link.click();
        email = faker.internet().emailAddress();
        registerEmail_box.sendKeys(email);
        registerPassword_box.sendKeys(password);
        registerPassword2_box.sendKeys(password);

        register_button.click();

        ReusableMethods.waitFor(5);
    }

    public void verifiziereObDieAnmeldungErfolgreichIst(String message){
        Assert.assertEquals(message,driver.switchTo().alert().getText());

        ReusableMethods.waitFor(2);

        driver.switchTo().alert().accept();

        ReusableMethods.waitFor(2);

    }

    public void login(){
        email_box.sendKeys(email);
        password_box.sendKeys(password);
        login_button1.click();

        ReusableMethods.waitFor(5);
    }

}

