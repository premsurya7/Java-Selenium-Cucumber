package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;	
	
	By btnAddToCart = (By.xpath("//div[@class='inventory_container']/div/div/div[@class='pricebar']/button"));	
	By lnkCart = (By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
	By btnRemove = By.xpath("//button[@class='btn_secondary cart_button']");
	
	public CartPage (WebDriver driver) {		
		this.driver = driver;		
	}
	
	public void AddToCart() {
		Thread.sleep(5000);
		driver.findElement(btnAddToCart).click();
	}
	
	public void NavigateToCart() {
		driver.findElement(lnkCart).click();
	}
	
	public boolean IsItemPresentInCart() {
		return driver.findElement(lnkCart).isDisplayed();
	}	
	
	public By getCartPageElement() {
		return btnAddToCart;
	}
}
