package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginSauceLabsTest {
<<<<<<< HEAD
    //Declarar variable driver y una instancia de la clase Login Page para usar sus métodos
=======
    //Declarar variable driver y una instancia de la clase SearchBookPage para usar sus métodos
>>>>>>> ac24d54cf5b8d52f28db4b397d52498130ff8b49
    private WebDriver driver;
    LoginSauceLabsPage loginSauceLabsPage;

    @Before
    public void setUp(){
        loginSauceLabsPage = new LoginSauceLabsPage(driver);
        driver = loginSauceLabsPage.chromeDriverConnection();
        loginSauceLabsPage.openPage("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    //en una clase aparte
    public void test(){
        loginSauceLabsPage.loginOnSauceLabs();
        loginSauceLabsPage.assertionOnSauceLabsPage();
<<<<<<< HEAD
=======
        //loginSauceLabsPage.messageBookFound();
>>>>>>> ac24d54cf5b8d52f28db4b397d52498130ff8b49
        loginSauceLabsPage.isLogoDisplayed();
    }
}
