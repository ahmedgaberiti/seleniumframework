package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.MyAccountPage;
import pom_pages.UserRegisteration;

public class MyAccountTest extends TestBase
{
	HomePage homeObject ; 
	UserRegisteration registerObject ; 
	LoginPage loginObject ; 
	MyAccountPage myAccountObject ; 
	String oldPassword = "12345678" ; 
	String newPassword = "123456" ; 
	String firstName = "hamda" ; 
	String lastName = "hamda2" ; 
	String email = "test399@gmail.com" ; 
	

	@Test(priority=1)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(firstName, lastName, email, oldPassword);
		Assert.assertTrue(registerObject.registermessage.getText().contains("Your registration completed"));
	}
	
	@Test(priority=2)
	public void RegisteredUserCanChangePassword() 
	{
		myAccountObject = new MyAccountPage(driver) ; 
		registerObject.openMyAccountPage();  
		myAccountObject.openChangePasswordPage();
		myAccountObject.ChangePassword(oldPassword, newPassword);
		Assert.assertTrue(myAccountObject.resultLbl.getText().contains("Password was changed"));
	}
	
	@Test(priority=3)
	public void RegisteredUserCanLogout() 
	{
		registerObject.logoutpage();
	}
	
	@Test(priority=4)
	public void RegisteredUserCanLogin() 
	{
		homeObject.openloginpage();
		loginObject = new LoginPage(driver); 
		loginObject.userlogin(email, newPassword);
		Assert.assertTrue(registerObject.logoutlink.getText().contains("Log out"));
	}
	
	@Test(priority=5)
	public void UserLogout() 
	{
		registerObject.logoutpage();
	}
	
}
