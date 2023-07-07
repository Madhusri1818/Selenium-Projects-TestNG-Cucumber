package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigData {

	
	public Properties getdatafromProp() throws Exception {
		FileInputStream FIS=new FileInputStream("C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\cucumberPractice1_POM\\src\\test\\resources\\ConfigData\\Configurations.properties");
	Properties p=new Properties();
	p.load(FIS);
	System.out.println(p.getProperty("url"));
	return p;
	
	}
	public static void main(String[] args) throws Exception {
		ReadConfigData obj=new ReadConfigData();
		obj.getdatafromProp();
	}
}
