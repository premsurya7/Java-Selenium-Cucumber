package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchProductsPage;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class SearchProductsSteps {
	
	WebDriver driver = TestRunner.driver;
	
	String firstItemPrice;
	String firstItemPriceAfterSort;
	
	SearchProductsPage spp = new SearchProductsPage(driver);
	
	@When("I choose to search based on drop down")
	public void i_choose_to_search_based_on_drop_down() throws InterruptedException {		
		firstItemPrice = spp.getFirstItemPrice();	    
	    spp.clickSearchProductDropdown();	    
	    spp.selectDropdownValue("Price (low to high)");
	    firstItemPriceAfterSort = spp.getFirstItemPrice();	  
	}
	
	@Then("I see products displayed")
	public void i_see_products_displayed() throws InterruptedException {		
	    Assert.assertTrue((!firstItemPrice.equalsIgnoreCase(firstItemPriceAfterSort)));	    
	}
}
