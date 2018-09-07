package com.acorns.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.acorns.main.MainTest;

public class PersonalInfo extends MainTest {

	@FindBy(xpath = "//input[@id=\"first_name\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='phone_number']")
	WebElement Phone;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement Address1;

	@FindBy(xpath = "//input[@id='address2']")
	WebElement Address2;

	@FindBy(xpath = "//input[@id='dob']")
	WebElement DOB;

	@FindBy(xpath = "//input[@id='ssn']")
	WebElement SSN;

	@FindBy(xpath = "//input[@id='city']")
	WebElement City;

	@FindBy(xpath = "//select[@class='FormSelect__StyledSelect-iDenzN jSqqCc Select-eZBaHc WAFYg']")
	WebElement State;

	@FindBy(xpath = "//input[@id='zip']")
	WebElement Zip;

	@FindBy(xpath = "//span[contains(@class,'Checkbox__Span-dAlsVQ jiJIXZ')]")
	WebElement uscitizen;

	public PersonalInfo() {

		PageFactory.initElements(driver, this);
	}

	public void fillPersonalInfo(String fname, String lname, String email, String phone, String address1,
			String address2, String dob, String state) {
		
		firstName.clear();
		firstName.sendKeys(fname);
		lastName.clear();
		lastName.sendKeys(lname);
		Email.clear();
		Email.sendKeys(email);
		Phone.sendKeys(phone);
		Address1.sendKeys(address1);
		Address2.sendKeys(address2);
		DOB.sendKeys(dob);
		
		Select select =new Select(State);
		select.selectByVisibleText(state);
	}

	public void selectRadioButton() {
		uscitizen.click();

	}

}