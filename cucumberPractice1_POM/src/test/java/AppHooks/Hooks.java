package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.DriverFactory.DriverBase;
import com.config.ReadConfigData;

import io.cucumber.java.Before;

public class Hooks  {
static Properties pro;
WebDriver driver;
public String browser;
@Before(order=1)
		
	public void getdataConfig() throws Exception {
		ReadConfigData propData=new ReadConfigData();
		pro=propData.getdatafromProp();
		
	}
	@Before(order=2)
	public void driverLaunch() {
		 browser=pro.getProperty("browser");
			System.out.println(browser);
		DriverBase dri=new DriverBase();
		driver=dri.init_driver(browser);
		driver.get(pro.getProperty("url"));
		
	
	}
}

