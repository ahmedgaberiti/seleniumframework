package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver ;

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
		

	}


	protected static void clickbutton(WebElement button) {

		button.click();
	}

	protected static void settext (WebElement text , String value) {
		
		text.sendKeys(value);
	}

	/*public void scrollToBottom() 
	
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,2500)");
	}
	*/
	public void clearText(WebElement element) 
	{
		element.clear();
	}














}
