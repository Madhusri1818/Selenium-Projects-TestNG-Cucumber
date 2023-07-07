package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
//1.By Locators
	private By username_txt=By.name("username");

	private By password_txt=By.name("password");

	private By login_btn=By.xpath("//input[@value='Login']");

	private By frame=By.xpath("//frame[@name='mainpanel']");
	
	private By contact_lnk=By.xpath("//a[contains(text(),'Contacts')]");
	
	private By newContact_lnk=By.xpath("//a[contains(text(),'New Contact')]");
	
	private  By logo=By.xpath("//img[@class='img-responsive']");
//2.create constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//3.Page actions-behaviour scenarios in form of methods:
	
	public String gettingTitle() {
		return driver.getTitle();
	}
	
	public boolean LogoExists() {
		return driver.findElement(logo).isDisplayed();
	}
	
	public void EnteruserName(String username) {
		driver.findElement(username_txt).sendKeys(username);
	}
	public void Enterpassword(String pwd) {
		driver.findElement(password_txt).sendKeys(pwd);
	}
	public void ClickLogin() {
		driver.findElement(login_btn).click();
	}
	
	public HomePage DoLogin(String Un,String pwd) {
		System.out.println("User Enters "+Un+ "and" +pwd);
		driver.findElement(username_txt).sendKeys(Un);
		driver.findElement(password_txt).sendKeys(pwd);
		driver.findElement(login_btn).click();
		return new HomePage(driver);
	}
	public void frame() {
		WebElement frame=driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		driver.switchTo().frame(frame);
	}

}
