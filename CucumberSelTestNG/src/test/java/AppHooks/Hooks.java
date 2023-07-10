package AppHooks;


import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;

public class Hooks extends BaseDriver {
public static WebDriver driver;
	
	@Before(order= 1)
	public void getbrowser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select browser:"+" "
				+ "chrome"+" "
				+ "edge"+" "
				+ "firefox"
				);
		String browser = sc.nextLine();
		System.out.println(browser+ "current browser");
		
		driver=BaseDriver.init_Driver(browser);
		/*WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();*/
	}
@After(order=1)
	public void driverquit() {
		//driver.quit();
	}

@After(order=2)
public void screenshot(Scenario scenario) {
	
		
	if (scenario.isFailed()) {

		String screenshot = scenario.getName().replaceAll(" ", "_");
		byte[] srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcfile, "image/png", screenshot);
		Allure.addAttachment("Failed case", new ByteArrayInputStream(srcfile) + screenshot);
	}
}


}
