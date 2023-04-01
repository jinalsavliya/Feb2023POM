package com.qa.qaboat.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BasedTest {

	@Test
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("Login page title: " + actTitle);
	    Assert.assertEquals(actTitle,"Login - EpicDeal");
	}
	
	@Test
	public void isforgotPwdLink() {
		Assert.assertTrue(loginPage.isforgotPwdLinkExist());
	}
	
	@Test
	public void getLoginPageUrlTest() {
		String loginUrl = loginPage.getLoginPageUrl();
		System.out.println("Login page url is: " +loginUrl);
	    Assert.assertTrue(loginUrl.contains("/login"));
	}
	@Test
	public void loginTest() {
		loginPage.doLogin("test17072gmail.com", "test@1707");
		
		
	}
}
