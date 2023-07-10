package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = "src/test/resource/Features/ActiLog.feature", glue = {
		"StepDef" }, 
monochrome = true, 
dryRun = false, 
strict = true,
plugin = { "pretty",
				"json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunScript extends AbstractTestNGCucumberTests {

	
	
}
