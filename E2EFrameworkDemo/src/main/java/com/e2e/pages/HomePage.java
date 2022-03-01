package com.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.e2e.driver.DriverManager;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	
	//1. Page Factory Way
	//2. By Locators Way
	//3. String locators Way
	
	
	// Page Factory Way
	@AndroidFindBy(id="android:id/text1") 
	private AndroidElement texty1;
	
	//By Locators Way
	
	By textusingby = By.id("android:id/text1");
	
	
	
	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	public void clickonAction() {
		texty1.click();
	}
	
	
	public void clickonActionByWay() {
		DriverManager.getDriver().findElement(textusingby).click();
	}
	
	
	

}
