package com.acorns.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import com.acorns.main.MainTest;
import com.acorns.pages.HomePage;
import com.acorns.pages.LogInPage;
import com.acorns.utility.Screenshot;

public class HomePageTest extends MainTest {

	HomePage homepage;
	LogInPage loginpage;
	Screenshot screenshot;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {

		initialization();
		loginpage = new LogInPage();
	}

	@Test(priority = 1)
	public void clickOnInvesmentLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnInvestmentLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Learn More About Our Portfolios | corns");
	}

	@Test(priority = 2)
	public void clickOnFoundMoneyLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnFoundMoneyLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Found Money - Earn Money With Over 200 Top Brands | Acorns");
	}

	@Test(priority = 3)
	public void clickOnAcornsLaterLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnAcornsLaterLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Acorns Later - IRAs - Start Saving For Later | Acorns");
	}

	@Test(priority = 4)
	public void clickOnSpendLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnSpendLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Acorns Spend - Debit Card And Checking Account | Acorns");
	}

	@Test(priority = 5)
	public void clickOnPricingLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnPricingLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Pricing | Acorns");
	}

	@Test(priority = 6)
	public void clickOnGrowMagazineLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnGrowMagazineLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "Acorns - Invest, Earn, Grow, Spend, Later | Acorns");
	}

	@Test(priority = 7)
	public void clickOnGiftCArdLinkTest() throws Exception {

		screenshot = new Screenshot();
		homepage = new HomePage();
		homepage.clickOnGiftCardLink();
		System.out.println(driver.getTitle());
		screenshot.takeScreenShot();
		Assert.assertEquals(driver.getTitle(), "A Gift that can Grow | Acorns");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}