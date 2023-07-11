package cucumberTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "stepDefinition", dryRun = false, plugin = { "pretty",
		"html:test-output/Report.html",
		"junit:test-output/cucumber-junit-report/report.xml",
		"json:target/report.json",
		
		}
)
public class TestRunner {

	public static ExtentHtmlReporter extentHtml;
	public static ExtentReports report;
	public static ExtentTest test;

	@BeforeClass

	public static void beforeclass() {
		System.out.println("beforeclass");
		extentHtml = new ExtentHtmlReporter(".//TestReports//report.html");
		report = new ExtentReports();
		report.attachReporter(extentHtml);
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("Afterclass");
		report.flush();
	}

}
