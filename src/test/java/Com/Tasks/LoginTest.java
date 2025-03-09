package Com.Tasks;

import Com.Tasks.Driver.BrowserFactor;
import Com.Tasks.Driver.DriverManager;
import Com.Tasks.Pages.LoginPage;
import Com.Tasks.Utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver ;

    @BeforeMethod
    public void ini(){
        driver=DriverManager.CreateInstance("chrome");
       new LoginPage(driver)
               .gotopage("https://tasks.almedadsoft.com/#/");
    }
        @Test
        public void test(){
            LogUtils.Info("Test Started");
            new LoginPage(driver).FillEmailField("wesam@almedadsoft.com").FillPasswordField("as").clickOnLoginButton().AssertErrorPassword();
          }


    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

}
