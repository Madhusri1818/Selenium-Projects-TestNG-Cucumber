package com.commonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.DriverFactory.DriverBase;


public class CommonMethods extends DriverBase {
//private WebDriver driver;
	
public void click(By findby) throws Exception {
		Thread.sleep(3000);
		WebElement element=driver.findElement(findby);
		element.click();
	}
	
	public void clear(By findBy) throws Exception {
		WebElement element = driver.findElement(findBy);
		element.clear();
	}
	public void sendkeys(By findby,String text) {
		WebElement element = driver.findElement(findby);
		element.sendKeys(text);
	}
	
	public void mouseoveraction(WebDriver driver,By ele1,By ele2) {
		Actions action=new Actions(driver) ;
		WebElement menu=driver.findElement(ele1);
		WebElement submenu=driver.findElement(ele2);
		action.moveToElement( menu).perform();
		action.moveToElement( submenu).perform();
		 submenu.click();
	}
	public String getTitle() {
		String title=driver.getTitle();
		System.out.println("Title of page :"+title);
		return title;
	}
	public void dragandDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest);
	}
	
	
	public void selectbyvisibletext(WebElement findby,String text) {
		Select selText=new Select(findby);
		selText.selectByVisibleText(text);
	}
	
	public void selectbyindex(WebElement findby,int index) {
		Select selText=new Select(findby);
		selText.selectByIndex(index);
	}
	
	public void selectbyvisiblevalue(WebElement findby,String value) {
		Select selText=new Select(findby);
		selText.selectByValue(value);
	}
	
	public void refresh(By findby) {
		driver.navigate().refresh();
	}
	
}
