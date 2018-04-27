/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class VerifyLoginwithValidations {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws InterruptedException{
		
		report=new ExtentReports("D:\\WagonexReport.html");
		logger=report.startTest("VerifyWagonexLogin");
		
		BrowserFactory.startBrowser("firefox", "http://uatwagonex.herokuapp.com/login");
		
		//logger.log(LogStatus.INFO, "Browser is up, running and URL is working");
		
		LoginPage userlogin=PageFactory.initElements(driver, LoginPage.class);

		userlogin.login("test@test.com", "test");
		logger.log(LogStatus.INFO, "User is able to Login");		
	}
	
	@AfterTest
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
		driver.get("D:\\WagonexReport.html");
	}

}
