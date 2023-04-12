package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D://Users//skale//eclipse-workspace//HybridFramwork//Features//OrangeHRM.feature",
        glue = "extraStepDefinationsFile",
        plugin = {"pretty", "html:test-output"}
)
public class TestRunnerClass {

}
