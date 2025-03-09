package Com.Tasks.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {
    private  LogUtils(){}

    public  static Logger logger(){
        return  LogManager.getLogger(Thread.currentThread().getStackTrace()[3].getClassName());
    }

    // Log Info
    public  static void Info(String... Message){
        logger().info(String.join("",Message));
    }
    public  static  void trace(String... Message){
        logger().trace(String.join(" ",Message));
    }

    public static  void Error(String... Message){
        logger().error(String.join(" ",Message));
    }
    public static void Fetal(String... Message){
        logger().fatal(String.join(" ",Message));
    }
    public static void Debug(String... Message){
        logger().debug(String.join(" ",Message));
    }
    public static void Warn(String... Message){
        logger().warn(String.join(" ",Message));
    }



}
