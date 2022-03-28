				package com.e2e.testcases;

import org.testng.annotations.Test;

import com.e2e.pages.HomePage;

public class FirstTest extends BaseTest{
	
	@Test
	public static void tapAction() {
		
		
		//new HomePage().clickonAction();
		//new ViewPage().Tappinganitem("Drag and Drop");
		//new HomePage().clickonAction().Tappinganitem("Drag and Drop");
		//(or)
		new HomePage().ClickanMenuitem("Views").ClickanMenuitem("Drag and Drop");
		
		
		
	//DriverManager.getDriver().findElement(By.id("android:id/text1")).click();		
		
		
	}

}
