package BehaviourDriven.BDDFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
public static WebDriver driver;
	
public static void LaunchDri(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
}
