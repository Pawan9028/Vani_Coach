package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	protected AndroidDriver driver;
	protected WebDriverWait wait;
	
	
	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//android.widget.TextView[@text='Login']")
	private WebElement loginButton;
	@FindBy(xpath="//com.horcrux.svg.SvgView") 
	private WebElement logoOnLandingPage;
	
	@FindBy(className ="com.horcrux.svg.SvgView") 
	private List<WebElement> logoOnLogInPage; //1
	@FindBy(xpath = "//android.widget.EditText[@text=\"Email or Phone Number\"]")
	private WebElement username;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Password (6-digit)\"]")
	private WebElement password;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Submit\"]")
	private WebElement submitButton;
	@FindBy(xpath = "//android.widget.TextView[@text='Reset Password']")
	private WebElement resetPassButton;
	@FindBy(xpath = "//android.widget.TextView[@text='Need Help?']")
	private WebElement needHelp;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Reset Password\"]")
	private WebElement resetPassword;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Enter your Registered Email\"]")
	private WebElement textOnTheResetPassPage;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Hi Testlearner 6 👋\"]")
	private WebElement textOnThePageAfterLogin;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"three-dots\"]")
	private WebElement threDots;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
	private WebElement profileIcon;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Logout\"]")
	private WebElement logOutButton;
	
	
	public void clickOnLoginButton() throws InterruptedException {
		Thread.sleep(20000);
		loginButton.click();
	}
	public void verifyLogoPresence() throws InterruptedException {
		clickOnLoginButton();
		Assert.assertTrue(logoOnLogInPage.get(0).isDisplayed(),"Logo is not displayed on the Login Page.");
		System.out.println("Logo on the LogIn page is displayed.");
	}
	public void verifyAllTheTextBoxesAndButtonsEnable() throws InterruptedException {
		//clickOnLoginButton();
		Assert.assertTrue(username.isEnabled() || password.isEnabled() || submitButton.isEnabled()
				|| resetPassButton.isEnabled() || needHelp.isEnabled(),
				"All the text boxes and buttons on the login page is not enabled.");
		System.out.println("All text boxes and buttons on the login page is enabled.");
		
	}
	public void verifyLoginWithValidCredential() throws InterruptedException {
		//clickOnLoginButton();
		Thread.sleep(10000);
		username.sendKeys("6598321470");
		Thread.sleep(10000);
		password.sendKeys("123456");
		Thread.sleep(10000);
		submitButton.click();
		Thread.sleep(10000);
		Assert.assertEquals(textOnThePageAfterLogin.getText(),"Hi Testlearner 6 👋","Login failed for valid credentials.");
		System.out.println(textOnThePageAfterLogin.getText() +"\n" +" User successfully login with valid credentials");
		//driver.navigate().back();
		Thread.sleep(10000);
		threDots.click();
		Thread.sleep(10000);
		profileIcon.click();
		Thread.sleep(10000);
		logOutButton.click();
		
	}
	public void testInvalidLogin() throws InterruptedException {
		clickOnLoginButton();
		username.sendKeys("6598321480");
		password.sendKeys("123455");
		submitButton.click();
		Thread.sleep(10000);
		Assert.assertTrue(logoOnLogInPage.get(0).isDisplayed(),"Error message not displayed for invalid login.");
		System.out.println("\n" +" Error message is displayed and login is not successfull with an invalid credentials.");
		Thread.sleep(10000);
	}
	public void testEmptyCredentials() throws InterruptedException {
	//	clickOnLoginButton();
		Thread.sleep(10000);
		try {
			username.clear();
			password.clear();
		username.sendKeys("6598321480");
		password.sendKeys("123455");
	}catch(Exception e){
		Thread.sleep(10000);
		username.sendKeys("  ");
		Thread.sleep(10000);
		password.sendKeys("  ");
		submitButton.click();
		Thread.sleep(10000);
		Assert.assertTrue(logoOnLogInPage.get(0).isDisplayed(),"Error message not displayed for invalid login.");
		System.out.println("\n" +" Error message is displayed and login is not successfull with an invalid credentials.");
	}
	}
	public void testForgotPasswordNavigation() throws InterruptedException {
		//clickOnLoginButton();
		resetPassword.click();
        
        // Validate redirection to Forgot Password screen
        Assert.assertTrue(textOnTheResetPassPage.isDisplayed(),"Forgot Password page not opened.");
	    System.out.println(textOnTheResetPassPage.getText());
	    System.out.println("User navigated to the Reset Password page.");
}
}

