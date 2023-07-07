package StepDefinition;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.DriverFactory.DriverBase;
import com.WebElementPages.SearchBoxEle;

import AppHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ValidateSearchBoxSteps  {
	public static WebDriver driver;
	
	@Given("Open site")
	public void open_site() {
		/* WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.amazon.in/");*/
	}

	@When("Clickon serach box")
	public void clickon_serach_box() throws Exception {
		SearchBoxEle data=new SearchBoxEle(driver);
		Thread.sleep(3000);
		data.countOfSearcchDropDown();
		data.ActionDropBoxSearch();
		data.ClicksearchinBox("Mobile");
		data.ClickSearch();
		
	}

	@Then("validat ethe outcome of seacrch box")
	public void validat_ethe_outcome_of_seacrch_box() {
		driver=DriverBase.driver;
		SearchBoxEle data=new SearchBoxEle(driver);
		int actual=42;
		int expected=driver.findElements(data.selectDropDown_count).size();
		//assert.assertEquals(expected, actual);
		if(expected==actual) {
			System.out.println("Assertion is passed");
		}else {
			System.out.println("Assertioin got failed");
		}
	}


}
