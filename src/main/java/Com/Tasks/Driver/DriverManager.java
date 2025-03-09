package Com.Tasks.Driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver  CreateInstance(String BrowserName){
       WebDriver driver = BrowserFactor.GetBrowser(BrowserName);
       setThreadLocal(driver);
       return threadLocal.get();
    }

    public static  void setThreadLocal(WebDriver driver){
        threadLocal.set(driver);
    }

    public static WebDriver GetDriver(){
        return threadLocal.get();
    }




}
