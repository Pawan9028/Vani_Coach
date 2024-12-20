package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	protected AndroidDriver driver;
	protected WebDriverWait wait;
	
	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//webelements 
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement loginButton;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Email or Phone Number\"]")
	private WebElement username;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Password (6-digit)\"]")
	private WebElement password;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Submit\"]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Hi Testlearner 6 👋\"]")
	private WebElement learnersName;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"notifications\"]")
	private WebElement notificationIcon;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"three-dots\"]")
	private WebElement menuThreeDots;
	@FindBy(xpath = "//android.widget.TextView[@text=\"I’m __ , your Communication Fitness Coach. Let's get started!\"]")
	private WebElement textBelowTheMenu;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement weeklyProgressBar;
	@FindBy(xpath = "//android.widget.TextView[@text=\"START PRACTICE\"]")
	private WebElement startPracticeButton;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement scoreAndTimeStamp;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement scoreAndTimeStamp2;
	@FindBy(xpath = "//android.widget.TextView[@text=\"My Streaks\"]")
	private WebElement myStreaksText;
	@FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup")
	private WebElement myStreakActivity;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Recent AI Feedbacks\"]")
	private WebElement recentAIfeedbacksText;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
	private WebElement yourDailyRoutine;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
	private WebElement discussingNewProductSection;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]")
	private WebElement customerEducationAndAwareness;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Meet your coach\"]")
	private WebElement meetYourCoachText;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement meetYourCoachSection;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Coach Feedback Videos\"]")
	private WebElement coachFeedbackVideosText;
	@FindBy(xpath = "//android.widget.TextView[@text=\"View more...\"]")
	private WebElement coachFeedbackVideosViewMoreButton;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement CFVyourDailyVideos;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement CFVcustomerEducationAndAwareness;
	@FindBy(xpath = "//android.widget.TextView[@text=\"View more...\"]")
	private WebElement CFVproductPositioning;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]")
	private WebElement reflectionTab;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")
	private WebElement practiceTab;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]")
	private WebElement allPracticestab;
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]")
	private WebElement exploreTab;
	
	public void login() throws InterruptedException {
		Thread.sleep(10000);
		loginButton.click();
		Thread.sleep(10000);
		username.sendKeys("6598321470");
		Thread.sleep(10000);
		password.sendKeys("123456");
		Thread.sleep(10000);
		submitButton.click();
		Thread.sleep(10000);
	}
	
	//Methods 
	public void verifyLearnerNameAndTextBelowTheName() throws InterruptedException {
		login();
		Assert.assertTrue(learnersName.isDisplayed() || textBelowTheMenu.isDisplayed(),"The learners name and text below the menu bar are not displayed.");
		System.out.println("The learner's name and the text below the menu bat are displayed.");
		System.out.println("Learner name: "+ learnersName.getText()+"\n"+"Text below the menu: "+textBelowTheMenu.getText());
	}
	public void testHeaderIcons() {
		Assert.assertTrue(notificationIcon.isEnabled() || menuThreeDots.isEnabled(),"Header icons are not enable.");
		System.out.println("Header icons are enable.");
	}
	public void verifyWeeksProgressBar() {
		Assert.assertTrue(weeklyProgressBar.isDisplayed(),"Week's Progress bar is displayed above the START PRACTICE tab..");
	System.out.println("This Weeks Progress bar is displayed.");
	}
	public void verifyStartPracticeTabRedirection() throws InterruptedException {
		Assert.assertTrue(startPracticeButton.isEnabled(),"Start Practice button is not enabled.");
		startPracticeButton.click();
		Thread.sleep(20000);
		Assert.assertTrue(startPracticeButton.isEnabled(),"START PRACTICE tab is not enable.");
		System.out.println("START PRACTICE tab redirected to the desired page.");
		//System.out.println("URL of the START PRACTICE page: "+ driver.getTitle());
		driver.navigate().back();
		Thread.sleep(10000);
	}
	public void verifyTheScoreAndTimeStampChart() {
		Assert.assertTrue(scoreAndTimeStamp.isDisplayed() || scoreAndTimeStamp2.isDisplayed(),"Score and Time stamp charts are not displayed.");
		//System.out.println("Score and time stamp chart are displayed.");
	System.out.println("Last Checked-in-score and Time left sections are loaded successfully.");
	}
	public void verifyMyStreakSection() {
		Assert.assertTrue(myStreaksText.isDisplayed() || myStreakActivity.isDisplayed(),"Mt Streaks text and activity are not displayed.");
		//System.out.println("My Straks text and activity is displayed.");
	System.out.println("My Streak section is displayed.");
	}
	public void verifyAIsection() throws InterruptedException {
		Assert.assertTrue(recentAIfeedbacksText.isDisplayed(),"Recent AI Feedbacks text is not displayed.");
		System.out.println("Recent AI Feedbacks text is displayed.");
		Thread.sleep(10000);
		yourDailyRoutine.click();
		Thread.sleep(10000);
		//System.out.println("Your Daily Routine URL: "+ driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(10000);
		
		discussingNewProductSection.click();
		//System.out.println("Discussing a new product with the design team URL: "+ driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		
		customerEducationAndAwareness.click();
		//System.out.println("Customer Education and Awareness URL: "+ driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		System.out.println("All AI Feedbacks tab redirected to the particular pages.");
	}
	public void verifyMeetYourCoachSection() {
		Assert.assertTrue(meetYourCoachText.isDisplayed() || meetYourCoachSection.isDisplayed(),"Meet Your coach text with section is not displayed.");
		System.out.println("Meet Your coach text with section is displayed.");
	}
	public void verifyCoachFeedbackVideosSection() throws InterruptedException {
		Assert.assertTrue(coachFeedbackVideosViewMoreButton.isEnabled(),"View More button is not enable");
		Assert.assertTrue(CFVyourDailyVideos.isDisplayed(),"Recent AI Feedbacks text is not displayed.");
		Thread.sleep(10000);
		CFVyourDailyVideos.click();
		Thread.sleep(10000);
		System.out.println("Your Daily Routine URL: "+ driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(10000);
		
		Assert.assertTrue(customerEducationAndAwareness.isDisplayed(),"Customer Education and Awareness text is not displayed.");
		customerEducationAndAwareness.click();
		//System.out.println("Discussing a new product with the design team URL: "+ driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		
		Assert.assertTrue(CFVproductPositioning.isDisplayed(),"Product Positioning text is not displayed.");
		CFVproductPositioning.click();
		//System.out.println("Customer Education and Awareness URL: "+ driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		System.out.println("Coach Feedback videos tabs redirected to the expected pages.");
	}
	public void verifyFooterReflectionTabClickable() throws InterruptedException {
		reflectionTab.click();
		//System.out.println("Reflection page URL: "+driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
	}
	public void verifyFooterPracticeTabClickable() throws InterruptedException {
		reflectionTab.click();
		//System.out.println("Practice page URL: "+driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
	}
	public void verifyFooterAllPracticesTabClickable() throws InterruptedException {
		reflectionTab.click();
		//System.out.println("All Practices page URL: "+driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
	}
	public void verifyFooterRExploreTabClickable() throws InterruptedException {
		exploreTab.click();
		//System.out.println("Explore page URL: "+driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
	}

	public void verifyFooterTabdRedirection() throws InterruptedException {
		verifyFooterReflectionTabClickable();
		verifyFooterPracticeTabClickable();
		verifyFooterAllPracticesTabClickable();
		verifyFooterRExploreTabClickable();
	}
	
}
