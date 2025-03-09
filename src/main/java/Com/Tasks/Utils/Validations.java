package Com.Tasks.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Validations {
    private Validations() {};

    public static  void AssertLoginSuccessfully(WebDriver driver , String ExpectedURL){
        LogUtils.Info("Assert Login Successfully through comparing Actual URL With Expected URL " ,BrowserActions.ReturnPageURL(driver) );
        Assert.assertEquals(BrowserActions.ReturnPageURL(driver),ExpectedURL);
    }


    public static  void AssertInvalidUserName(WebDriver driver , By Locator ){
        LogUtils.Info("Assert Invalid UserName " , ElementActions.GetText(driver , Locator));
        Assert.assertNotEquals(BrowserActions.ReturnBrowserError(driver , Locator) ,ElementActions.GetText(driver , Locator) );

    }

    public static void AssertInvalidPassword(WebDriver driver , By Locator ,String ExpectedError){
        Assert.assertEquals(ElementActions.GetText(driver , Locator) , ExpectedError);
    }
}
