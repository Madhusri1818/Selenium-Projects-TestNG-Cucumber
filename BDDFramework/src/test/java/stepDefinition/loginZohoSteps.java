package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BehaviourDriven.BDDFramework.BaseDriver;
import cucumberTest.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class loginZohoSteps {
	static WebDriver driver;
	public static ExtentHtmlReporter extentHtml;
	public static ExtentReports report;
	public static ExtentTest test;
	public static int i=0;
	
	
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		BaseDriver.LaunchDri("https://www.zoho.com/");
		driver=BaseDriver.driver;
		test=TestRunner.test;
	//TestRunner.test.pass("Launching browser");
	}

	@And("click on SignIn button")
	public void click_on_sign_in_button() {

		driver.findElement(By.linkText("Sign in")).click();
	//	test.pass("click on signin");
	}

	@When("Enter email {string} in email field")
	public void enter_email_in_email_field(String useremail) throws InterruptedException {
		driver.findElement(By.id("login_id")).sendKeys(useremail);
		driver.findElement(By.xpath("//*[@id='nextbtn']")).click();
		Thread.sleep(2000);
		//test.pass("Enter Email");
		
	}

	@And("Enter password  {string} in password field")
	public void enter_password_in_password_field(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
		test.pass("Enter password");
		
	}

	@Then("click on Login")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[@class='btn blue' and @id='nextbtn']")).click();
		test.pass("Click on login");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Zoho"));
		//test.pass("Verify Title");
		
		driver.close();

	}

	
	 


}
