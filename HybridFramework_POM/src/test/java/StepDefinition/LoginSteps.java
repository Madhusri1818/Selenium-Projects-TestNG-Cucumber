package StepDefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.page.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private String title;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	DriverFactory.getDriver().get("https://classic.freecrm.com/index.html");	
	}

	@When("user gets the title")
	public void user_gets_the_title() {
		title=loginpage.gettingTitle();
		System.out.println(title);
	}

	@Then("user validate the title {string}")
	public void user_validate_the_title(String string) {
		Assert.assertTrue(title==string);
		
	}

	@Then("site logo should be displayed")
	public void site_logo_should_be_displayed() {
		loginpage.LogoExists();
		Assert.assertTrue(loginpage.LogoExists()); //becoz it is boolean directly we add assert
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.EnteruserName(username);

	}

	@And("user enters password {string}")
	public void user_enters_password(String pwd) {
		loginpage.Enterpassword(pwd);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		loginpage.ClickLogin();
	}

	


}
