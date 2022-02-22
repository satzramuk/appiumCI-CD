package com.e2e.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackImpl implements IDriver{

	@Override
	public WebDriver getDriver() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "sathishkumar93");
		caps.setCapability("browserstack.key", "s14LDSWxcnzPK3LqoHzs");

		// Set URL of the application under test
		caps.setCapability("app", "bs://c282c3e0c822c7bc2fbea4f890790cb9610410d5");


		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Framework Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_FrameworkTest");


		// Initialize the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above

		return new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);



		
	}

}
