package Helpers;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.logging.Level;

public class webDriverHelper
{
    private static RemoteWebDriver Real_Driver =null;
    private static String driverPath="\\tools\\ChromeDriver\\chromedriver.exe";

    public static void launchbrowser()
    {
        System.getProperty("webdriver.chrome.driver","user.dir"+driverPath);
    }





}
