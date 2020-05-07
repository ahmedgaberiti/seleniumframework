package tests;



import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.UserRegisteration;

public class UserRegistrationTestWithDDTAndJSON extends TestBase
{
	
	HomePage homeObject ; 
	UserRegisteration registerObject ; 
	LoginPage loginObject ; 

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() throws IOException, ParseException 
	{
		JsonDataReader jsonReader = new JsonDataReader(); 
		jsonReader.JsonReader();
		
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(jsonReader.firstname,jsonReader.lastname,jsonReader.email,jsonReader.password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.logoutpage();
		homeObject.openloginpage();
		loginObject = new LoginPage(driver); 
		loginObject.userlogin(jsonReader.email, jsonReader.password);
		Assert.assertTrue(registerObject.logoutlink.getText().contains("Log out"));
		registerObject.logoutpage();
	}

}
