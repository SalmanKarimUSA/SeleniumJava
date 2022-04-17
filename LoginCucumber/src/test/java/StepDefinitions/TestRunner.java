package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspace\\LoginCucumber\\src\\test\\resources\\Features\\SwagLabsLogin.feature", 
glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports.html"},
dryRun = false
)
public class TestRunner {

}
