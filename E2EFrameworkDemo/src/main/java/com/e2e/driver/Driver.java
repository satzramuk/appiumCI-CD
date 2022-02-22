package com.e2e.driver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.e2e.utils.PropertyUtils;

public class Driver {
	
	//public static WebDriver driver;
	
	private Driver() {}
	
	public static void initDriver() throws MalformedURLException {
		String modevalue = PropertyUtils.getValue("mode");
		
		 WebDriver driver = DriverFactory.get(Modes.valueOf(modevalue.toUpperCase()));
		 DriverManager.setDriver(driver);
	}

	
	public static void quitDriver() {
		//quit functionality
		//DriverManager.unload();
		DriverManager.getDriver().quit();
		
		
	}
}
