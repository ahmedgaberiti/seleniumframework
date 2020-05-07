package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {


	public HomePage(WebDriver driver) {
		super(driver);
		//JavascriptExecutor jse = (JavascriptExecutor) driver;  

	}

	//WebElement Registerlink =driver.findElement(By.xpath("//a[@class='ico-register']"));

	@FindBy(linkText = "Register")
	WebElement Registerlink ;

	@FindBy(linkText = "Log in")
	WebElement loginlink ;
	
	@FindBy(linkText="Contact us")
	WebElement contactUsLink ; 
	
	@FindBy(id="customerCurrency")
	WebElement currencydrl; 
	
	@FindBy(linkText="Computers")
	WebElement ComputerMenu; 
	
	@FindBy(linkText="Notebooks")
	WebElement NotbooksMenu; 


	
	


	
	public void openregistrationpage () {

		clickbutton(Registerlink);
	}

	public void openloginpage () {

		clickbutton(loginlink);
	}
	
	public void openContactUsPage() 
	
	{
		//scrollToBottom();
		clickbutton(contactUsLink);
	}


	
	
	





}
