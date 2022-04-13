package com.e2e.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.e2e.constants.FrameworkConstantUsingLombak;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LocalDriverImpl implements IDriver{
	
	//Web Browser, Mobile(Both Native Android, iOS), PWA

	@Override
	public WebDriver getDriver() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.UDID, "ba325f0f");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, new FrameworkConstantUsingLombak().getInstance());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VIVO Z1 Pro");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}

}
