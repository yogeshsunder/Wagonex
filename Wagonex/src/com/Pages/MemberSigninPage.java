/**
 * 
 */
package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Yogesh
 *
 */
public class MemberSigninPage {
	
WebDriver driver;
	
	By loginHomeButton = By.xpath("//*[@id='navbar-collapse']/ul[2]/li[1]/a");
	By emailid = By.id("email");
	By psswrd = By.id("password");
	By loginButton = By.xpath(".//*[@id='loginpageform']/button");
	
	public MemberSigninPage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public void clickLoginHomePage()
	{
		driver.findElement(loginHomeButton).click();
	}
	
	public void enterEmail(String mail)
	{
		driver.findElement(emailid).sendKeys(mail);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(psswrd).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}
	
	
	

}
