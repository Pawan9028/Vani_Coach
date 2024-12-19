package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	protected AndroidDriver driver;
   
	@BeforeTest
	public void setUp() throws MalformedURLException {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appium:automationName", "UiAutomator2");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability("appium:platformVersion", "15");
		caps.setCapability("appium:deviceName", "PawanEmulator");
		//caps.setCapability(MobileCapabilityType.UDID, "");
		caps.setCapability("appium:newCommandTimeout", 60);
		caps.setCapability("appium:appPackage", "com.vanilearner");
        caps.setCapability("appium:appActivity", "com.vanilearner.MainActivity");
        caps.setCapability("appium:autoGrantPermissions",true);
        
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url,caps);
        
        
		}catch(Exception exp){
		System.out.println("cause is : "+exp.getCause());	
		System.out.println("Message is : "+exp.getMessage());
		exp.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
		driver.quit();
	}
}
