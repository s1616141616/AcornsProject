package com.acorns.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acorns.main.MainTest;

public class HomePage extends MainTest {

	@FindBy(xpath = "//a[@id=\"ember7-5859d56-6ks00t\"]")
	WebElement investmentsLink;

	@FindBy(xpath = "//a[@id='ember7-5859d56-dtrcmk']")
	WebElement foundMoneyLink;

	@FindBy(xpath = "//a[@id=\"ember7-6625ea9-gg3drv\"]")
	WebElement acornsLaterLink;

	@FindBy(xpath = "//a[@id=\"ember7-6625d37-2h022z\"]")
	WebElement spendLink;

	@FindBy(xpath = "//a[@id=\"ember7-5859d56-5x2d38\"]")
	WebElement pricingLink;

	@FindBy(xpath = "//a[@id=\"ember7-5859d56-0t4fct\"]")
	WebElement growMagazineLink;

	@FindBy(xpath = "//a[@id=\"ember7-6625ec8-q4q7t6\"]")
	WebElement giftCardLink;

	@FindBy(xpath = "//a[@class=\"log-in\"]")
	WebElement logInLink;

	@FindBy(xpath = "//a[@class=\"sign-up\"]")
	WebElement joinLink;

	@FindBy(xpath = "//*[@id=\"start-investing\"]/span")
	WebElement getStartedLink;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public InvestmentsPage clickOnInvestmentLink() {
		investmentsLink.click();
		return new InvestmentsPage();
	}

	public FoundMoneyPage clickOnFoundMoneyLink() {
		foundMoneyLink.click();
		return new FoundMoneyPage();
	}

	public AcornsLaterPage clickOnAcornsLaterLink() {
		acornsLaterLink.click();
		return new AcornsLaterPage();
	}

	public SpendPage clickOnSpendLink() {
		spendLink.click();
		return new SpendPage();
	}

	public PricingPage clickOnPricingLink() {
		pricingLink.click();
		return new PricingPage();
	}

	public GrowMagazinePage clickOnGrowMagazineLink() {
		growMagazineLink.click();
		return new GrowMagazinePage();
	}

	public GiftCardPage clickOnGiftCardLink() {
		giftCardLink.click();
		return new GiftCardPage();
	}

	public LogInPage clickOnLogInLink() {
		logInLink.click();
		return new LogInPage();
	}

	public JoinPage clickOnJoinPage() {
		joinLink.click();
		return new JoinPage();
	}

}