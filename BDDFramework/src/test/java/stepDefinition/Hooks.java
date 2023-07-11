package stepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BehaviourDriven.BDDFramework.BaseDriver;
import cucumberTest.TestRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseDriver{

	static WebDriver driver;
	public static ExtentHtmlReporter extentHtml;
	public static ExtentReports report;
	public ExtentTest test;
	public static int i=0;

//	@Before
	public void before(Scenario scenario) {
		i++;
		//test=TestRunner.report.createTest(scenario.getName()+i);
	TestRunner.test=this.test;
	System.out.println(i);
	}
	
	// @After(order=1)
	  public void screenshotM(Scenario scenario) throws Exception

	  { 
		  if (scenario.isFailed())
	  { 
			  String screenshot = scenario.getName().replaceAll(" ", "_");
	  
			//  SetCal.date_timeSet();
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File Dest = new File("C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\BDDFramework\\screenshot\\" +screenshot + ".png"); 
	  FileUtils.copyFile(src, Dest);
	  test.fail("Failed Test"+test.addScreenCaptureFromPath( "C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\BDDFramework\\screenshot\\" + screenshot+ ".png"));
	  
	  }}
	
}
