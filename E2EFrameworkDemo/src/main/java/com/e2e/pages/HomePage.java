package com.e2e.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.e2e.driver.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage{


	//1. Page Factory Way
	//2. By Locators Way
	//3. String locators Way


	//String alternate Way
	@AndroidFindBy(xpath="//android.widget.TextView")
	@iOSXCUITFindBy(accessibility="text")
	private List<MobileElement> menuitems;

	// Page Factory Way
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]") 
	private AndroidElement texty1;



	//By Locators Way

	By textusingby = By.id("android:id/text1");

	


//	public HomePage() {
//		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
//	}

	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	public ViewPage clickonAction() {
		texty1.click();
		return new ViewPage();
	}


	public void clickonActionByWay() {
		//DriverManager.getDriver().findElement(textusingby).click();
		WebElement findElement = DriverManager.getDriver().findElement(By.id("android:id/text1"));
		clickUsingWebElement(findElement, "ViewsCTA");
	
	}


	public void ClickanMenuitem(String menu) {
		for(MobileElement element:menuitems) {
			if(element.getText().equalsIgnoreCase(menu)) {
				element.click();
			}
		}
	}


	
	@Override
	protected void scrollToSpecificElement(By by) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void dragAndDrop(MobileElement source, MobileElement target) {
		// TODO Auto-generated method stub
		
	}
}
