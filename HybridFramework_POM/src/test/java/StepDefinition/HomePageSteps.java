package StepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.page.HomePage;
import com.page.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private HomePage Homesection;

	@Given("user already logged into login page")
	public void user_already_logged_into_login_page(DataTable dataTable) {

		List<Map<String, String>> AllList = dataTable.asMaps();
		String username = AllList.get(0).get("username");
		String password = AllList.get(0).get("password");
		DriverFactory.getDriver().get("https://classic.freecrm.com/index.html");
		Homesection = loginpage.DoLogin(username, password);
	}

	@Given("user on home page")
	public void user_on_home_page() {
		Homesection.getHomepagetitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		Assert.assertTrue(Homesection.getHomepagetitle().contains("CRMPRO"));
	}

	@Then("User gets sections in Home")
	public void user_gets_sections_in_home(DataTable SectionTable) {
		
		List<String> ActListsections = SectionTable.asList();
		System.out.println("actual sections: " + ActListsections);
		loginpage.frame();
		List<String> ExpectListsections = Homesection.homepageList();
		System.out.println("Expected Sections list:" + ExpectListsections);

		Assert.assertTrue(ExpectListsections.equals(ActListsections));
	}

	@Then("Sections in Homepage should be {int}")
	public void sections_in_homepage_should_be(Integer ExpectedSecsize) {
		int ActualSecsize = Homesection.getHomeSecCount();
		Assert.assertTrue(ActualSecsize == ExpectedSecsize);
	}

}
