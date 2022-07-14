package cucumber.glue.hooks;

import com.epam.healenium.SelfHealingDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Component
public class WebDriverFactory {

    private WebDriver webDriver;
    private AppiumDriver mobileDriver;

    @Value("${driver.timeout.seconds}")
    private String timeOutBySeconds;
    @Value("${activate.SelfHealingDriver}")
    private String activateSelfHealingDriver;
    @Value("${appium.remote.host}")
    private String appiumRemoteHost;


    public WebDriver getDriver() {

        if(Boolean.parseBoolean(activateSelfHealingDriver)){
            System.out.println("SelfHealingDriver Active");
            return SelfHealingDriver.create(webDriver);
        }else {
            System.out.println("Normal Execution Active");
            return webDriver;
        }
    }

    @Bean(destroyMethod = "quit")
    public WebDriver getWebDriver(){
        String currentWebDriver = System.getProperty("browser", "");
        String activateMobile = System.getProperty("mobile", "");
        return (!Boolean.parseBoolean(activateMobile))?setWebDriver(currentWebDriver):setMobileDriver(currentWebDriver);
    }

    private WebDriver setWebDriver(String currentWebDriver){
        ChromeOptions chromeArguments = new ChromeOptions();
        if(!Boolean.parseBoolean(activateSelfHealingDriver)){
            chromeArguments.addArguments("--no-sandbox");
        }
        switch(currentWebDriver) {
            case ("firefox"):
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setCapability("marionette", true);
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case ("edge"):
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver(chromeArguments);
                webDriver.manage().deleteAllCookies();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                break;
        }
        return webDriver;
    }

    private AppiumDriver setMobileDriver(String currentMobileDriver){
        boolean isAPK = false;
        File app;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
        if(isAPK){
            app  = new File("The absolute or relative path to an *.apk file");
            switch (currentMobileDriver){
                case "Android":
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
                    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    break;
                case "IOS":
                    break;
            }
        }else {
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
        }
            mobileDriver = new AndroidDriver(new URL(appiumRemoteHost), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return mobileDriver;
    }
}
