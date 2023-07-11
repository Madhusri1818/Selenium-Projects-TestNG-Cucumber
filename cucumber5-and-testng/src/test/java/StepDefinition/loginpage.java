package StepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	@Given("User is on Home page")
	public void user_is_on_Home_page() {
		 commondef.driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String userName) {
		 System.out.println("Username Entered");
	        commondef.driver.findElement(By.name("txtUsername")).sendKeys(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		 System.out.println("password Entered");
	        commondef.driver.findElement(By.name("txtPassword")).sendKeys(password);
	        commondef.driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		String newPageText = commondef.driver.findElement(By.id("welcome")).getText();
        System.out.println("newPageText :" + newPageText);
       // assertThat(newPageText, contains("Welcome"));
	}

	@Then("Error message {string} should be displayed")
	public void error_message_should_be_displayed(String message) {
		 String errorMessage = commondef.driver.findElement(By.id("spanMessage")).getText();
	        System.out.println("Error Message :" + errorMessage);
	        Assert.assertEquals(errorMessage, message);
	}



}
