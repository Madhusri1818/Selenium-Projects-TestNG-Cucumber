package Testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/invalidlogin.feature",
glue = { "StepDefinition", "AppHooks" },
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/invaliddata.html"},
monochrome = true,
dryRun=false

)
public class MyTestRunner {

}
