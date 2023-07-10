package TestRunner;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test

@CucumberOptions(features="Features",
glue= {"StepDefinition","driverFactory"},
plugin= {"pretty","html:target/cucmber-output/HRM.html"
		},
monochrome=true,
dryRun=true
)
public class MyRunner extends AbstractTestNGCucumberTests  {

	
	
}
