package com.acorns.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

	public static WebDriver driver;
	public static Properties prop;

	public MainTest() {

		try {

			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"D:\\eclipse-workspace\\com.acorns\\src\\main\\java\\com\\acorns\\config\\config.properties");
			prop.load(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws Exception {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\com.acorns\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\eclipse-workspace\\com.acorns\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		/*
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT,TimeUnit.
		 * SECONDS);
		 */

driver.get(prop.getProperty("url"));

	}

}