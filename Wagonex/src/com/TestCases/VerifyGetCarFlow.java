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
public class VerifyGetCarFlow {
	
	@Test
	public void getCarFlow() throws InterruptedException{
		
		WebDriver driver=BrowserFactory.startBrowser("firefox","http://uatwagonex.herokuapp.com/browse");
		
		BrowseCarPage getCarFlow=PageFactory.initElements(driver, BrowseCarPage.class);
		Thread.sleep(5000);
		getCarFlow.clickLearnMore();
		getCarFlow.clickLearnMore();		
		Thread.sleep(15000);		
		getCarFlow.clickGetCar();
		Thread.sleep(5000);
		getCarFlow.popupClick();
		getCarFlow.enterPersonalDetails("Yogesh", "Kumar", "yogesh8@gmail.com", "12345678912", "QQ125478C");
		Thread.sleep(5000);
		getCarFlow.enterAddressDetails("314", "Regent Street", "England", "London", "W1B 3BB");
		Thread.sleep(5000);
		getCarFlow.uploadDrivingLicense("C:\\Users\\ucreate\\Desktop\\byd1.jpg");
		Thread.sleep(5000);
		getCarFlow.enterDeliveryPickupdetails();
		Thread.sleep(5000);
		getCarFlow.enterPaymentDetails("4242", "4242", "4242", "4242", "Test", "02", "21", "123");
		Thread.sleep(5000);
		getCarFlow.clickFinishButton();
	}

}
