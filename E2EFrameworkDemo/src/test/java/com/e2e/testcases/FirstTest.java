package com.e2e.testcases;

import org.testng.annotations.Test;

import com.e2e.pages.HomePage;

public class FirstTest extends BaseTest{
	
	@Test
	public static void tapAction() {
		
		new HomePage().clickonAction();
		
	//DriverManager.getDriver().findElement(By.id("android:id/text1")).click();		
		
		
	}

}
