package Com.Tasks.Pages;

import Com.Tasks.Utils.BrowserActions;
import Com.Tasks.Utils.ElementActions;
import Com.Tasks.Utils.Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // declare driver
    private final WebDriver driver;

    // constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    // Locators
    private final By LocateEmailField = By.id("user_name");
    private final By LocatePasswordField = By.cssSelector("input[type=\"password\"]");
    private final By LocateLoginButton = By.cssSelector("button[type=\"submit\"]");
    private final By LocatePasswordErrorAlert= By.cssSelector("#\\37  > div.Toastify__toast-body");
    //Actions


    public void gotopage(String URL) {
        BrowserActions.NavigateToPage(driver, URL);
    }

    public LoginPage FillEmailField(String UserName) {
        ElementActions.hardDelete(driver, this.LocateEmailField);
        ElementActions.SendData(driver, this.LocateEmailField, UserName);
        return this;
    }

    public LoginPage FillPasswordField(String Password) {
        ElementActions.hardDelete(driver, this.LocatePasswordField);
        ElementActions.SendData(driver, this.LocatePasswordField, Password);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        ElementActions.ClickOnElement(driver, this.LocateLoginButton);
        return this;
    }

    // Validations
    public  void AssertTrue(){
        Validations.AssertLoginSuccessfully(driver , "https://tasks.almedadsoft.com/#/");
    }

    public void AssertInvalidEmailFormat(){
        Validations.AssertInvalidUserName(driver , this.LocateEmailField);
    }
    public void AssertErrorPassword(){
        Validations.AssertInvalidPassword(driver, this.LocatePasswordErrorAlert, "كلمه المرور خاطءه");

    }
}
