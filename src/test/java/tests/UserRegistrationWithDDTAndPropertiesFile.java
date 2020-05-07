package tests;




import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperties;
import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.UserRegisteration;

public class UserRegistrationWithDDTAndPropertiesFile extends TestBase
{
	HomePage homeObject ; 
	UserRegisteration registerObject ; 
	LoginPage loginObject ; 
	String firtname = LoadProperties.userData.getProperty("firstname");
	String lastname = LoadProperties.userData.getProperty("lastname"); 
	String email = LoadProperties.userData.getProperty("email"); 
	String Password = LoadProperties.userData.getProperty("password"); 

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
	
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(firtname,lastname,email,Password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}
	
	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void RegisteredUserCanLogout() 
	{
		registerObject.logoutpage();
	}
	
	@Test(dependsOnMethods= {"RegisteredUserCanLogout"})
	public void RegisteredUserCanLogin() 
	{
		homeObject.openloginpage();
		loginObject = new LoginPage(driver); 
		loginObject.userlogin(email,Password);
		Assert.assertTrue(registerObject.logoutlink.getText().contains("Log out"));
	}
}
