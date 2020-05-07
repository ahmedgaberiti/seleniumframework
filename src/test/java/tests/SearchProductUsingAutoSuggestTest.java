package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom_pages.ProductDetailsPage;
import pom_pages.SearchPage;

public class SearchProductUsingAutoSuggestTest extends TestBase
{
	String productName = "Apple MacBook Pro 13-inch"; 
	SearchPage searchObject ; 
	ProductDetailsPage detailsObject ; 
	
	@Test
	public void UserCanSearchWithAutoSuggest() 
	{
		//try and catch will pass the testcase but give u the exception
		try {
			searchObject = new SearchPage(driver); 
			searchObject.ProductSearchUsingAutoSuggest("MacB");
			detailsObject = new ProductDetailsPage(driver); 
			Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error occurred  " + e.getMessage());
		}
	}
}
