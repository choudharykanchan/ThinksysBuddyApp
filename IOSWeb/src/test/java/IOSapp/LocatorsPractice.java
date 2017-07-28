package IOSapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class LocatorsPractice {
	@Test
	public void startBrowser() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "xcuitest");
		cap.setCapability("version","10.3");
		cap.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap.setCapability("deviceName", "iPhone 6 Plus");
		cap.setCapability("platformName", "iOS");
		//cap.setCapability("bundleId", "com.apple.news");
		cap.setCapability("app","/Users/thinksysuser/Desktop/HR Portal.ipa");
		
	
		IOSDriver  driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
	driver.close();
	}

}
