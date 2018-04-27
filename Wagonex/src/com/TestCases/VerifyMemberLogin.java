/**
 * 
 */
package com.TestCases;

//import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Pages.MemberSigninPage;

/**
 * @author Yogesh
 *
 */
public class VerifyMemberLogin {
	
	
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://uatwagonex.herokuapp.com/login");
		
		MemberSigninPage signin=new MemberSigninPage(driver);
		
		
		String login_title=driver.getTitle();
		
		signin.enterEmail("yogesh@ucreate.co.in");
		signin.enterPassword("YogeshKumar@007");
		signin.clickLogin();
		
		
		if(driver.getTitle().equals(login_title))
		{
			System.out.println("User is Not Able to Login");
		}
			else
			{			
			
			System.out.println("User is Able to Login");
			}
		}
	
	}