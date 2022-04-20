package com.e2e.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	private static ExtentReports extent;

	public static void initReports() {
		//Initializing part for Extent Report
		if(Objects.isNull(extent)) {
		 extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/index1.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Automation Report");
		spark.config().setDocumentTitle("Checking");
		extent.attachReporter(spark);
		}
	}
	
	
	public static void tearDownReports() {
		if(Objects.nonNull(extent)) {
			extent.flush();
			ExtentManager.unload();
		}
		

	}
	
	public static void createTest(String testcasename) {
		 //test = extent.createTest(testcasename);
		//ExtentManager.setExtentTest(test);
		//or
		ExtentManager.setExtentTest(extent.createTest(testcasename));
		
		
	}

}
