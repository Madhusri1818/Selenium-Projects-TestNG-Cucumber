package ParallelRun;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = "src/test/resources/Feature", 
glue = { "StepDefinition","AppHooks" },
plugin = { "pretty", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/parallel.html",
				"timeline:test-output-thread/"},
monochrome = true,
dryRun = false

)
public class MyTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
