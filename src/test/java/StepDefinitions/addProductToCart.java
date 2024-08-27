package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import comms.CommonPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class addProductToCart {
	
	WebDriver driver = TestRunner.driver;
	
	CartPage cp = new CartPage(driver);
	CommonPages cmp = new CommonPages(driver);

	@When("I choose to add a product to cart")
	public void i_choose_to_add_a_product_to_cart() {		
		cp.AddToCart();
	}

	@When("I navigate to cart")
	public void i_navigate_to_cart() {
		cp.NavigateToCart();
	}

	@Then("I see product is added to cart successfully")
	public void i_see_product_is_added_to_cart_successfully(){
		Assert.assertTrue(cp.IsItemPresentInCart());	
	}
}
