package com.acorns.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acorns.main.MainTest;

public class LogInPage extends MainTest {

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@class='LoginForm__Button-hNKThV shYYq Button__ButtonStyled-fKuqwq Uvnzr']")
	WebElement login;

	@FindBy(xpath = "//button[@class='LoginForm__SignupButton-hXXorO hLknEU']")
	WebElement signup;

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public PersonalInfo logIn(String mail, String pwd) {
		email.sendKeys(mail);
		password.sendKeys(pwd);
		login.click();

		return new PersonalInfo();
	}

}