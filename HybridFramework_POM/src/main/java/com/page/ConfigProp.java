package com.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProp {
	public Properties p;

	public Properties init_config() {
		Properties p = new Properties();
		try {
			FileInputStream FIS = new FileInputStream(
					"C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\HybridFramework_POM\\src\\test\\resources\\config\\config.properties");
			try {
				p.load(FIS);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return p;
	}
}
