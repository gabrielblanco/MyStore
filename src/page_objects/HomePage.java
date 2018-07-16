package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(className = "login")
    WebElement linknToLogin;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToLogin(){
        linknToLogin.click();
    }
}
