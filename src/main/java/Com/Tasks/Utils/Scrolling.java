package Com.Tasks.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {
    private Scrolling(){}


    public static  void ScrollingToElement(WebDriver driver , By Locator) {
        LogUtils.Info("Scrolling to the Element " , String.valueOf(Locator));
        ((JavascriptExecutor) driver ).executeScript("arguments[0].scrollIntoView(true);", ElementActions.FindElement(driver , Locator)) ;
    }
}
