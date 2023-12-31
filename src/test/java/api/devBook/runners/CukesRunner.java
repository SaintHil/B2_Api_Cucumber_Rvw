package api.devBook.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "api/devBook/stepDefs",
        dryRun = false,
        tags = "@uı_and_api"
)
public class CukesRunner {
}
