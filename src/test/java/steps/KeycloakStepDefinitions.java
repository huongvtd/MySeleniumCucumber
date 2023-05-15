package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.KeycloakPage;

public class KeycloakStepDefinitions extends BaseStep {

    WebDriver driver;
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://nxt2.dev.nxt-mobility.cloud/");
        driver.manage().window().maximize();
    }
    KeycloakPage keycloakPage = new KeycloakPage(driver);

    @Given("I am on Keycloak")
    public void iAmOnKeycloak() {
        driver.get("https://keycloak.homologation.cloud/auth/realms/nxt2-dev/protocol/openid-connect/auth?client_id=frontend&redirect_uri=https%3A%2F%2Fnxt2.dev.nxt-mobility.cloud%2F&state=de4416c0-037f-467b-ba46-abac7f39d45d&response_mode=fragment&response_type=code&scope=openid&nonce=b28b1065-65f7-426e-8bcc-2b79d1f0001d&code_challenge=amub2nPxUIbKXGeIe0NAuX6aB0fAbnfNBSz00UXyLE4&code_challenge_method=S256");
    }

    @When("I insert username")
    public void iInsertUsername() {
        keycloakPage.setUsername("huong.vuthidieu@nttdata.com");
    }

    @And("I insert password")
    public void iInsertPassword() {
        keycloakPage.setPassword("Abcd@1234");
    }

    @And("I click on Sign In button")
    public void iClickOnSignInButton() {
        keycloakPage.clickSignInButton();

    }

    @Then("I see Home Page")
    public void iSeeHomePage() {
    }
}
