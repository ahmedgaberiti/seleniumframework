package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisteration extends PageBase {
	
	
	public UserRegisteration(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "gender-male")
	WebElement gendermalebtn ;
	
	@FindBy(id = "FirstName")
	WebElement firstnamefield ;	
	
	@FindBy(id = "LastName")
	WebElement lastnamefield ;
	
	@FindBy(id = "Email")
	WebElement emailfield ;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasswordfield ;	
	
	@FindBy(id = "Password")
	WebElement passwordfield ;
	
	@FindBy(id = "register-button")
	WebElement registerbutton ;	
	
	@FindBy(css="div.result")
	public WebElement registermessage ;
	
	@FindBy(linkText="My account")
	WebElement myAccountLink; 
	
	@FindBy(linkText = "Log out")
	public WebElement logoutlink ;
	
	@FindBy(css="div.result")
	public WebElement successMessage ; 

	
	public void userregistration (String firstname,String lastname,String email,String password) 
	{
		
		clickbutton(gendermalebtn);
		settext(firstnamefield , firstname);
		settext(lastnamefield , lastname);
		settext(emailfield , email);
		settext(passwordfield , password);
		settext(confirmpasswordfield , password);
		clickbutton(registerbutton);
	}
	
	
	public void openMyAccountPage() 
	{
		clickbutton(myAccountLink);
	}
	
	public void logoutpage () {

		clickbutton(logoutlink);
	}
	
	
	
	

}
