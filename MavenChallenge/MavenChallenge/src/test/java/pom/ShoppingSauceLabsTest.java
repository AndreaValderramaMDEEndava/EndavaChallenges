package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ShoppingSauceLabsTest {

    private WebDriver driver;
    ShoppingSauceLabsPage shoppingSauceLabsPage;
    LoginSauceLabsPage loginSauceLabsPage;

    @Before
    public void setUp(){
        shoppingSauceLabsPage = new ShoppingSauceLabsPage(driver);
        loginSauceLabsPage = new LoginSauceLabsPage(driver);
        driver = shoppingSauceLabsPage.chromeDriverConnection();
        shoppingSauceLabsPage.openPage("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    //en una clase aparte los metodos
    public void test(){
        loginSauceLabsPage.loginOnSauceLabs();
        shoppingSauceLabsPage.shoppingOnSauceLabs();
        shoppingSauceLabsPage.fillTheInformation();
        shoppingSauceLabsPage.assertionOnSauceLabsPage();
        shoppingSauceLabsPage.isFinalLogoDisplayed();
    }
}
