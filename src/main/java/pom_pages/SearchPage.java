package pom_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase 
{
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="small-searchterms")
	WebElement searchTextBox ; 

	@FindBy(css="input.button-1.search-box-button")
	WebElement searchBtn ; 

	@FindBy(id="ui-id-1")
	List<WebElement> ProductList ; 

	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement productTitle; 

	public void ProductSearch(String productName) 
	{
		settext(searchTextBox, productName);
		clickbutton(searchBtn);
	}

	public void OpenProductDetailsPage() 
	{
		clickbutton(productTitle);
	}

	public void ProductSearchUsingAutoSuggest(String searchTxt) 
	{
		settext(searchTextBox, searchTxt);
		// try and catch for thread.sleep -> wait
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ProductList.get(0).click();
	}

}
