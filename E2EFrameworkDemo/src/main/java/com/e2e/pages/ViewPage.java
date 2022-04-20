package com.e2e.pages;

import org.openqa.selenium.By;

import com.e2e.driver.DriverManager;
import com.e2e.reports.ExtentLogger;
import com.e2e.reports.ExtentManager;
import com.e2e.utils.DynamicXpathUtils;

public class ViewPage  {
	
	//Another way
	//private String draganddrop ="//android.widget.TextView[contains(@text,'%replaceable%')]";
	private String draganddrop1 ="//android.widget.TextView[contains(@text,'%s')]";
	
	
	
	public void Tappinganitem(String menuname,String elementname) {
		
		//String newxpath= draganddrop.replace("%replaceable%",menuname);
		String newxpath = DynamicXpathUtils.getXpath(draganddrop1, menuname);
		
		DriverManager.getDriver().findElement(By.xpath(newxpath)).click();
		//ExtentManager.getExtentTest().pass(elementname + "is clicked successfully");
		//ExtentManager.getExtentTest().f
		ExtentLogger.pass(elementname + " is clicked successfuly");
		System.out.println(elementname + " is clicked successfuly");
	
	}
	

}
