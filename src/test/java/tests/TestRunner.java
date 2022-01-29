package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import utils.TestListener;

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber.html",
                "json:target/cucumber.json"},
        tags= "@SmokeTest or @Critical"
)

@Listeners({TestListener.class})
public class TestRunner extends AbstractTestNGCucumberTests {
}
