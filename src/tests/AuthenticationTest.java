package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_objects.AuthenticationPage;
import page_objects.HomePage;

public class AuthenticationTest extends BaseTest {

    /**
     * Instances
     */
    HomePage homePage = new HomePage(getDriver());
    AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());

    /**
     * Verify that an invalid user can't login.
     */
    @Test()
    public void attemptToLogin(String email, String password){
        homePage.goToLogin();
        authenticationPage.attemptToLogin(email, password);
    }
}
