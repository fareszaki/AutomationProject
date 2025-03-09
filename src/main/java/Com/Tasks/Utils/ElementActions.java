package Com.Tasks.Utils;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions {
    private  ElementActions(){}
      @Step("Finding the Element")
    // Function to Return WebElement
     public  static WebElement FindElement(WebDriver driver , By Locator)
     {
         LogUtils.Info("Finding the Element " , String.valueOf(Locator));
         return driver.findElement(Locator) ;
     }
@Step("Sending Data")
     public static  void SendData(WebDriver driver , By Locator , String data) {
        Waits.WaitElementToBeClickable(driver ,Locator );
        Scrolling.ScrollingToElement(driver , Locator);
        FindElement(driver , Locator).sendKeys(data);
        LogUtils.Info("Sending Data " , data);
     }
@Step("Clicking on Element")
     public static  void ClickOnElement(WebDriver driver , By Locator) {
         Waits.WaitElementToBeClickable(driver ,Locator );
         Scrolling.ScrollingToElement(driver , Locator);
         FindElement(driver , Locator).click();
         LogUtils.Info("Clicked on Element " , String.valueOf(Locator));
     }
     @Step("Clearing the Field")

     public static  void hardDelete(WebDriver driver , By Locator) {
         Waits.WaitElementToBeClickable(driver ,Locator );
         Scrolling.ScrollingToElement(driver , Locator);
         FindElement(driver , Locator).sendKeys(Keys.chord(Keys.CONTROL , "a"));
         FindElement(driver , Locator).sendKeys(Keys.DELETE);
         LogUtils.Info("Deleted data from field " , String.valueOf(Locator));
     }
     @Step("Getting Text")
     public static String GetText(WebDriver driver , By Locator){
        return FindElement(driver , Locator).getText() ;
     }




}
