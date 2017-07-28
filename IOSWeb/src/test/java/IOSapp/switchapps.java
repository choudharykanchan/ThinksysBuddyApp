package IOSapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class switchapps {
	public void startBrowser() throws MalformedURLException, InterruptedException
	{
		Boolean text=false;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "xcuitest");
		cap.setCapability(CapabilityType.VERSION, "10.3");
		cap.setCapability(CapabilityType.PLATFORM, "Mac");
		cap.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap.setCapability("deviceName", "iPhone 6 Plus");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("bundleId", "com.apple.news");
		IOSDriver  driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.findElementByName("XCTestWDUITests").click();
		driver.quit();
		
		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setCapability("automationName", "xcuitest");
		cap1.setCapability(CapabilityType.VERSION, "10.3");
		cap1.setCapability(CapabilityType.PLATFORM, "Mac");
		cap1.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap1.setCapability("deviceName", "iPhone 6 Plus");
		cap1.setCapability("platformName", "iOS");
		cap1.setCapability("bundleId", "com.apple.news");
		IOSDriver  driver1 = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap1);
		driver.findElementByName("XCTestWDUITests").click();
		driver.quit();
		
		IOSDriver  driver2 = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
 
}
}