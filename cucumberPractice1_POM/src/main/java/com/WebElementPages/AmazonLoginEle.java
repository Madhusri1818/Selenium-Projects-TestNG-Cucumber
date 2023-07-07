package com.WebElementPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonMethods.CommonMethods;

public class AmazonLoginEle extends CommonMethods {

	public WebDriver driver;
	
	private By login_btn=By.id("nav-link-accountList-nav-line-1");
	
private By email_txt=By.id("ap_email");
private By continue1_btn=By.id("continue");
private By pwd_txt=By.id("ap_password");

private By signIN_btn=By.id("signInSubmit");




public AmazonLoginEle(WebDriver driver2) {
this.driver =driver2;
}
public void loginFunction(String UN ,String pwd) throws Exception {
	System.out.println("User enter "+UN+" "+pwd);
	//driver.findElement(login_btn).click();
	click(login_btn);
	//driver.findElement(email_txt).sendKeys(UN);
	sendkeys(email_txt, UN);
	//driver.findElement(continue1_btn).click();
	click(continue1_btn);
	//driver.findElement(pwd_txt).sendKeys(pwd);
	sendkeys(pwd_txt, pwd);
	//driver.findElement(signIN_btn).click();
	click(signIN_btn);
}

public String getTittle() {
	return	getTitle();
	
}
}
