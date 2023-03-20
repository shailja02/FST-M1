import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@activity4",
        plugin = {"json:target/json-reports/json-report.json"},
        monochrome = true
)

public class ActivitiesRunner4 {}

