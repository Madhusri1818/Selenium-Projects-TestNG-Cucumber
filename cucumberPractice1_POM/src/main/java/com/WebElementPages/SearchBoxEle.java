package com.WebElementPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.DriverFactory.DriverBase;
import com.commonMethods.CommonMethods;

public class SearchBoxEle extends CommonMethods{
public static  WebDriver driver;
	private By search_txt=By.id("twotabsearchtextbox");
	public  By selectDropDown_count=By.xpath("//select[@id='searchDropdownBox']/option");
	public  By selectDropDown_act=By.xpath("//select[@id='searchDropdownBox']");
	private By search_btn=By.id("nav-search-submit-button");
	
	public SearchBoxEle(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void ClicksearchinBox(String txt) {
		//driver.findElement(search_txt).sendKeys(txt);
		sendkeys(search_txt, txt);
	}
	public void ActionDropBoxSearch() {
		Select select=new Select(driver.findElement(selectDropDown_act));
		select.selectByVisibleText("Electronics");
	}
	
	public void ClickSearch() throws Exception {
		//driver.findElement(search_btn).click();
		click(search_btn);
	}
	public List<WebElement> countOfSearcchDropDown() {
		driver=DriverBase.driver;
		System.out.println(driver);
		List<WebElement> count=driver.findElements(selectDropDown_act);
		System.out.println(driver.findElements(selectDropDown_count).size());
	
		for (WebElement e : count) {
		String text=	e.getText();
			System.out.println(text);
		}
		return count;
	}
	
}
