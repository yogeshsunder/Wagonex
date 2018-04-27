/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author ucreate
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="email")
	WebElement enterEmail;
	
	@FindBy(how=How.ID,using="password")
	WebElement enterPassword;
	
	@FindBy(how=How.XPATH,using="//*[@id='loginpageform']/button")
	WebElement clickonLoginbutton;
	
	public void login(String enteremail, String enterpassword) throws InterruptedException
	{
		enterEmail.sendKeys(enteremail);
		enterPassword.sendKeys(enterpassword);
		
		//Thread.sleep(1000);
		clickonLoginbutton.click();
		
	}

}
