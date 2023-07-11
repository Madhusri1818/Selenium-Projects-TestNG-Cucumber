package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BehaviourDriven.BDDFramework.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterParaBank {
	static WebDriver driver;
	@Given("I am on a newUser_Registration Link")
	public void i_am_on_a_new_user_registration_link() {
	   WebDriverManager.chromedriver().setup();
	 //   driver=new ChromeDriver();
	   // driver.manage().window().maximize();
	   BaseDriver driver=new  BaseDriver();
	   driver.LaunchDri("\"https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC\"");
	   // driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}

	@When("Enter valid data in reg_Page")
	public void enter_valid_data_in_reg_page(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		List<String> listdata= dataTable.asList();
		driver.findElement(By.id("customer.firstName")).sendKeys(listdata.get(0));
		driver.findElement(By.id("customer.lastName")).sendKeys(listdata.get(1));
		driver.findElement(By.id("customer.address.street")).sendKeys(listdata.get(2));
		driver.findElement(By.id("customer.address.city")).sendKeys(listdata.get(3));
		driver.findElement(By.id("customer.address.state")).sendKeys(listdata.get(4));
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(listdata.get(5));
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(listdata.get(6));
		}

	@Then("user should be regester successfull")
	public void user_should_be_regester_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
