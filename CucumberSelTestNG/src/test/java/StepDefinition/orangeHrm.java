package StepDefinition;

import org.testng.annotations.Test;

import AppHooks.Hooks;
import driverFactory.BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangeHrm   {
	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		driver=Hooks.driver;
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String userName) throws Exception {
		System.out.println("Username entered");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		 System.out.println("Password entered");
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		  driver.findElement(By.xpath("//button[text()=' Login ']")
				  ).click();
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		/*String newPageText = driver.findElement(By.id("welcome")).getText();
        System.out.println("newPageText =" + newPageText);*/
	}

}
