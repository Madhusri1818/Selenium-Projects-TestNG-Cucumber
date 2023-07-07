package com.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverBase {
	public static WebDriver driver;
	
	public static WebDriver init_driver(String browser) {
		
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equals("FireFox")){
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else {
			WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver();
		}
		return driver;
	}
}
