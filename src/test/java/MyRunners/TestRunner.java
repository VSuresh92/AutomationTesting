package MyRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features",
glue= {"stepDefinitions"},
dryRun=false,
monochrome=true,
plugin = {"pretty","html:Reports/cucumber-html-report", "json:Reports/cucumber-json-report.json" }
)

public class TestRunner {

}
