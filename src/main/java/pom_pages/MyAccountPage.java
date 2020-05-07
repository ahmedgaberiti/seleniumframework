package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends PageBase{
	
		public MyAccountPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(linkText="Change password")
		WebElement changePasswordLink ; 
		
		@FindBy(id = "OldPassword")
	    WebElement oldPasswordTxt;
		
	    @FindBy(id = "NewPassword")
	    WebElement newPasswordTxt;
	    
	    @FindBy(id = "ConfirmNewPassword")
	    WebElement confirmPasswordTxt;
	    
	    @FindBy(css = "input.button-1.change-password-button")
	    WebElement ChangePasswordBtn;
	    
	    @FindBy(css = "div.result")
	    public WebElement resultLbl;
		
		public void openChangePasswordPage() 
		{
			clickbutton(changePasswordLink);
		}

		public void ChangePassword(String oldpassword, String newpassword) {
	        settext(oldPasswordTxt, oldpassword);
	        settext(newPasswordTxt, newpassword);
	        settext(confirmPasswordTxt, newpassword);
	        clickbutton(ChangePasswordBtn);
	    }

	}










