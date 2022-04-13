package com.e2e.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.e2e.pages.ViewPage;
import com.e2e.reports.ExtentReport;

public class FirstTest extends BaseTest{

	@Test
	public void tapAction() {

		ExtentTest test = ExtentReport.extent.createTest("My First Testcase");
		
		//PageFactoryWay
		//new HomePage().clickonAction();
		//String literal Way
		new ViewPage().Tappinganitem("Views");
		//new ViewPage().Tappinganitem("Drag and Drop");
		//(or)
		//Alternate String literal Way
		//new HomePage().ClickanMenuitem("Views");
		



		//DriverManager.getDriver().findElement(By.id("android:id/text1")).click();		


	}

}
