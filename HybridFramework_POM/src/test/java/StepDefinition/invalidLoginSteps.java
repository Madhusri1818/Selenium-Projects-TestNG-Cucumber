package StepDefinition;

import java.io.IOException;
import java.util.Properties;

import com.factory.DriverFactory;
import com.page.ConfigProp;
import com.page.LoginPage;

import AppHooks.readexcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidLoginSteps {
	ConfigProp config = new ConfigProp();
	Properties p;
	DriverFactory driver = new DriverFactory();
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	readexcel data = new readexcel();

	@Given("user launch browser")
	public void user_launch_browser() {
		/*p = config.init_config();
		String browse = p.getProperty("URL");
		driver.init_Driver(browse);*/
		DriverFactory.getDriver().get("https://classic.freecrm.com/index.html");
	}

	@When("enter Data")
	public void enter_data() throws IOException, Exception {
		String username=data.dataexcel(0, 0);
		String pwd=data.dataexcel(1, 1);
		
		System.out.println(username + pwd);
		Thread.sleep(3000);
		loginpage.EnteruserName(username);
		loginpage.Enterpassword(pwd);

	}
	@When("enter invalidData")
	public void  enter_invalidData() throws IOException, Exception {
		String username=data.dataexcel(2, 0);
		String pwd=data.dataexcel(2, 1);
		
		System.out.println(username + pwd);
		Thread.sleep(3000);
		loginpage.EnteruserName(username);
		loginpage.Enterpassword(pwd);
	}

	@Then("user click on login")
	public void user_click_on_login() {
		loginpage.ClickLogin();
	}

}
