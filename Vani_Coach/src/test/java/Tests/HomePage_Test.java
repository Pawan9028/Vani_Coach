package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;

public class HomePage_Test extends BaseClass{
	
	HomePage obj;
	
	@BeforeTest
	public void loadObject() {
		 obj = new HomePage(driver);
	}
	@Test(priority=1)
	public void verifyLearnerNameAndTextBelowTheName() throws InterruptedException {
		obj.verifyLearnerNameAndTextBelowTheName();
	}
	@Test(priority=2)
	public void testHeaderIcons() throws InterruptedException {
		obj.testHeaderIcons();
	}
	@Test(priority=3)
	public void verifyWeeksProgressBar() throws InterruptedException {
		obj.verifyLearnerNameAndTextBelowTheName();
	}
	@Test(priority=4)
	public void verifyStartPracticeTabRedirection() throws InterruptedException {
		obj.verifyStartPracticeTabRedirection();
	}
	@Test(priority=5)
	public void verifyTheScoreAndTimeStampChart() throws InterruptedException {
		obj.verifyTheScoreAndTimeStampChart();
	}
	@Test(priority=6)
	public void verifyMyStreakSection() throws InterruptedException {
		obj.verifyMyStreakSection();
	}
	@Test(priority=7)
	public void verifyAIsection() throws InterruptedException {
		obj.verifyAIsection();
	}
	
	@Test(priority=8)
	public void verifyMeetYourCoachSection() throws InterruptedException {
		obj.verifyMeetYourCoachSection();
	}
	@Test(priority=9)
	public void verifyCoachFeedbackVideosSection() throws InterruptedException {
		obj.verifyCoachFeedbackVideosSection();
	}
	@Test(priority=10)
	public void verifyFooterTabdRedirection() throws InterruptedException {
		obj.verifyFooterTabdRedirection();
	}
}
