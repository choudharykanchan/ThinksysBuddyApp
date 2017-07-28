package IOSapp;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class Utility {
	IOSDriver   driver;
	Utility(IOSDriver d)
	{
		driver=d;
	}
	
	public void verticalSwipe(String locatorType, String locatorValue)
	{
		
		Dimension size;
		size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.90);
		int endy = (int) (size.height * 0.10);
		int startx = size.width / 2;
		boolean text=false;
		
		int counter=0;
		while(isExists(locatorType,locatorValue)==false && counter<10)
		{
			counter++;
	        driver.swipe(startx, starty, startx, endy, 6000);
		
		}
		
		
	}
	
	public boolean isExists(String locatorType, String locatorValue)
	{
		boolean flag=true;
		
		try{
		
		switch(locatorType)
		{
		case "id":
			driver.findElementByAccessibilityId(locatorValue);
	    break;
	    
		case "xpath":
		    driver.findElementByXPath(locatorValue);
		break;
		
		case "name":
			driver.findElementByName(locatorValue);
		break;
		
		case "link":
			driver.findElementByLinkText(locatorValue);
			
		break;	
			
		}
		}
		
		catch(Exception NoSuchElementException)
		{
			flag=false;
		}
		return flag;
		
		
	}
	
	

}
