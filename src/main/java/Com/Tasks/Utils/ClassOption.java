package Com.Tasks.Utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ClassOption {
    private ClassOption(){};

      public static ChromeOptions GetChromeOption(){
          ChromeOptions options = new ChromeOptions();
          // Common options
          options.addArguments("--start-maximized");           // Start Chrome maximized
          options.addArguments("--disable-notifications");     // Disable notifications
          options.addArguments("--disable-popup-blocking");    // Disable popup blocking
          options.addArguments("--disable-infobars");          // Disable infobars

          // Performance options
          options.addArguments("--disable-extensions");        // Disable extensions
          options.addArguments("--disable-gpu");               // Disable GPU hardware acceleration
          options.addArguments("--no-sandbox");                // Disable sandbox mode
          options.addArguments("--disable-dev-shm-usage");     // Overcome limited resource problems

          // Browser behavior
          options.addArguments("--incognito");                 // Run in incognito mode
          options.setExperimentalOption("excludeSwitches",
                  new String[]{"enable-automation"}); // Hide automation info bar
          options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

          return options ;


      }

      public  static EdgeOptions RetuenEdgeOption(){
          EdgeOptions options = new EdgeOptions();
          // common options
          options.addArguments("--start-maximized");
          options.addArguments("--disable-notifications");
          options.addArguments("--disable-popup-blocking");
          options.addArguments("--disable-infobars");

          // Performance options
          options.addArguments("--disable-extensions");        // Disable extensions
          options.addArguments("--disable-gpu");               // Disable GPU hardware acceleration
          options.addArguments("--no-sandbox");                // Disable sandbox mode
          options.addArguments("--disable-dev-shm-usage");     // Overcome limited resource problems
          // Browser behavior
          options.addArguments("--incognito");                 // Run in incognito mode
          options.setExperimentalOption("excludeSwitches",
                  new String[]{"enable-automation"}); // Hide automation info bar
          options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

          return options ;

      }

      public static FirefoxOptions ReturnFireFoxOption(){
          FirefoxOptions options = new FirefoxOptions();
          // common options
          options.addArguments("--start-maximized");
          options.addArguments("--disable-notifications");
          options.addArguments("--disable-popup-blocking");
          options.addArguments("--disable-infobars");

          // Performance options
          options.addArguments("--disable-extensions");        // Disable extensions
          options.addArguments("--disable-gpu");               // Disable GPU hardware acceleration
          options.addArguments("--no-sandbox");                // Disable sandbox mode
          options.addArguments("--disable-dev-shm-usage");     // Overcome limited resource problems
          // Browser behavior
          options.addArguments("--incognito");                 // Run in incognito mode
          options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
          return options ;

      }

}
