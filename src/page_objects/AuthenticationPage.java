package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    /**
     * Web driver.
     */
    WebDriver driver;

    /**
     * Web element selectors.
     */
    @FindBy (xpath = "")
    WebElement signInBtn;

    /**
     * Constructor method.
     * @param driver is the web driver.
     */
    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
