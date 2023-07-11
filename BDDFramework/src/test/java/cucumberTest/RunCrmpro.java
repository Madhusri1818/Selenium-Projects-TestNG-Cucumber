package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/CRMPRO.feature",
            glue="stepDefinition",
            monochrome=true,
            plugin= {"pretty","html:target/zoho.html",
            		"junit:target/cucumber-junit-report/Zoho.xml"},
            dryRun=false
)

public class RunCrmpro {

}
