package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass_New;
import com.adactin.helper.Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Adactin_Testrunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//adactin//feature//Cucumber.feature",
	glue = "com.adactin.stepdefinition",
	monochrome = true,
	dryRun = false,
	strict = true)
//	tags="@smoaketest, @sanitytest")
	//plugin= {"html:Report/Cucumber_Report",
	//"pretty",
	//"json:Report/Cucumber.json",
	//"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})

	public static class AdactinTest_Runner {
		
		public static WebDriver driver; // --> null

		@BeforeClass
		public static void setUp() throws Throwable {

		String browser = Reader_Manager.getInstance().getInstanceCR().getBrowser();   

		driver = Baseclass_New.browerLaunch(browser);

		}

	    @AfterClass
		public static void tearDown() {

		driver.close();

		}
		
	}
}