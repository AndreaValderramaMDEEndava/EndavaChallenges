package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSauceLabsPage extends BaseTest{

    public LoginSauceLabsPage(WebDriver driver) {
        super(driver);
    }

    By username = By.xpath("//*[@id=\"user-name\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@id=\"login-button\"]");
    By messageFound = By.xpath("//*[contains(text(),\"Products\")]");
    By logoPage = By.xpath("//*[@class=\"app_logo\"]");
    public String messageExpected = "Products";

    //ACCIONES SOBRE LOS WEB ELEMENTS USANDO LOS METODOS WRAPPER QUE CREAMOS DE SELENIUM
    public void loginOnSauceLabs(){
        clearSpace(username);
        type("standard_user",username);
        clearSpace(password);
        click(password);
        type("secret_sauce",password);
        click(loginButton);
    }

    public void assertionOnSauceLabsPage(){
        String messageFoundText = getText(messageFound);
        Assert.assertEquals(messageExpected,messageFoundText);

    }

    public Boolean isLogoDisplayed(){
        return isDisplayed(logoPage);
    }


}
