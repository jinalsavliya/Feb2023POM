package com.qa.qaboat.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.qaboat.factory.DriverFactory;
import com.qa.qaboat.pages.LoginPage;

public class BasedTest {

	DriverFactory df;
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		
		df = new DriverFactory() ;
			df.init_driver("Chrome");
			//Fix for driver 
			// driver assign the value to driver variable
			driver = df.init_driver("chrome");
			loginPage = new LoginPage(driver);
		}
	
	 @AfterTest
	 public void tearDown() {
		 
		 driver.quit();
	 }
}
	 
	
