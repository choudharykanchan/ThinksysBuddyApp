package Testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomeAfterLogin;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import SetUps.LaunchApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class HomePageTestcases {
	AppiumDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	 WebDriverWait wait;

@BeforeTest
public void setup()
{
driver= LaunchApp.iOS();
//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

}

	public void goToLoginPage() throws InterruptedException
	{
	homepage= new HomePage(driver);
	//driver.findElementByName("Login").click();
	 //wait = new WebDriverWait(driver,30);
     //wait.until(ExpectedConditions.visibilityOf(homepage.loginButton));
		homepage.verifyThinksysLogo();
		homepage.clickLoginButton();
		Thread.sleep(5000);

	}
@Test
public void loginToHRPrortal()
{
	loginpage = new LoginPage(driver);
	
	loginpage.login("choudhary.kanchan", "@9868060371");
	
}
	
@AfterTest
public void tearUp()
{
	driver.closeApp();
	
}
	

}
