package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.HomePage;
import tests.TestBase;
import pom_pages.UserRegisteration;

public class UserRegisterationn extends TestBase {
	HomePage homeObject ; 
	UserRegisteration registerObject ;
	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
		homeObject = new HomePage(driver); 
		homeObject.openregistrationpage();

	}

	@When("I click on register link")
	public void i_click_on_register_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	/*@When("I entered user data")
	public void i_entered_user_data() {
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration("Moataz", "Nabil", "moataz@test.com", "12345678");

	}*/
	
	@When("^I entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		registerObject = new UserRegisteration(driver); 
		registerObject.userregistration(firstname, lastname,email,password);
	}


	@Then("The registration page displayed successfully")
	public void the_registration_page_displayed_successfully() {
		registerObject.logoutpage();
		
	}

}
