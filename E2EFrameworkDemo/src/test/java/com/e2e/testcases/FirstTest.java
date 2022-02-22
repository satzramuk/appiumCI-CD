package com.e2e.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.e2e.driver.DriverManager;

public class FirstTest extends BaseTest{
	
	@Test
	public static void clickAction() {
		
		DriverManager.getDriver().findElement(By.id("android:id/text1")).click();
		
		
		
	}

}
