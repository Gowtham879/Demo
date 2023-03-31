package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/FeatureFile/Mobile.feature",
        glue="StepsDefination",
//        tags="@tag1 or @tag2",
        monochrome=true,
        plugin={"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm","json:target/cucumber.json"}
)
public class DemoRunner extends AbstractTestNGCucumberTests {
}
