package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        if(webDriver.get() == null)
        {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }
    private static WebDriver createDriver() {
        WebDriver driver = null;

        String browserType = getBrowserType();
        System.out.println("Browser type: " + browserType);  // Debugging line

        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/driver/drivers/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                chromeOptions.addArguments("--remote-allow-origins=*");
                System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
                System.setProperty("webdriver.chrome.verboseLogging", "true");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/driver/drivers/geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new FirefoxDriver(firefoxOptions);
                break;

            default:
                throw new IllegalArgumentException("Browser type not supported: " + browserType);

        }
        System.out.println("Browser type: " + browserType);  // Debugging line
        if (driver != null) {
            driver.manage().window().maximize();
        } else {
            System.out.println("Driver is null, could not create the WebDriver.");
        }

        return driver;
    }
    private static String getBrowserType() {
        String browserType = null;
        String browserTypeRemoteValue = System.getProperty("browserType");

        try {
            if(browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()){
                Properties properties = new Properties();
                FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
                properties.load(file);
                browserType = properties.getProperty("browser").toLowerCase().trim();
            } else {
                browserType = browserTypeRemoteValue;
            }

        } catch (IOException ex) {
            System.out.println("Failed to load properties file: " + ex.getMessage());
        }

        if (browserType == null || browserType.isEmpty()) {
            throw new IllegalArgumentException("Browser type is not specified in the properties file.");
        }

        return browserType;
    }

    public static void cleanUpDriver()
    {
            webDriver.get().quit();
            webDriver.remove();
    }

}
