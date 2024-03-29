package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom_pages.ContactUsPage;
import pom_pages.HomePage;

public class ContactUsTest extends TestBase
{
	HomePage home;
	ContactUsPage contactPage;

	String email = "gabora@gmail.com";
	String fullName = "gaber sayed";
	String enquiry = "Hello Admin , this is for test";

	@Test
	public void UserCanUseContactUs() {
		home = new HomePage(driver);
		home.openContactUsPage();
		contactPage = new ContactUsPage(driver);
		contactPage.ContactUs(fullName, email, enquiry);
		 Assert.assertTrue(contactPage.successMessage.getText()
				 .contains("Your enquiry has been successfully sent to the store owner."));
	}

}
