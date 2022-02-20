package com.e2e.driver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	private Driver() {}
	
	public static void initDriver() throws MalformedURLException {
		WebDriver driver = DriverFactory.get(Modes.BS);
	}

	
	public static void quitDriver() {
		//quit functionality
	}
}
