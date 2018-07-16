package data_providers;

import org.testng.annotations.DataProvider;

public class LoginDataProviders {

    @DataProvider(name = "attemptToLogin")
    public static Object[][] invalidData(){
        return new Object[][]{
                {"roslynrh12@gmail.com", "hellobaby"},
                {"gabriel.blanco03@hotmail.com", "Iloveyou"}
        };
    }
}
