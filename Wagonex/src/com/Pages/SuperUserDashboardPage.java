package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuperUserDashboardPage {
	
	WebDriver driver;
	
	public SuperUserDashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Accept Dealer Uploads-----------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id='app-layout']/section[1]/div/div/div/div/div/ul/li[3]/a")
	WebElement clickonDealerUpload;
	
	@FindBy(how=How.CLASS_NAME,using="regno")
	WebElement clicktoExpand;
	
	@FindBy(how=How.LINK_TEXT,using="Accept")
	WebElement acceptrequest;
	
	public void acceptDealerRequest() throws InterruptedException
	{
		clickonDealerUpload.click();
		
		Thread.sleep(2000);
		
		clicktoExpand.click();
		acceptrequest.click();
	}

}
