package stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BehaviourDriven.BDDFramework.BaseDriver;
import cucumberTest.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginCrmpro extends BaseDriver {
	public static ExtentHtmlReporter extentHtml;
	public static ExtentReports report;
	public static ExtentTest test;
	static int i=0;
	
	@Given("Launch application CRMPRO")
	public void launch_application_crmpro() {
	    BaseDriver.LaunchDri("https://classic.freecrm.com/index.html");
	    driver.manage().window().maximize();
	    test= TestRunner.test;
	   TestRunner.test.pass("Launch brower");
	}

	@When("user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
test.pass("User Enters name and password");
	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		test.pass("User clicks on login");
	}

	@Then("I validate the Title")
	public void i_validate_the_title() {
		String ActualTitle="CRMPRO";
		Assert.assertEquals( ActualTitle,driver.getTitle());
		test.pass("user validate the title");
	}
	@Then("user moves to new contact page")
	public void user_moves_to_new_contact_page() {
		WebElement frame=driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		driver.switchTo().frame(frame);
		Actions action=new Actions(driver);
		WebElement contact_lnk=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		WebElement New_Contact=driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		
		action.moveToElement(contact_lnk).build().perform();
		New_Contact.click();
		}

	@Then("User enter \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enter_and_and(String firstname, String Lastname, String phonenum) {
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		driver.findElement(By.name("surname")).sendKeys(Lastname);
		driver.findElement(By.name("phone")).sendKeys(phonenum);
		
		
	}

	@Then("close the browser")
	public void close_the_browser() {
		//driver.close();
	}
	
	


}
