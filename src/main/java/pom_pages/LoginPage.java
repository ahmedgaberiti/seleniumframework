package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "Email")
	WebElement  emailfield ;
	
	@FindBy(id = "Password")
	WebElement  passwordfield ;
	
	@FindBy(css = "input.button-1.login-button")
	public WebElement  loginbutton ;
	
	public void userlogin (String email , String password) {
		 
		settext(emailfield , email);
		settext(passwordfield , password);
		clickbutton(loginbutton);
	}
	
	







}
