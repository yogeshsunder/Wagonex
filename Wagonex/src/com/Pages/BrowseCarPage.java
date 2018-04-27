/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yogesh
 *
 */
public class BrowseCarPage {
	
	WebDriver driver;
	
    public BrowseCarPage(WebDriver driver){
		
		this.driver=driver;		
	}	
    
	@FindBy(how=How.CLASS_NAME,using="navlinksanchor")
	WebElement browse;
	
    public void clickBrowserCar(){
	    browse.click();		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='load']/div[1]/div/a")
	WebElement learnMore;
	
	public void clickLearnMore(){
		learnMore.click();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Get Car")
	WebElement getCar;
	
	public void clickGetCar(){
		getCar.click();		
	}
	
	//Click OK on pop up
	
	@FindBy(how=How.XPATH,using="//*[@id='getCarConfirmation']/div/div/div/p[2]/a")
	WebElement popupok;
	
	public void popupClick(){
		popupok.click();
	}
	
	//Enter Personal Details
	
	@FindBy(how=How.ID,using="first_name")
	WebElement enterFirstName;
	
	@FindBy(how=How.ID,using="last_name")
	WebElement enterLastName;
	
	@FindBy(how=How.ID,using="email")
	WebElement enterEmailAddress;

	@FindBy(how=How.ID,using="contact_number")	
	WebElement enterContactNumber;	
	
	@FindBy(how=How.ID,using="national_insurance_number")
	WebElement EnterNationalInsurance;
	
	@FindBy(how=How.XPATH,using="//*[@id='dob_div']/div[1]/div/button")
	WebElement SelectDateDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='dob_div']/div[1]/div/div/ul/li[5]/a")
	WebElement SelectDate;	
	
	@FindBy(how=How.XPATH,using="//*[@id='dob_div']/div[2]/div/button")
	WebElement SelectMonthDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='dob_div']/div[2]/div/div/ul/li[5]/a")
	WebElement SelectMonth;
	
	@FindBy(how=How.XPATH,using="//*[@id='dob_div']/div[3]/div/button")
	WebElement SelectYearDropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dob_div']/div[3]/div/div/ul/li[42]/a")
	WebElement SelectYear;
	
	@FindBy(how=How.ID,using="personal_details_button")
	WebElement personalDetailsContinueButton;
	
	public void enterPersonalDetails(String enterfirstName,String lastname,String mailid,String contactnumber,String nationalinsurancenumber )
	{
		enterFirstName.sendKeys(enterfirstName);
		enterLastName.sendKeys(lastname);
		enterEmailAddress.sendKeys(mailid);
		enterContactNumber.sendKeys(contactnumber);
		EnterNationalInsurance.sendKeys(nationalinsurancenumber);
		SelectDateDropDown.click();
		SelectDate.click();
		SelectMonthDropDown.click();
		SelectMonth.click();
		SelectYearDropDown.click();
		SelectYear.click();
		personalDetailsContinueButton.click();				
	}
	
	//Enter Address Details
	
	@FindBy(how=How.ID,using="street_number")
	WebElement enterFirstAddress;
	
	@FindBy(how=How.ID,using="route")
	WebElement enterSecondAddress;
	
	@FindBy(how=How.ID,using="administrative_area_level_1")
	WebElement enterThirdAddress;
	
	@FindBy(how=How.ID,using="postal_town")
	WebElement enterTown;
	
	@FindBy(how=How.ID,using="postal_code")
	WebElement enterPostCode;
	
	@FindBy(how=How.ID,using="address_details_button")
	WebElement addressContinueButton;
	
	public void enterAddressDetails(String streetnumber,String routeaddress,String thirdAddress,String postaltown,String postalcode)
	{
		enterFirstAddress.sendKeys(streetnumber);
		enterSecondAddress.sendKeys(routeaddress);
		enterThirdAddress.sendKeys(thirdAddress);
		enterTown.sendKeys(postaltown);
		enterPostCode.sendKeys(postalcode);
		addressContinueButton.click();
	}
	
	//Upload Driving License
	
	@FindBy(how=How.NAME,using="licence_image")
	WebElement enterImage;
	
	@FindBy(how=How.ID,using="licence_details_button")
	WebElement licenceContinueButton;
	
	public void uploadDrivingLicense(String licenceimage)
	{
		enterImage.sendKeys(licenceimage);
		licenceContinueButton.click();		
	}
	
	//Enter Delivery/Pickup details
	
	@FindBy(how=How.XPATH,using="//*[@id='delivery_option_div']/div/button")
	WebElement deliveryPickupButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='delivery_option_div']/div/div/ul/li[1]/a")
	WebElement chooseDelivery;
	
	@FindBy(how=How.ID,using="first_date")
	WebElement clickOnCalendar;
	
	@FindBy(how=How.XPATH,using="//*[@id='app-layout']/div[14]/div[1]/div[2]/table/tbody/tr[5]/td[6]")
	WebElement cilckOnDate;
	
	@FindBy(how=How.ID,using="delivery_detail_button")
	WebElement deliveryPickupContinue;
	
	public void enterDeliveryPickupdetails()
	{
		deliveryPickupButton.click();
		chooseDelivery.click();
		//clickOnCalendar.click();
		//cilckOnDate.click();
		deliveryPickupContinue.click();		
	}
	
	//Enter Payment Card details
	
	@FindBy(how=How.ID,using="cardNumber")
	WebElement enterCardNumber;
	
	@FindBy(how=How.ID,using="cardholdername")
	WebElement enterCardHolderName;
	
	@FindBy(how=How.ID,using="cardExpiry")
	WebElement enterExpiryDate;

	@FindBy(how=How.ID,using="cvvNumber")
	WebElement enterCVC;
	
	@FindBy(how=How.ID,using="paymentbilling")
	WebElement clickPaymentContinue;
	
	public void enterPaymentDetails(String cardnumber,String cardanumber,String cardbnumber,String cardcnumber,String choldername,String expirydate,String expirybdate,String cVnumber)
	{
		enterCardNumber.sendKeys(cardnumber);
		enterCardNumber.sendKeys(cardanumber);
		enterCardNumber.sendKeys(cardbnumber);
		enterCardNumber.sendKeys(cardcnumber);
		enterCardHolderName.sendKeys(choldername);
		enterExpiryDate.sendKeys(expirydate);
		enterExpiryDate.sendKeys(expirybdate);
		enterCVC.sendKeys(cVnumber);
		clickPaymentContinue.click();		
	}
	
	//Enter Finish Button
	
	@FindBy(how=How.ID,using="finishbutton")
	WebElement clickFinishButton;	
	
	public void clickFinishButton()
	{	    
		clickFinishButton.click();
	}

}
