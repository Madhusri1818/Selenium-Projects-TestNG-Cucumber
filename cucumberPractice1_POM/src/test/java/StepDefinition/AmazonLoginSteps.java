package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.DriverFactory.DriverBase;
import com.WebElementPages.AmazonLoginEle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLoginSteps {
	public static WebDriver driver;

	@Given("Launch AmazonSite")
	public void launch_amazon_site() {
		System.out.println("scenario start");
	}

	@When("user enters Email and Password")
	public void user_enters_email_and_password(DataTable dataTable) throws Exception {
		driver=DriverBase.driver;
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// //For other transformations you can register a DataTableType.
		AmazonLoginEle loginData = new AmazonLoginEle(driver);
		List<Map<String, String>> data = dataTable.asMaps();
		String username = data.get(0).get("username");
		String pwd = data.get(0).get("password");
		loginData.loginFunction(username, pwd);

	}

	@Then("user step into homepage")
	public void user_step_into_homepage() {
		AmazonLoginEle loginData = new AmazonLoginEle(driver);
		String title = loginData.getTittle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

}
