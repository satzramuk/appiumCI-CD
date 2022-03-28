package com.e2e.pages;

//Static Imports
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import com.e2e.driver.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class AndroidNativeBasePage extends BasePage{
	
	TouchAction<AndroidTouchAction> ta;


//	@Override
//	protected void scrollToSpecificElement(By by) {
//
//		while(DriverManager.getDriver().findElements(by).isEmpty()) 
//    	{
//    	Dimension dimensions = DriverManager.getDriver().manage().window().getSize();
//    	Double screenHeightStart = dimensions.getHeight() * 0.5;
//    	int scrollStart = screenHeightStart.intValue();
//    	Double screenHeightEnd = dimensions.getHeight() * 0.2;
//    	int scrollEnd = screenHeightEnd.intValue();
//    	int center = (int)(dimensions.width*0.5);
//    	ta = new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver());
//    	ta.press(PointOption.point(center, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//    	.moveTo(PointOption.point(center, scrollEnd)).release().perform();
//		
//    	}
//		if(DriverManager.getDriver().findElements(by).isEmpty())
//    	{
//    		clickUsingBy(by);
//    	}
//	}
	
	protected  void scrollToSpecificElement(By by)
    {

        while(DriverManager.getDriver().findElements(by).isEmpty()) //==0
        {
            Dimension dimensions =DriverManager.getDriver().manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.5;
            int scrollStart = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.2;
            int scrollEnd = screenHeightEnd.intValue();
            int center = (int) (dimensions.width*0.5);
            new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
                    .press(PointOption.point(center,scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(center,scrollEnd)).release().perform();
        }

        if(!DriverManager.getDriver().findElements(by).isEmpty())
        {
            DriverManager.getDriver().findElement(by).click();
        }
    }

	@Override
	protected void dragAndDrop(MobileElement source, MobileElement target) {
		ta=new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver());
    	ta.longPress(longPressOptions().withElement(element(source)))
    	.moveTo(element(target)).release().perform();

		
	}
	
	//Swiping an Element

	protected void SwipeAnElement(AndroidElement source, AndroidElement target) {
	    	
	    	ta = new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver());
			ta.longPress(longPressOptions().withElement(element(source)).withDuration(Duration.ofSeconds(5)))
			.moveTo(element(target)).release().perform();
			
	    	
	    }
		
	//Tapping using coordinates

	protected void tapOnCoordinates(int x, int y) {
	 		
	 		ta = new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver())
	 		.tap(PointOption.point(x, y))
	 		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
	 		
	 		
	 	}
		
		
	//Tap using Element

	protected void tapByElement(MobileElement element){

		new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver()).tap(tapOptions().withElement(element(element))).waitAction(WaitOptions.waitOptions(Duration.ofMillis(400))).perform();

	}



	//ScrollDown method

	protected void scrollDown(){

	 Dimension dimension =DriverManager.getDriver().manage().window().getSize();
	 int scrollStart = (int)(dimension.getHeight() * 0.5);
	 int scrollEnd = (int)(dimension.getHeight() * 0.2);
	 
	 new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver()).press(PointOption.point(0, scrollStart))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
	 .release().perform();
	 }
	 


	//ScrollUp method 

	protected void scrollUp(){

	 Dimension dimension =DriverManager.getDriver().manage().window().getSize();
	 int scrollStart = (int)(dimension.getHeight() * 0.5);
	 int scrollEnd = (int)(dimension.getHeight() * 0.2);
	 
	 new AndroidTouchAction((PerformsTouchActions)DriverManager.getDriver()).press(PointOption.point(0, scrollEnd))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollStart))
	 .release().perform();
	 }

		


}
