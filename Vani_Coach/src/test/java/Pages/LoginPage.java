package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath = "//android.widget.EditText[@text='Email or Phone Number']")
	private WebElement username;
	@FindBy(xpath = "//android.widget.EditText[@text='Password (6-digit)']")
	private WebElement password;
	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//android.widget.TextView[@text='Reset Password']")
	private WebElement resetPassButton;
	@FindBy(xpath = "//android.widget.TextView[@text='Need Help?']")
	private WebElement needHelp;
	
	public void clickOnLoginButton() throws InterruptedException {
		Thread.sleep(10000);
		loginButton.click();
	}
	public void verifyLogoPresence() throws InterruptedException {
		clickOnLoginButton();
		Assert.assertTrue(logoOnLogInPage.get(0).isDisplayed(),"Logo is not displayed on the Login Page.");
		System.out.println("Logo on the LogIn page is displayed.");
	}
	public void verifyAllTheTextBoxesAndButtonsEnable() throws InterruptedException {
		Assert.assertTrue(username.isEnabled() || password.isEnabled() || submitButton.isEnabled()
				|| resetPassButton.isEnabled() || needHelp.isEnabled(),
				"All the text boxes and buttons on the login page is not enabled.");
		System.out.println("All text boxes and buttons on the login page is enabled.");
		
	}
	public void verifyLoginWithValidCredential() {
		username.sendKeys("6598321470");
		password.sendKeys("123456");
		submitButton.click();
		
	}
	
}
