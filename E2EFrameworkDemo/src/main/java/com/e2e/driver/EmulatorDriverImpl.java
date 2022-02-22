package com.e2e.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EmulatorDriverImpl implements IDriver{

	@Override
	public WebDriver getDriver() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//caps.setCapability(MobileCapabilityType.APP, "E:\\Mobile Automation\\Appium Learning\\Sample apk\\ApiDemos-debug.apk");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Sathish\\git\\E2EFrameworkDemo\\E2EFrameworkDemo\\src\\test\\resources\\apkfiles\\ApiDemos-debug.apk");
		
		return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	}

}
