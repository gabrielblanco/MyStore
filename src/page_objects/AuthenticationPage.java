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
    @FindBy (id = "email")
    WebElement emailLogin;
    @FindBy(id = "passwd")
    WebElement passwordLogin;
    @FindBy(id = "SubmitLogin")
    WebElement btnSignIn;

    /**
     * Constructor method.
     * @param driver is the web driver.
     */
    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void attemptToLogin(String email, String password){
        typeEmail(email);
        typePassword(password);
        clickOnSignInBtn();
    }

    private void typeEmail(String email){
        emailLogin.clear();
        emailLogin.sendKeys(email);
    }

    private void typePassword(String password){
        passwordLogin.clear();
        passwordLogin.sendKeys(password);
    }

    private void clickOnSignInBtn(){
        btnSignIn.click();
    }
}
