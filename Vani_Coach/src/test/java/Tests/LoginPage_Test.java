package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPage_Test extends BaseClass{
	
	LoginPage obj;
	
	@BeforeTest
	public void loadObject() {
		obj = new LoginPage(driver);
	}
	@Test(priority=1)
	public void verifyLogo() throws InterruptedException {
		obj.verifyLogoPresence();
	}
	@Test(priority=2)
	public void verifyTextBoxesAndButtonsEnable() throws InterruptedException {
		obj.verifyAllTheTextBoxesAndButtonsEnable();
	}
	@Test(priority=3)
	public void verifyLoginWithValidCredential() throws InterruptedException {
		obj.verifyLoginWithValidCredential();
	}
	@Test(priority=4)
	public void testInvalidLogin() throws InterruptedException {
		obj.testInvalidLogin();
	}
	@Test(priority=5)
	public void testEmptyCredentials() throws InterruptedException {
		obj.testEmptyCredentials();
	}
	@Test(priority=6)
	public void testForgotPasswordNavigation() throws InterruptedException{
		obj.testForgotPasswordNavigation();
	}

}
