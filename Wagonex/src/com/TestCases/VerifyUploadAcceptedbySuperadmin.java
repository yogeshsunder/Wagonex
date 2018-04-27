/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.SuperUserDashboardPage;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class VerifyUploadAcceptedbySuperadmin {
	
	@Test
	
	public void dealerUploadAccepted() throws InterruptedException
	{
		WebDriver driver=BrowserFactory.startBrowser("firefox", "http://uatwagonex.herokuapp.com/login");
		
		Thread.sleep(2000);	
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		login.login("superadmin@test.com", "test@55555");	
		
		
		Thread.sleep(5000);	
		
		SuperUserDashboardPage requestaccepted=PageFactory.initElements(driver, SuperUserDashboardPage.class);
		
		requestaccepted.acceptDealerRequest();
	}

}
