package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ProfilePage {
	public ProfilePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	public  WebElement profileName;
	
	//get i=7 for emailid and move on
	@iOSFindBy(xpath="//XCUIElementTypeTable[1]/descendant::XCUIElementTypeCell/XCUIElementTypeStaticText")
	public  List<WebElement> employeedetails;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	public  List<WebElement> managerdetails;
	
	@iOSFindBy(accessibility="resmail")
	public  WebElement mailButton;
	
	@iOSFindBy(accessibility="rescall")
	public  WebElement callButton;
	
	@iOSFindBy(accessibility="resMsg")
	public  WebElement msgButton;
	
	@iOSFindBy(accessibility="NO")
	public  WebElement noButton;
}


