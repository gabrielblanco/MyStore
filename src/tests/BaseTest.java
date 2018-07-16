package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    /**
     * Web Driver
     */
    private static WebDriver driver;

    /**
     * Specifies the driver path for each browser..
     */
    private static String chromeDriverPath = "C:\\Users\\gabri\\IdeaProjects\\MyStoreAutomation\\resources\\chromedriver.exe";
    private static String firefoxDriverPath = "resources/geckodriver.exe";

    /**
     * Returns the active web driver.
     * @return the active web driver.
     */
    public WebDriver getDriver(){
        return driver;
    }

    /**
     * Initialize the web driver.
     * @param browser is the browser to run the tests.
     * @param baseUrl is the url of the website.
     */
    @BeforeTest
    @Parameters({"browser", "baseUrl"})
    public static void setDriver(String browser, String baseUrl){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = initChromeDriver(baseUrl);
        } else if(browser.equalsIgnoreCase("firefox")) {
            driver = initFireforxDriver(baseUrl);
        } else {
            System.out.println("Browser name not found. Initializing chrome driver instead.");
            driver = initChromeDriver(baseUrl);
        }
    }

    /**
     * Initialize the driver on chrome browser.
     * @param baseUrl is the url to navigate.
     * @return the initialized web driver.
     */
    private static WebDriver initChromeDriver(String baseUrl) {
        System.out.println("Initializing Chrome browser for automation test.");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        return driver;
    }

    /**
     * Initialize the driver on firefox browser.
     * @param baseUrl is the url to navigate.
     * @return the initialized web driver.
     */
    private static WebDriver initFireforxDriver(String baseUrl) {
        System.out.println("Initializing Firefox browser for automation test.");
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        return driver;
    }

    /**
     * Tears down the driver.
     */
    @AfterTest
    public static void tearDown(){
        System.out.println("Test process finished.");
        driver.close();
    }
}
