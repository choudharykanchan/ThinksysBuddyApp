package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SettingsSubMenu {
	public SettingsSubMenu(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText")
	public  WebElement name;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	public  WebElement designation;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[3]")
	public  WebElement e_mail;
	
	@iOSFindBy(accessibility="Home")
	public  WebElement home;

	@iOSFindBy(accessibility="Profile")
	public  WebElement profile;
	
	@iOSFindBy(accessibility="Attendance")
	public  WebElement attendance;
	
	@iOSFindBy(accessibility="Leaves")
	public  WebElement leaves;
	
	@iOSFindBy(accessibility="Holidays")
	public  WebElement holidays;
	
	@iOSFindBy(accessibility="Logout")
	public  WebElement logout;
	
	@iOSFindBy(accessibility="Menu")
	public  WebElement menu;
	
}
