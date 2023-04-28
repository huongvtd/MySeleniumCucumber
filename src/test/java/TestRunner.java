import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
// , dryRun = true
        , monochrome = true
// , tags = "@Tag1 or @Tag2"
        , tags = "@Tag3"
// , name = {"Link", "Logo"}
)
public class TestRunner {

}
