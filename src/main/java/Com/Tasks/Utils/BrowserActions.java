package Com.Tasks.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
    private BrowserActions(){};


    // Function to Navigate to Page
    public static void NavigateToPage(WebDriver driver, String URL) {
        driver.get(URL);
        LogUtils.Info("Navigated to " , URL);
    }

    // Function To get Page URL
    public  static String ReturnPageURL(WebDriver driver) {
        return  driver.getCurrentUrl() ;
    }

    // Function To get Page Title

    public static  String ReturnPageTitle(WebDriver driver) {
        return  driver.getTitle() ;
    }

    public  static  String ReturnBrowserError(WebDriver driver , By Locator){
        return  (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage", ElementActions.FindElement(driver, Locator));

    }


}
