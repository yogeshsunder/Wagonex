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
public class DealerAddCarPage {
	
	WebDriver driver;
	
	public DealerAddCarPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='app-navbar-collapse']/ul[2]/li[2]/a")
	WebElement Inventory;
	
	 public void clickonInventory(){
		 Inventory.click();		
		}
	
	@FindBy(how=How.LINK_TEXT,using="Add a car")
	WebElement AddCar;
	
	public void clickonAddCar(){
		AddCar.click();		
		}
	
	//Enter Car personal Details-----------------------------------------------------------------------------
	@FindBy(how=How.ID,using="register")
	WebElement CarRegistration;
	
	@FindBy(how=How.ID,using="brand")
	WebElement Brand;
	
	@FindBy(how=How.LINK_TEXT,using="Audi")
	WebElement SelectBrand;
	
	@FindBy(how=How.ID,using="model")
	WebElement Model;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[4]/div/button")
	WebElement Bodystyle;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[4]/div/div/ul/li[1]/a")
	WebElement SelectBodystyle;
	
	@FindBy(how=How.ID,using="color")
	WebElement colour;
	
	@FindBy(how=How.ID,using="price")
	WebElement Monthlyprice;
	
	@FindBy(how=How.ID,using="rrp")
	WebElement RRP;
	
	@FindBy(how=How.ID,using="monthly_mileage_allowance")
	WebElement Monthlymileageallowance;
	
	@FindBy(how=How.ID,using="additional_mileage_fee")
	WebElement Additionalmileagefee;
	
	@FindBy(how=How.ID,using="deposit")
	WebElement Deposit;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[14]/div/button")
	WebElement Doors;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[14]/div/div/ul/li[1]/a")
	WebElement ClickonDoors;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[15]/div/button")
	WebElement Seats;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[1]/div[15]/div/div/ul/li[5]/a")
	WebElement ClickonSeats;
	
	public void enterCarDetails(String CarReg,String model,String Colour,String monthlyprice,String rrp,
			String monthlymileageallowance,String additionalmileagefee,String deposit,String seats) throws InterruptedException
	
	{
		CarRegistration.sendKeys(CarReg);
		
		Thread.sleep(5000);
		
		Brand.click();
		SelectBrand.click();
		Model.sendKeys(model);
		Bodystyle.click();
		SelectBodystyle.click();
		colour.sendKeys(Colour);
		Monthlyprice.sendKeys(monthlyprice);
		RRP.sendKeys(rrp);
		Monthlymileageallowance.sendKeys(monthlymileageallowance);
		Additionalmileagefee.sendKeys(additionalmileagefee);
		Deposit.sendKeys(deposit);
		Doors.click();
		ClickonDoors.click();
		Seats.click();
		ClickonSeats.click();
		
	}
	
	//Enter Car Performance-----------------------------------------------------------------------------------	
	
	@FindBy(how=How.ID,using="fuel")
	WebElement enterfuel;
	
	@FindBy(how=How.LINK_TEXT,using="Electric")
	WebElement clickonfuel;
	
	@FindBy(how=How.ID,using="mileage")
	WebElement enterMileage;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[2]/div[3]/div/button")
	WebElement transmission;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[2]/div[3]/div/div/ul/li[1]/a/span[1]")
	WebElement enterTransmission;

	@FindBy(how=How.ID,using="engine_size")
	WebElement enterenginesize;
	
	@FindBy(how=How.ID,using="mpg")
	WebElement enterefficiency;
	
	@FindBy(how=How.ID,using="emissions")
	WebElement enteremissions;
	
	@FindBy(how=How.ID,using="poweradded")
	WebElement enterpoweradded;
	
	public void EnterCarPerformance(String mileage,String enginesize,String efficiency,String emissions,String poweradded)
	{
		enterfuel.click();
		clickonfuel.click();
		enterMileage.sendKeys(mileage);
		transmission.click();
		enterTransmission.click();
		enterenginesize.sendKeys(enginesize);
		enterefficiency.sendKeys(efficiency);
		enteremissions.sendKeys(emissions);
		enterpoweradded.sendKeys(poweradded);
	}
	
	//Enter Extras-----------------------------------------------------------------------------------------------	
	
	@FindBy(how=How.ID,using="sat_nav")
	WebElement entersatnav;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[3]/div[2]/div/button")
	WebElement trim;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[3]/div[2]/div/div/ul/li[1]/a")
	WebElement entertrim;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[3]/div[3]/div/button")
	WebElement connectivity;
	
	@FindBy(how=How.XPATH,using="//*[@id='addCarPageid']/div/div[2]/div[3]/div[3]/div/div/ul/li[1]/a")
	WebElement clickOnConnectivity;
	
	@FindBy(how=How.ID,using="parking_sensors")
	WebElement parkingsensors;
	
	@FindBy(how=How.ID,using="wheels")
	WebElement enterWheels;
	
	@FindBy(how=How.ID,using="sunroof")
	WebElement clickOnSunroof;
	
	@FindBy(how=How.ID,using="delivery")
	WebElement clickOndelivery;
	
	@FindBy(how=How.ID,using="delivery1")
	WebElement clickOnpickup;
	
	public void Extras(String wheels)
	{
		entersatnav.click();
		trim.click();
		entertrim.click();
		connectivity.click();
		clickOnConnectivity.click();
		parkingsensors.click();
		enterWheels.sendKeys(wheels);
		clickOnSunroof.click();
		clickOndelivery.click();
		clickOnpickup.click();
	}
	
	//Enter Car Imagery------------------------------------------------------------------------------------------
	
	@FindBy(how=How.ID,using="addcarimage")
	WebElement enterCarImages;	
	
	@FindBy(how=How.XPATH,using="//*[@id='imagesection']/div[2]/span/span/span[1]")
	WebElement star;
	
	@FindBy(how=How.ID,using="finish")
	WebElement Finish;
	
	public void EntercarImagery(String enterimages) throws InterruptedException
	{
		enterCarImages.sendKeys(enterimages);
		enterCarImages.sendKeys(enterimages);
		enterCarImages.sendKeys(enterimages);
		
		Thread.sleep(2000);
		
		star.click();
		
		Finish.click();
	}
	

}







