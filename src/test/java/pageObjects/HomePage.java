package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public KeycloakPage autoTransit (){
        driver.get("https://keycloak.homologation.cloud/auth/realms/nxt2-dev/protocol/openid-connect/auth?client_id=frontend&redirect_uri=https%3A%2F%2Fnxt2.dev.nxt-mobility.cloud%2F&state=de4416c0-037f-467b-ba46-abac7f39d45d&response_mode=fragment&response_type=code&scope=openid&nonce=b28b1065-65f7-426e-8bcc-2b79d1f0001d&code_challenge=amub2nPxUIbKXGeIe0NAuX6aB0fAbnfNBSz00UXyLE4&code_challenge_method=S256");
        return new KeycloakPage(driver);
    }


}
