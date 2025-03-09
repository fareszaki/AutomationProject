package Com.Tasks.Driver;

import Com.Tasks.Utils.ClassOption;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactor {
      private BrowserFactor(){};
      public static WebDriver GetBrowser(String BrowserName) {
          switch(BrowserName.toLowerCase()){
              case "chrome":
                  return  new ChromeDriver(ClassOption.GetChromeOption());

              case  "edge" :
                  return new EdgeDriver(ClassOption.RetuenEdgeOption());
              default:
                  return new FirefoxDriver(ClassOption.ReturnFireFoxOption());

          }

      }

}
