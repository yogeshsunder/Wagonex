/**
 * 
 */
package com.TestCases;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.BrowseCarPage;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class VerifyLogin {
	
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws InterruptedException{
		
		BrowserFactory.startBrowser("firefox", "http://uatwagonex.herokuapp.com/browse");
		
		BrowseCarPage getCarFlow=PageFactory.initElements(driver, BrowseCarPage.class);
		
		//Thread.sleep(100000);
		
		//driver.findElement(By.className("fb-icon"));
		getCarFlow.clickLearnMore();
	}

}
