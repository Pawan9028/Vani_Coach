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
	@Test
	public void verifyLogo() throws InterruptedException {
		obj.verifyLogoPresence();
	}
	@Test
	public void verifyTextBoxesAndButtonsEnable() throws InterruptedException {
		obj.verifyAllTheTextBoxesAndButtonsEnable();
	}

}
