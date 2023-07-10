package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppHooks.Hooks;
import driverFactory.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon {
	
	public static WebDriver driver;
	@Given("Launch Amazon site")
	public void launch_amazon_site() {
		driver=Hooks.driver;
		driver.get("https://www.amazon.com/");
	}

	@When("click on sign-In")
	public void click_on_sign_in() {
		
	}

	@Then("validate signin butto")
	public void validate_signin_butto() {
		
	}

}
