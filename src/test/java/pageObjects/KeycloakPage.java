package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeycloakPage {
    private WebDriver driver;

    public KeycloakPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername (String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public void setPassword (String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public HomePage clickSignInButton (){
        driver.findElement(By.id("kc-login")).click();
        return new HomePage(driver);
    }
}
