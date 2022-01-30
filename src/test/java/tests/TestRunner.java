package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import utils.TestListener;

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber.html",
                "json:target/cucumber.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
