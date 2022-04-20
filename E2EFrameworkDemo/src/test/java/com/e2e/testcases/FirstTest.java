package com.e2e.testcases;

import org.testng.annotations.Test;

import com.e2e.pages.HomePage;
import com.e2e.pages.ViewPage;

public class FirstTest extends BaseTest{

	@Test
	public void tapAction() {

		
		//PageFactoryWay
		//new HomePage().clickonAction();
		//String literal Way
		new ViewPage().Tappinganitem("Views","ViewsCTA");
		
		//new ViewPage().Tappinganitem("Drag and Drop");
		//(or)
		//Alternate String literal Way
		//new HomePage().ClickanMenuitem("Views");
		



		//DriverManager.getDriver().findElement(By.id("android:id/text1")).click();		


	}

}
