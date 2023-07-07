package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By HomepageScetions=By.xpath("//ul[@class='mlddm']/li");
	
	public String getHomepagetitle() {
		return driver.getTitle();
	}
	public int getHomeSecCount() {
		return driver.findElements(HomepageScetions).size();
		}
	
	public List<String> homepageList() {
		List<String> sectionsList=new ArrayList<>();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		List<WebElement> homeheaderssec= driver.findElements(HomepageScetions);
		for (WebElement e : homeheaderssec) {
			String text=e.getText();
			System.out.println(text);
			sectionsList.add(text);
		}
		return sectionsList;
	}
}
