package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingSauceLabsPage extends BaseTest{

    public ShoppingSauceLabsPage(WebDriver driver) {
        super(driver);
    }

    By backpack_product = By.xpath("//*[@class='inventory_item_name' and text()='Sauce Labs Backpack']");
    By buttonAddToCart = By.xpath("//*[@class='btn_primary btn_inventory' and text()='ADD TO CART']");
    By iconShoppingCart = By.xpath("//*[@data-icon='shopping-cart']");
    By buttonCheckOut = By.xpath("//*[@class='btn_action checkout_button']");
    By nameField = By.xpath("//*[@class='btn_action checkout_button']");
    By lastNameField = By.xpath("//*[@class='btn_action checkout_button']");
    By postalZoneField = By.xpath("//*[@class='btn_action checkout_button']");
    By buttonContinue = By.xpath("//*[@class='btn_primary cart_button']");
    By buttonFinish = By.xpath("//*[@class='btn_action cart_button' and text()='FINISH']");
    By thanksMessage = By.xpath("//*[@class='complete-header' and text()='THANK YOU FOR YOUR ORDER']");
    public String finalMessageExpected = "THANK YOU FOR YOUR ORDER";
    By finalLogo =  By.xpath("//*[@class='subheader' and text()='Finish']");


    //ACCIONES SOBRE LOS WEB ELEMENTS USANDO LOS METODOS WRAPPER QUE CREAMOS DE SELENIUM

    public void shoppingOnSauceLabs(){
        waitElement(backpack_product);
        click(backpack_product);
        waitElement(buttonAddToCart);
        click(buttonAddToCart);
        waitElement(iconShoppingCart);
        click(iconShoppingCart);
        click(buttonCheckOut);
    }

    public void fillTheInformation(){
        waitElement(nameField);
        clearSpace(nameField);
        click(nameField);
        type("Mateo",nameField);
        tab(nameField);
        clearSpace(lastNameField);
        type("Castano",lastNameField);
        tab(lastNameField);
        clearSpace(postalZoneField);
        type("05000",postalZoneField);
        click(buttonContinue);
        waitElement(buttonFinish);
        click(buttonFinish);
    }

    public void assertionOnSauceLabsPage(){
        String thanksMessageText = getText(thanksMessage);
        Assert.assertEquals(thanksMessageText,finalMessageExpected);

    }

    public Boolean isFinalLogoDisplayed(){
        return isDisplayed(finalLogo);
    }



}
