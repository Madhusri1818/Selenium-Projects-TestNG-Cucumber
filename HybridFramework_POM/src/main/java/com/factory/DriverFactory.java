package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public  WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	
	//this method is used to intilize the threadlocal driver on basis  of given driver
	public WebDriver init_Driver(String browser) 
	{
		System.out.println("Browser is: "+ browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}else {
			System.out.println("provide valide browser value :"+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	// this method is used get driver with threadlocal
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	

}
