package Com.Tasks.Utils;

import org.testng.asserts.SoftAssert;

public class CustomSoftAssertion {
      public  static  SoftAssert s = new SoftAssert();
    public static void AssertAll(){
        try {
              s.assertAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
