package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage {
	
	public LoginPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(accessibility="Username")
	public  WebElement userName;
	
	@iOSFindBy(accessibility="Password")
	public  WebElement passwordField;
	
	
	@iOSFindBy(accessibility="Login")
	public WebElement loginButton;
	
	   public void login(String username, String password)
	{
		userName.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}
	
	
}
