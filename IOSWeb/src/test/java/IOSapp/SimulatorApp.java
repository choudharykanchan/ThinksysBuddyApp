package IOSapp;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
public class SimulatorApp {
	Dimension size;
	IOSDriver  driver;
	Utility utl;
	@Test
	public void startBrowser() throws MalformedURLException, InterruptedException
	{
		Boolean text=false;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "xcuitest");
		//cap.setCapability("deviceName", "iPhone");
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
		cap.setCapability(CapabilityType.VERSION, "10.3");
		cap.setCapability(CapabilityType.PLATFORM, "Mac");
		cap.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap.setCapability("deviceName", "iPhone 6 Plus");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("fullReset", true);
		//cap.setCapability("app","/Users/thinksysuser/Desktop/HR Portal.ipa");
		cap.setCapability("bundleId", "com.apple.news");
		cap.setCapability("bundleId", "com.apple.news");
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		utl=new Utility(driver);
		
		if(utl.isExists("name","TECHNOLOGY")==false)
		{
			utl.verticalSwipe("name","TECHNOLOGY");
		}
		
		
		driver.findElementByName("TECHNOLOGY").click();
		
		driver.closeApp();
	}
}


