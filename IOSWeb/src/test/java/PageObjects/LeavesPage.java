package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LeavesPage {
	AppiumDriver driver;
	WebElement element;
	List<WebElement> elements;
	List<String> leaveDetails;
	public LeavesPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	    //static text[1]=leave number,static text[2]=leave date,static text[3]=month ago,static text[4]=No of leaves,static text[5]=Approved or rejected,static text6]=Type of leave
		//XCUIElementTypeCell[1]= first leave,cell 2=second leave etc.
	@iOSFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	public List<WebElement> firstLeaveDetails;
	@iOSFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	public List<WebElement> SecondLeaveDetails;
	@iOSFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	public List<WebElement> thirdLeaveDetails;
	
	public String getleavedetails(String DetailType, String leaveNumber)
	{
		switch(DetailType)
		{
		case "leaveId":
		 element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[1]"));
			break;  
			
		case "leaveDate":
			element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[2]"));
			break;
		case "monthAgo":
			element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[3]"));
			break;
			
		case "number":
			element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[4]"));
			break;
		case "status":
			element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[5]"));
			break;
		case "type":
			element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[6]"));
			break;
			
		}
		 String desiredValue =element.getText();
		 return desiredValue;
	}
	public List<String> allDetailsOfLeave(String leaveNumber)
	{
		
		elements=driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText"));
		leaveDetails=new ArrayList<String>();
	for(int i=0;i< elements.size();i++)
	{
	
		String detail=elements.get(i).getText();
		leaveDetails.add(detail);
		
	}
	
	return leaveDetails;
	}
	
	
	public List<String> totalLeavesInMonth(String MonthName)
	{
		//"//*[contains(@id,'ui_3_12_0_1_1430')]/a"
		//"//*[contains(@name,'Jun 2017')]"
	//elements=driver.findElementsByXPath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell::decendent"")
	elements=driver.findElementsByXPath("//*[contains(@name,'"+MonthName+"')]");
	
	leaveDetails=new ArrayList<String>();
	for(int i=0;i<elements.size();i++)
	{
		String detail=elements.get(i).getText();
		leaveDetails.add(detail);
	}
	return leaveDetails;
	}
	
	public List<String> totalLeavesInYear(String year)
	{
		//"//*[contains(@id,'ui_3_12_0_1_1430')]/a"
		//"//*[contains(@name,'Jun 2017')]"
	//elements=driver.findElementsByXPath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell::decendent"")
	elements=driver.findElementsByXPath("//*[contains(@name,'"+year+"')]");
	
	leaveDetails=new ArrayList<String>();
	for(int i=0;i<elements.size();i++)
	{
		String detail=elements.get(i).getText();
		leaveDetails.add(detail);
	}
	return leaveDetails;
	}
	
	public List<String> getDetailedDescriptionOfLeave(String leaveNumber)
	{
		element=driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+leaveNumber+"]/XCUIElementTypeStaticText[1]"));
		element.click();
		elements=driver.findElementsByXPath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/descendant::XCUIElementTypeStaticText");
		for(int i=0;i<elements.size();i++)
		{
			String detail=elements.get(i).getText();
			leaveDetails.add(detail);
		}
		return leaveDetails;
	
	}
}
