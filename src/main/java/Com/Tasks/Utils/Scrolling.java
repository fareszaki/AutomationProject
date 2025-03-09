package Com.Tasks.Utils;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {
    private Scrolling(){}

@Step("Scrolling to the Element")
    public static  void ScrollingToElement(WebDriver driver , By Locator) {
        LogUtils.Info("Scrolling to the Element " , String.valueOf(Locator));
        ((JavascriptExecutor) driver ).executeScript("arguments[0].scrollIntoView(true);", ElementActions.FindElement(driver , Locator)) ;
    }
}
