package StepDef;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Extent.Extent_BDD.BaseDriver;
import StepDef.ActiLog;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import io.qameta.allure.Allure;

public class Hooks extends BaseDriver{
	@Before
	public void launchDriver() {
		BaseDriver.LaunchDriver();
	}
	@After(order = 1)
	public void aftersc(Scenario scenario) {
		if (scenario.isFailed()) {

			String screenshot = scenario.getName().replaceAll(" ", "_");
			byte[] srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcfile, "image/png", screenshot);
			//Allure.addAttachment("Failed case", new ByteArrayInputStream(srcfile) + screenshot);
		}
	}

	@After(order = 1)
	public void teardown() {
		BaseDriver.driver.close();

	}
}

/*
 * //Screen shot using Base64 formate public String getBase64Screenshot() {
 * return ((TakesScreenshot)ActiLog.driver).getScreenshotAs(OutputType.BASE64);
 * }
 * 
 * @After public void af(Scenario scenario) throws IOException,
 * InterruptedException { if(scenario.isFailed()) {
 * ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
 * MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot())
 * .build()); } }
 */
