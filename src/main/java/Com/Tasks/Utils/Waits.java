package Com.Tasks.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private Waits() {}


    // Function to wait Element to be Present
    public static WebElement WaitElementToBePresent(WebDriver driver , By Locator ){
     LogUtils.Info("Waiting the Element to present  " , String.valueOf(Locator));
        return    new WebDriverWait(driver , Duration.ofSeconds(5)).until(
                driver1 ->  ElementActions.FindElement(driver ,Locator )) ;
    }

    // Function To Wait Element To be visible
    public static  WebElement WaitElementToBeVisible(WebDriver driver , By Locator){
        LogUtils.Info("Waiting the Element to be Visible " , String.valueOf(Locator));
        return  new WebDriverWait(driver , Duration.ofSeconds(5)).until(
                driver1 -> {
                    WebElement e = WaitElementToBePresent(driver , Locator) ;
                    return  e.isDisplayed() ? e : null  ;
                }
        );
    }

     public  static  WebElement WaitElementToBeClickable(WebDriver driver , By Locator){
                LogUtils.Info("Waiting the Element to be Clickable " , String.valueOf(Locator));
                return  new WebDriverWait(driver , Duration.ofSeconds(5)).until(
                driver1 -> {
                    WebElement e = WaitElementToBeVisible(driver , Locator) ;
                    return e.isEnabled()  ? e : null  ;
                }
        );
     }




}
