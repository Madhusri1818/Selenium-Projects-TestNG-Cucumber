package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions( features = "src/test/resources/Features/loginHRM.feature", glue = "StepDefinition",
plugin="pretty")

public class Run extends AbstractTestNGCucumberTests {

}
