package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("medtoumi007@gmail.com");
		login.EnterPassword("med123");
		login.ClickLoginButton();
		System.out.println("Title of the page is : "+driver.getTitle());
	}

}
