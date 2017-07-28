package SetUps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class LaunchApp {
	
	public static IOSDriver iOS()
	{   IOSDriver driver=null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "xcuitest");
		cap.setCapability(CapabilityType.VERSION, "10.3");
		cap.setCapability(CapabilityType.PLATFORM, "Mac");
		cap.setCapability("udid","7145DF73-1337-45A1-9B46-35FC600CD35A");
		cap.setCapability("deviceName", "iPhone 6 Plus");
		cap.setCapability("platformName", "iOS");
		//cap.setCapability("fullReset", true);
		cap.setCapability("bundleId", "com.thinksys.thinksysPortal");
		try {
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return driver;
	}

}
