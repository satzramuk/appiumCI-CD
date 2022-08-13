package com.e2e.driver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public final class DriverFactory {
	
	private DriverFactory() {}
	
	public static WebDriver get(Modes mode) throws MalformedURLException {
		WebDriver driver = null;
		
		if(mode.equals(Modes.LOCAL)){
			
			driver = new LocalDriverImpl().getDriver();
		}
		else if(mode.equals(Modes.EMULATOR)) {
			driver = new EmulatorDriverImpl().getDriver();
		}
		else if(mode.equals(Modes.BS)) {
			driver = new BrowserStackImpl().getDriver();
		}
		else if(mode.equals(Modes.SAUCELABS)) {
			driver = new SauceLabsDriverImpl().getDriver();
		}
		else if(mode.equals(Modes.EMULATORGITACTION)) {
			driver = new EmulatorGitActionImpl().getDriver();
		}
		return driver;
		
	}
	
	

}
