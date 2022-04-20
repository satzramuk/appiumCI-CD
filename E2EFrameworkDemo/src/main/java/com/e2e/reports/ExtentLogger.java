package com.e2e.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.e2e.utils.ScreenshotUtils;

public final class ExtentLogger {

	private ExtentLogger() {}

	public static void pass(String message) {

		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {

		//ExtentManager.getExtentTest().fail(message);
		//(or)
		ExtentManager.getExtentTest()
		.fail(message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		
	}

	public static void skip(String message) {

		ExtentManager.getExtentTest().skip(message);
	}

	public static void info(String message) {

		ExtentManager.getExtentTest().info(message);
	}
}
