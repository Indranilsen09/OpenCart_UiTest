package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        ChromeOptions option =  getChromeOptions();
        ChromeDriver driver = new ChromeDriver(option);
        Real_Driver= driver;
    }

    private static ChromeOptions getChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type", "--no-proxy-server", "--ignore-certificate-errors");
        options.addArguments("disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.setCapability("acceptSslCerts", true);
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        return options;
    }

    public static WebDriver getWebDriver()
    {
        launchbrowser();
        return Real_Driver;
    }





}
