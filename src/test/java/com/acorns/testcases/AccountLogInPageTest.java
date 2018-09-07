package com.acorns.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
import com.acorns.main.MainTest;
import com.acorns.pages.HomePage;
import com.acorns.pages.LogInPage;
import com.acorns.pages.PersonalInfo;
import com.acorns.utility.DataDriven;
import com.acorns.utility.Screenshot;

public class AccountLogInPageTest extends MainTest {

	HomePage homepage;
	PersonalInfo personalinfo;
	LogInPage loginpage;
	Screenshot screenshot;
	
	public AccountLogInPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {

		initialization();
		loginpage = new LogInPage();

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = DataDriven.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String fname, String lname, String email, String phone, String address1, String address2,
			String dob, String state) throws Exception {

		homepage = new HomePage();
		screenshot = new Screenshot();
		homepage.clickOnLogInLink();
		
		personalinfo = loginpage.logIn(prop.getProperty("email"), prop.getProperty("password"));
		Thread.sleep(5000);
		personalinfo = new PersonalInfo();
		personalinfo.fillPersonalInfo(fname, lname, email, phone, address1, address2, dob, state);
		personalinfo.selectRadioButton();
		screenshot.takeScreenShot();
		
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}