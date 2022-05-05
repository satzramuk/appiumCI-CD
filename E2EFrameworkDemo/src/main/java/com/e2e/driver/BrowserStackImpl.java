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
		
		//BrowserStack Jenkins Configuration Code Starts here
		
				String username = System.getenv("BROWSERSTACK_USERNAME");
				String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
				String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
				//String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
				//String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
				String apppath = System.getenv("BROWSERSTACK_APP_ID");
				caps.setCapability("browserstack.user",username );
				caps.setCapability("browserstack.key", accessKey);
				caps.setCapability("app", apppath);
				caps.setCapability("device", "Google Pixel 3");
				caps.setCapability("os_version", "9.0");
				caps.setCapability("project", "First Framework Project");
				caps.setCapability("build",buildName);
				caps.setCapability("name", "first_FrameworkTest");
				return new AndroidDriver<AndroidElement>(
						new URL("http://hub.browserstack.com/wd/hub"), caps);

				
				
				
				
		//BrowserStack Jenkins Configuration Code Ends here

//             Normal Execution Mode Starts here
//		// Set your access credentials
//		caps.setCapability("browserstack.user", "sathishkumar93");
//		caps.setCapability("browserstack.key", "s14LDSWxcnzPK3LqoHzs");
//
//		// Set URL of the application under test
//		caps.setCapability("app", "bs://b5c2a09780c3ea196ed8f50257472de53020a0f8");
//
//
//		// Specify device and os_version for testing
//		caps.setCapability("device", "Google Pixel 3");
//		caps.setCapability("os_version", "9.0");
//
//		// Set other BrowserStack capabilities
//		caps.setCapability("project", "First Framework Project");
//		caps.setCapability("build", "Java Android");
//		caps.setCapability("name", "first_FrameworkTest");
//
//
//		// Initialize the remote Webdriver using BrowserStack remote URL
//		// and desired capabilities defined above
//
//		return new AndroidDriver<AndroidElement>(
//				new URL("http://hub.browserstack.com/wd/hub"), caps);



		
	}

}
