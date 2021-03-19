package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginSauceLabsTest {
    //Declarar variable driver y una instancia de la clase SearchBookPage para usar sus métodos
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
        //loginSauceLabsPage.messageBookFound();
        loginSauceLabsPage.isLogoDisplayed();
    }
}
