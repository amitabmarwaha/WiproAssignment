import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepDefinitions", "utilities", "pageObjects"},
        format = {"html:target/html-reports","json:target/cucumber.json"},
        tags = "@browser"
)
public class TestRunner {
}
