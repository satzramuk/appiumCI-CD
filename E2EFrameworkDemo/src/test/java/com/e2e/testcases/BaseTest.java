package com.e2e.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.e2e.driver.Driver;

public class BaseTest {
	
	@BeforeMethod
	public void SetUpTest() throws MalformedURLException {
		Driver.initDriver();
	}
	
	
	@AfterMethod
	public void tearDownTest() {
		Driver.quitDriver();
	}

}
