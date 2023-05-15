package steps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pageObjects.HomePage;

public class BaseStep {
    WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://nxt2.dev.nxt-mobility.cloud/");
//        driver.manage().window().maximize();
//    }
    @AfterClass
    public void tearDown (){
        driver.quit();
}

}
