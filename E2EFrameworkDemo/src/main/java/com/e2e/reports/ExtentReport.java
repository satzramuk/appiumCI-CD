package com.e2e.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports extent;
	public static ExtentTest test;

	public static void initReports() {
		//Initializing part for Extent Report
		 extent = new ExtentReports();
		ExtentSparkReporter spark = 
				new ExtentSparkReporter(System.getProperty("user.dir")+"/index1.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Automation Report");
		spark.config().setDocumentTitle("Checking");
		extent.attachReporter(spark);

	}
	
	
	public static void tearDownReports() {
		extent.flush();

	}
	
	public static void CreateTest(String testcasename) {
		test = extent.createTest(testcasename);
	}

}
