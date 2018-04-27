/**
 * 
 */
package com.TestCases;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import com.Pages.BrowseCarPage;
import com.Pages.DealerAddCarPage;
import com.Pages.LoginPage;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class VerifyAddCarfromDealer {
	
	@Test
	
	public void addCarFromDealer() throws InterruptedException
	{
	
	WebDriver driver=BrowserFactory.startBrowser("firefox","http://uatwagonex.herokuapp.com/dealer/BqKhkoal19s_test");
	
	Thread.sleep(2000);	
	
	LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	
	login.login("yogesh@ucreate.co.in", "YogeshKumar@007");
	
	
	
	Thread.sleep(5000);	
	
	//driver.findElement(arg0)
	
	DealerAddCarPage addCarFromDealer=PageFactory.initElements(driver, DealerAddCarPage.class);
	
	addCarFromDealer.clickonInventory();
	
	Thread.sleep(2000);	
	
	addCarFromDealer.clickonAddCar();
	
	Thread.sleep(2000);
	
	//addCarFromDealer.clickonAddCar();
	
	//Thread.sleep(2000);
	
	addCarFromDealer.enterCarDetails("test4350", "Tesla", "Red", "1000", "1000", "100", "100", "500", "7");
	
	addCarFromDealer.EnterCarPerformance("22", "22", "22", "22", "22");
	
	addCarFromDealer.Extras("4");
	
	addCarFromDealer.EntercarImagery("D:\\byd1.jpg");
	addCarFromDealer.EntercarImagery("D:\\byd1.jpg");
	System.out.println("It is passed.");
	
	
	}

}
