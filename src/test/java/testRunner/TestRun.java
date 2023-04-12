package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/",
        glue = "stepDefinations",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output"}
       // tags= "@sanity"
)
public class TestRun {
}
