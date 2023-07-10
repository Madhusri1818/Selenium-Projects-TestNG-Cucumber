package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Extent.Extent_BDD.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Epic("Epic :ActiLog")
//@Feature("Login functionality")
public class ActiLog extends BaseDriver{

	//public static WebDriver driver;

	//@Description("Launched browser")
	@Given("I launched the Browser")
	public void i_launched_the_browser() {
		//driver=BaseDriver.driver;
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		System.out.println("Launching browser");
		driver.get("https://demo.actitime.com/login.do");
	}

	@And("click on Login link")
	public void click_on_login_link() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("validate the outcomes")
	public void validate_the_outcomes() {

		if (driver.findElement(By.id("logo_aT")).isDisplayed()) {
			System.out.println("ACTITIME LOGO is displayed");
		} else {
			System.out.println("logo is not displayed_invalid xpath provided");
		}
	}

	@When("Enter  data {string} and {string}")
	public void enter_data_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

	}

	@Then("logout the app")
	public void logout_the_app() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	@Then("close the browser")
	public void close_the_browser() {
		// driver.close();
		System.out.println("tear down browser");
	}

}
