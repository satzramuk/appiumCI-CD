package com.e2e.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.e2e.driver.Driver;
import com.e2e.reports.ExtentReport;

public class BaseTest {
	
	@BeforeSuite
	public void setupSuite() {
		ExtentReport.initReports();
	}

	@BeforeMethod
	public void SetUpTest() throws MalformedURLException {
		Driver.initDriver();


	}


	@AfterMethod
	public void tearDownTest() {
		Driver.quitDriver();
	}
	
	@AfterSuite
	public void tearDownSuite() {
		
		Driver.quitDriver();
	}

}
