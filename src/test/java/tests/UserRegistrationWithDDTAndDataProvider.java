package tests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.UserRegisteration;

public class UserRegistrationWithDDTAndDataProvider extends TestBase
{
	HomePage homeObject ; 
	UserRegisteration registerObject ; 
	LoginPage loginObject ; 


	@DataProvider(name="testData")
	public static Object[][] userData()
	{
		return new Object[][] {
			{"Moataz" , "Nabil","testxxx996@gmail.com","123456"},
			{"Ahmed","Ali","testuser1270073@gmail.com","12345678"}
		};
	}

	@Test(priority=1,dataProvider="testData")
	public void UserCanRegisterSuccssfully(String fname, String lname , String email , String password ) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(fname,lname,email,password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.logoutpage();
		homeObject.openloginpage();
		loginObject = new LoginPage(driver); 
		loginObject.userlogin(email, password);
		Assert.assertTrue(registerObject.logoutlink.getText().contains("Log out"));
		registerObject.logoutpage();
	}

}
