package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features/Login.feature"},
	plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
	glue = "steps"
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
