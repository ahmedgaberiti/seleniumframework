package tests;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pom_pages.HomePage;
import pom_pages.LoginPage;
import pom_pages.UserRegisteration;

public class UserRegistrationTestWithDDTAndExcel extends TestBase
{
	HomePage homeObject ; 
	UserRegisteration registerObject ; 
	LoginPage loginObject ; 

	@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}

	@Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
	public void UserCanRegisterSuccssfully(String firstname , String lastname , String email , String password) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(firstname,lastname,email,password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.logoutpage();
		homeObject.openloginpage();
		loginObject = new LoginPage(driver); 
		loginObject.userlogin(email,password);
		Assert.assertTrue(registerObject.logoutlink.getText().contains("Log out"));
		registerObject.logoutpage();
	}

}
