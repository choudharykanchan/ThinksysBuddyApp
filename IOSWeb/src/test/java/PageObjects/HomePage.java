package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePage {
	public HomePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(id="ThinksysLogo")
	public  WebElement logo;
	
	@iOSFindBy(accessibility="Login")
	
	public WebElement loginButton;
	
	public void verifyThinksysLogo()
	{
		if(logo.isDisplayed())
			System.out.println("Launch the thinksysapp successfully");
		else
			System.out.println("Failed to launch thinksys app");;
	
	}
	
	public void clickLoginButton()
{
		loginButton.click();
	}

}
