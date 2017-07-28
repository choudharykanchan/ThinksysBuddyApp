package Testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomeAfterLogin;
import PageObjects.LeavesPage;
import PageObjects.ProfilePage;
import PageObjects.SettingsSubMenu;
import SetUps.LaunchApp;
import io.appium.java_client.AppiumDriver;

public class verifyProfile {
	AppiumDriver driver;
	HomeAfterLogin homeAfterLogin;
	SettingsSubMenu settingsSubMenu;
	ProfilePage profilePage;
	LeavesPage leavePage;
	@BeforeTest
	public void setup()
	{
		driver= LaunchApp.iOS();
		
		 homeAfterLogin= new HomeAfterLogin(driver);
		 settingsSubMenu= new SettingsSubMenu(driver);
	     profilePage=new ProfilePage(driver);
	    leavePage=new LeavesPage(driver);
	}
	/*@Test
	public void verifyemplyeedetails()
	{
	
		
		homeAfterLogin.settingsIcon.click();
		settingsSubMenu.profile.click();
		List<WebElement> employeeDetails=profilePage.employeedetails;
		for(int i=7,j=1;i< employeeDetails.size();i += 2,j++)
		{
			
			
			System.out.println("No: "+j);
			System.out.println(employeeDetails.get(i).getText());
			System.out.println(employeeDetails.get(i+1).getText());
		}
	}*/
		/*@Test
		public void verifyManagerDetails()
		{*/
		/*homeAfterLogin.settingsIcon.click();
			settingsSubMenu.profile.click();*/
			//List<WebElement> managerDetails=profilePage.managerdetails;
			//System.out.println("IN VerifiyManager");
			/*for(int i=0,j=1;i< managerDetails.size();i += 2,j++)
			{
				
				
				System.out.println("No: "+j);
				System.out.println(managerDetails.get(i).getText());
				System.out.println(managerDetails.get(i+1).getText());
			}
			*/
			/*for(int i=0;i<=managerDetails.size();i++)
			{
				
				
				//System.out.println("No: "+j);
				System.out.println(managerDetails.get(i).getText());
				//System.out.println(managerDetails.get(i+1).getText());
			}*/
			
			/*profilePage.msgButton.click();
			profilePage.noButton.click();
			profilePage.callButton.click();
			profilePage.noButton.click();
		profilePage.mailButton.click();
		profilePage.noButton.click();
		}*/
			

}