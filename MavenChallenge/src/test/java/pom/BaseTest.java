package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;

    public BaseTest(WebDriver driver){
        this.driver = driver;
    }

    //INVOCAR AL DRIVER PARA CREAR UNA INSTANCIA DEL NAVEGADOR
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //ENVOLTORIO PARA METODOS DE SELENIUM
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public void waitElement(By locator){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void clearSpace(By locator){
        driver.findElement(locator).clear();
    }

    public void enter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    //METODO QUE RECIBE LA URL Y ABRE PAGINA WEB
    public void openPage(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
}
