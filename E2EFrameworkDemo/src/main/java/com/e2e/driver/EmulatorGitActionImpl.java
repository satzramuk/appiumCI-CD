package com.e2e.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EmulatorGitActionImpl implements IDriver{

	@Override
	public WebDriver getDriver() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability("uiautomator2ServerInstallTimeout", 60000);
        caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/test/resources/apkfiles/ApiDemos-debug.apk");
        
		
		return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	}
	
	

}
