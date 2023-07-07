package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.page.ConfigProp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	ConfigProp configdata;
	DriverFactory drivefactory;
	Properties pro;
	WebDriver driver;
	
	@Before(order= 1)
	public void getpropertyFile() {
		 configdata=new ConfigProp();
		pro=configdata.init_config();
	}
	
	@Before(order= 2)
	public void getbrowser() {
		String browser=pro.getProperty("browser");//chrome
		System.out.println(browser+ "current browser");
		 drivefactory=new DriverFactory();
		 driver=drivefactory.init_Driver(browser);
	}
@After(order=1)
	public void driverquit() {
		driver.quit();
	}

@After(order=2)
public void screenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		
		String screenshot=scenario.getName().replaceAll(" ", "_");
		
		byte[] srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcfile, "image/png", screenshot);
	}
}


}
