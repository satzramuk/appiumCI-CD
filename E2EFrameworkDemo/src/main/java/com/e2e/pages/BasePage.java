package com.e2e.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2e.driver.DriverManager;
import com.e2e.reports.ExtentManager;

import io.appium.java_client.MobileElement;

public abstract class BasePage {

	//Click using MobileElement
	protected void clickUsingMobElement(MobileElement element,String elementname) {
		explicitWaitUsingMobElement(element);   	
		element.click();
		System.out.println(elementname + "is clicked successfully");
		//ExtentLogger.pass(element + "is clicked successfully", true);
		//ExtentManager.getExtentTest().pass(elementname + "is clicked successfully");
	}


	//ExplicitWait Condition For MobileElement
	private void explicitWaitUsingMobElement(MobileElement element) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
		//or */

		//		new WebDriverWait(DriverManager.getDriver(), 10).until(d->element.isDisplayed());

	}

	//Click using WebElement
	protected void clickUsingWebElement(WebElement element,String elementname) {
		explicitWaitUsingWebElement(element);   	
		element.click();
		System.out.println(elementname + "is clicked successfully");
		//ExtentLogger.pass(element + "is clicked successfully", true);
		//ExtentManager.getExtentTest().pass(elementname + "is clicked successfully");
	}


	//ExplicitWait Condition For WebElement
	private void explicitWaitUsingWebElement(WebElement element) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
		//or */

		//new WebDriverWait(DriverManager.getDriver(), 10).until(d->element.isDisplayed());

	}


	
	//Click using By

	protected void clickUsingBy(By by) { 	

		clickUsingWebElement(DriverManager.getDriver().findElement(by), null);
	}

	//Implicit Wait 
	protected void implicitWaitMethod(int value,TimeUnit timeunit){

		DriverManager.getDriver().manage().timeouts().implicitlyWait(value,timeunit);

	}

	//Locator Custom Method

	protected void click(String locatortype , String locatorvalue ) {

		if(locatortype.equalsIgnoreCase("xpath")) {
			clickUsingBy(By.xpath(locatorvalue));
		}

		if(locatortype.equalsIgnoreCase("css")) {
			clickUsingBy(By.cssSelector(locatorvalue));
		}

		if(locatortype.equalsIgnoreCase("name")) {
			clickUsingBy(By.name(locatorvalue));
		}

		if(locatortype.equalsIgnoreCase("id")) {
			clickUsingBy(By.id(locatorvalue));
		}


		//			or
		//			*/	

		//		 	click(LocatorFactory.get(locatortype, locatorvalue));

	}

	//SendKeys For MobileElement

	protected void sendKeys(MobileElement element, String value) {
		explicitWaitUsingMobElement(element);
		element.sendKeys(value);

	}

	//SendKeys For WebElement

	protected void sendKeys(WebElement element, String value) {
		explicitWaitUsingWebElement(element);
		element.sendKeys(value);

	}

	//Abstract Method	
	protected abstract void scrollToSpecificElement(By by);
		
	protected abstract void dragAndDrop(MobileElement source, MobileElement target);





}
