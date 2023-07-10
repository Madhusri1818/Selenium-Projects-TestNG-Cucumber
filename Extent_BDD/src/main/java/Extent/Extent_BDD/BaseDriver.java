package Extent.Extent_BDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	public static WebDriver driver;
	
	public static void LaunchDriver() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

}
