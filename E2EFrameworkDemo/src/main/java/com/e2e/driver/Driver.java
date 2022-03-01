package com.e2e.driver;

import java.net.MalformedURLException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.e2e.utils.PropertyUtils;

public class Driver {
	
	//public static WebDriver driver;
	
	private Driver() {}
	
	public static void initDriver() throws MalformedURLException {
		
		
		if(Objects.isNull(DriverManager.getDriver()))
			
		// (or) if(DriverManager.getDriver()==null)
		{
			
		
		String modevalue = PropertyUtils.getValue("mode");
		
		 WebDriver driver = DriverFactory.get(Modes.valueOf(modevalue.toUpperCase()));
		 DriverManager.setDriver(driver);
	}
	}

	
	public static void quitDriver() {
		//quit functionality
		if(Objects.nonNull(DriverManager.getDriver()))
		//if(DriverManager.getDriver()!=null) 
		{
		DriverManager.getDriver().quit();
		DriverManager.unload();
		}
		
		
	}
}
