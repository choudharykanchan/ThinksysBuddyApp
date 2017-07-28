package IOSWeb.IOSWeb;


import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
public class TestIOSSafariBrowser {
	
	@Test
	public void startBrowser() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "xcuitest");
		//cap.setCapability("deviceName", "iPhone");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
		cap.setCapability(CapabilityType.VERSION, "10.3");
		cap.setCapability(CapabilityType.PLATFORM, "Mac");
		cap.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap.setCapability("deviceName", "iPhone 6 Plus");
		cap.setCapability("platformName", "iOS");
		//cap.setCapability("platformVersion", "9.2");
		//cap.setCapability("platformVersion", "10.3");
		//cap.setCapability(CapabilityType.BROWSER_NAME,"Safari");*/
		//cap.setCapability("udid","db5eca08ce9ec68116904070b4440059d40455b3");
		WebDriver  driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.get("http://learn-automation.com");
		System.out.println("Page Title");
		
		
		Thread.sleep(1000);
		//driver.close();
	}

}
