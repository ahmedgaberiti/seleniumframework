package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.UserRegisteration;

public class UserRegistrationTest extends TestBase {
	HomePage homepage;
	UserRegisteration registeration;
	LoginPage  login ;
	

	@Test(priority = 1 , alwaysRun =true)
	public void userregisterationsuccessfully () {
		homepage= new HomePage(driver);
		registeration = new UserRegisteration(driver);
		homepage.openregistrationpage();
		registeration.userregistration("gaberooo", "sayed", "gaboreaooo@gmail.com", "1234567");
		Assert.assertTrue(registeration.registermessage.getText().contains("Your registration completed"));
	}


	@Test(dependsOnMethods = {"userregisterationsuccessfully"})
	public void registeredusercanlogout () {
		registeration.logoutpage();
	}
	
	@Test(dependsOnMethods = {"registeredusercanlogout"})
	public void registredusercanlogin () {
		homepage.openloginpage();
		login =new LoginPage(driver);
		login.userlogin("gaboreaooo@gmail.com",  "1234567");
		Assert.assertTrue(registeration.logoutlink.getText().contains("Log out"));
		
	}













}
